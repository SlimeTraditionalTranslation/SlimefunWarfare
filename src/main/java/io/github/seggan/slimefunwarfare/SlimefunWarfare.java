package io.github.seggan.slimefunwarfare;

import com.google.common.collect.Sets;
import io.github.mooy1.infinitylib.AbstractAddon;
//import io.github.mooy1.infinitylib.bstats.bukkit.Metrics;
import io.github.seggan.slimefunwarfare.items.guns.Gun;
import io.github.seggan.slimefunwarfare.items.powersuits.ArmorPiece;
import io.github.seggan.slimefunwarfare.items.powersuits.Module;
import io.github.seggan.slimefunwarfare.items.powersuits.PowerSuit;
import io.github.seggan.slimefunwarfare.listeners.BulletListener;
import io.github.seggan.slimefunwarfare.listeners.ConcreteListener;
import io.github.seggan.slimefunwarfare.listeners.GrenadeListener;
import io.github.seggan.slimefunwarfare.listeners.HitListener;
import io.github.seggan.slimefunwarfare.listeners.ModuleListener;
import io.github.seggan.slimefunwarfare.listeners.NukeListener;
import io.github.seggan.slimefunwarfare.listeners.PyroListener;
import io.github.seggan.slimefunwarfare.listeners.SpaceListener;
import io.github.seggan.slimefunwarfare.lists.Categories;
import io.github.seggan.slimefunwarfare.spacegenerators.SpaceGenerator;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;

public class SlimefunWarfare extends AbstractAddon implements Listener {

    private static SlimefunWarfare instance = null;

    private static final Set<UUID> flying = new HashSet<>();

    @Override
    public void enable() {

        instance = this;

        registerListener(new BulletListener(), new PyroListener(),
            new GrenadeListener(), new ConcreteListener(), new NukeListener(),
            new SpaceListener(), new HitListener(), new ModuleListener(), this);

        Categories.setup(this);

        Setup.setupItems(this);
        Setup.setupMelee(this);
        Setup.setupBullets(this);
        Setup.setupGuns(this);
        Setup.setupExplosives(this);
        Setup.setupSpace(this);
        Setup.setupSuits(this);
        Setup.setupResearches();

        Module.setup(this);

        if (getJavaVersion() < 11) {
            log(Level.WARNING, "你所使用的Java版本小於11! 請使用Java 11 或更高的版本");
        }

        for (World world : Bukkit.getWorlds()) {
            String name = world.getName();
            if (name.endsWith("_nether") || name.endsWith("_the_end") || name.endsWith("_space")) continue;

            World space = Bukkit.getWorld(name + "_space");
            if (space != null) continue;

            if (!SlimefunPlugin.getWorldSettingsService().isWorldEnabled(world)) continue;

            WorldCreator creator = new WorldCreator(name + "_space")
                .seed(world.getSeed())
                .generator(new SpaceGenerator());
            space = creator.createWorld();

            space.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
            space.setGameRule(GameRule.DO_WEATHER_CYCLE, false);
            space.setTime(18000L);
        }

        if (getConfig().getBoolean("guns.autoshoot", true)) {
            // Gun autoshoot task
            scheduleRepeatingSync(() -> {
                for (Player p : getServer().getOnlinePlayers()) {
                    if (p.isSneaking() && !p.isFlying()) {
                        ItemStack stack = p.getInventory().getItemInMainHand();
                        SlimefunItem item = SlimefunItem.getByItem(stack);
                        if (!(item instanceof Gun)) {
                            continue;
                        }
                        Gun gun = (Gun) item;
                        ItemMeta meta = stack.getItemMeta();
                        PersistentDataContainer container = meta.getPersistentDataContainer();
                        long lastUse = container.getOrDefault(Gun.LAST_USE, PersistentDataType.LONG, 0L);
                        long currentTime = System.currentTimeMillis();
                        if ((currentTime - lastUse) < gun.getCooldown()) {
                            continue;
                        }
                        container.set(Gun.LAST_USE, PersistentDataType.LONG, currentTime);
                        stack.setItemMeta(meta);
                        gun.shoot(p, stack);
                    }
                }
            }, 1);
        }

        scheduleRepeatingSync(() -> {
            for (Player p : getServer().getOnlinePlayers()) {
                PlayerInventory inv = p.getInventory();

                ItemStack head = inv.getHelmet();
                Util.ifPowerSuit(head, suit -> process(head, PowerSuit.getModules(head), suit, p));

                ItemStack chest = inv.getChestplate();
                Util.ifPowerSuit(chest, suit -> process(chest, PowerSuit.getModules(chest), suit, p));

                ItemStack legs = inv.getLeggings();
                Util.ifPowerSuit(legs, suit -> process(legs, PowerSuit.getModules(legs), suit, p));

                ItemStack boots = inv.getBoots();
                Util.ifPowerSuit(boots, suit -> process(boots, PowerSuit.getModules(boots), suit, p), () -> {
                    UUID uuid = p.getUniqueId();
                    if (flying.contains(uuid)) {
                        flying.remove(uuid);
                        p.setAllowFlight(false);
                    }
                });
            }
        }, 20);

        if (getConfig().getBoolean("suits.flight-particles", true)) {
            scheduleRepeatingSync(() -> {
                for (UUID uuid : flying) {
                    Player p = getServer().getPlayer(uuid);
                    if (p == null) {
                        flying.remove(uuid);
                        return;
                    }
                    if (p.isFlying()) {
                        p.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, p.getLocation().subtract(0, 1, 0), 20, 0.5, 0.5, 0.5);
                    }
                }
            }, 4);
        }
    }

    @Override
    protected void disable() {
        instance = null;
    }

    //@Nullable
    //@Override
    /*protected Metrics setupMetrics() {
        return new Metrics(this, 9227);
    }*/

    //@Nullable
    //@Override
    /*public String getAutoUpdatePath() {
        return "auto-update";
    }*/

    @Nonnull
    @Override
    protected String getGithubPath() {
        return "xMikux/SlimefunWarfare/master";
    }

    @EventHandler
    public void onPlayerJoin(@Nonnull PlayerJoinEvent e) {
        Player p = e.getPlayer();
        ItemStack boots = p.getInventory().getBoots();
        if (p.getAllowFlight() && SlimefunItem.getByItem(boots) instanceof PowerSuit &&
            Sets.newHashSet(PowerSuit.getModules(boots)).contains(Module.MINI_JETS)) {
            flying.add(p.getUniqueId());
        }
    }

    @EventHandler
    public void onPlayerLeave(@Nonnull PlayerQuitEvent e) {
        flying.remove(e.getPlayer().getUniqueId());
    }

    private static void process(ItemStack stack, Module[] modules, PowerSuit suit, Player p) {
        UUID uuid = p.getUniqueId();

        for (Module module : modules) {
            PotionEffect effect = module.getEffect();
            if (effect != null && suit.getItemCharge(stack) >= module.getPower()) {
                p.addPotionEffect(effect);
                suit.removeItemCharge(stack, module.getPower());
            }

            switch (module) {
                case MINI_JETS:
                    if (!p.getAllowFlight()) {
                        p.setAllowFlight(true);
                        flying.add(uuid);
                    }
                    if (p.isFlying()) {
                        if (suit.getItemCharge(stack) < module.getPower()) {
                            p.setAllowFlight(false);
                            flying.remove(uuid);
                        } else {
                            suit.removeItemCharge(stack, module.getPower());
                        }
                    }
                    break;
                case AUXILIARY_GENERATOR:
                    suit.addItemCharge(stack, module.getPower());
                    break;
            }
        }

        if (suit.getType() == ArmorPiece.FEET && flying.contains(p.getUniqueId()) && !Sets.newHashSet(modules).contains(Module.MINI_JETS)) {
            p.setAllowFlight(false);
            flying.remove(uuid);
        }

        suit.addItemCharge(stack, 5);
    }

    private static int getJavaVersion() {
        String version = System.getProperty("java.version");
        if (version.startsWith("1.")) {
            version = version.substring(2, 3);
        } else {
            int dot = version.indexOf(".");
            if( dot != -1) {
                version = version.substring(0, dot);
            }
        }
        return Integer.parseInt(version);
    }

    public static SlimefunWarfare inst() {
        return instance;
    }
}
