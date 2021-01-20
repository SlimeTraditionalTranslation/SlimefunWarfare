package io.github.seggan.slimefunwarfare;

import io.github.seggan.slimefunwarfare.georesources.Arsenic;
import io.github.seggan.slimefunwarfare.items.Bullet;
import io.github.seggan.slimefunwarfare.items.Grenade;
import io.github.seggan.slimefunwarfare.items.Gun;
import io.github.seggan.slimefunwarfare.items.NuclearBomb;
import io.github.seggan.slimefunwarfare.lists.Explosives;
import io.github.seggan.slimefunwarfare.lists.Guns;
import io.github.seggan.slimefunwarfare.lists.Items;
import io.github.seggan.slimefunwarfare.machines.AirLiquefier;
import io.github.seggan.slimefunwarfare.machines.BulletPress;
import io.github.seggan.slimefunwarfare.machines.ExplosiveSynthesizer;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Setup {
    
    private Setup() {}
    
    static void setupItems(SlimefunWarfare addon) {
        new SlimefunItem(Items.sfwarfareCategory, Items.SLIMESTEEL, RecipeType.SMELTERY, new ItemStack[]{
            SlimefunItems.STEEL_INGOT, new ItemStack(Material.SLIME_BALL), null,
            null, null, null,
            null, null, null
        }).register(addon);
        new SlimefunItem(
            Items.sfwarfareCategory, Items.REINFORCED_SLIMESTEEL, RecipeType.SMELTERY, new ItemStack[]{
            Items.SLIMESTEEL, new ItemStack(Material.SLIME_BLOCK), SlimefunItems.DAMASCUS_STEEL_INGOT,
            SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT,
            null, null, null
        }).register(addon);
        new VanillaItem(
            Items.sfwarfareCategory, new ItemStack(Material.GUNPOWDER),
            "GUNPOWDER", RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.SULFATE, new ItemStack(Material.BONE_MEAL), new ItemStack(Material.CHARCOAL),
            null, null, null,
            null, null, null
        }).register(addon);
        new SlimefunItem(
            Items.sfwarfareCategory, Items.PYRO_POWDER, RecipeType.GRIND_STONE, new ItemStack[]{
            new ItemStack(Material.TNT), null, null,
            null, null, null,
            null, null, null
        }, new SlimefunItemStack(Items.PYRO_POWDER, 4)).register(addon);
        new SlimefunItem(Items.sfwarfareCategory, Items.SCOPE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.PLASTIC_SHEET, SlimefunItems.MULTIMETER, SlimefunItems.PLASTIC_SHEET,
            SlimefunItems.HARDENED_GLASS, null, SlimefunItems.HARDENED_GLASS,
            SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET
        }).register(addon);
        new SlimefunItem(Items.sfwarfareCategory, Items.BARREL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            Items.SLIMESTEEL, Items.SLIMESTEEL, Items.SLIMESTEEL,
            null, null, null,
            Items.SLIMESTEEL, Items.SLIMESTEEL, Items.SLIMESTEEL
        }).register(addon);
        new SlimefunItem(
            Items.sfwarfareCategory, Items.ADVANCED_BARREL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            Items.REINFORCED_SLIMESTEEL, Items.REINFORCED_SLIMESTEEL, Items.REINFORCED_SLIMESTEEL,
            Items.BARREL, Items.BARREL, Items.BARREL,
            Items.REINFORCED_SLIMESTEEL, Items.REINFORCED_SLIMESTEEL, Items.REINFORCED_SLIMESTEEL
        }).register(addon);
    }
    
    static void setupBullets(SlimefunWarfare addon) {
        new BulletPress().register(addon);
        new Bullet(Items.IRON_BULLET, new ItemStack(Material.IRON_INGOT), 0.75, false).register(addon);
        new Bullet(Items.LEAD_BULLET, SlimefunItems.LEAD_INGOT, 1, false).register(addon);
        new Bullet(Items.DU_BULLET, SlimefunItems.SMALL_URANIUM, 1.5, true).register(addon);
        new Bullet(Items.GOLD_BULLET, SlimefunItems.GOLD_12K, 2, false).register(addon);
        new Bullet(Items.TRINITROBULLETENE, Items.PYRO_POWDER, 2.75, true).register(addon);
    }
    
    static void setupGuns(SlimefunWarfare addon) {
        new SlimefunItem(Items.sfwarfareCategory, Items.GUN_CASE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            Items.SLIMESTEEL, new ItemStack(Material.GUNPOWDER), Items.SLIMESTEEL,
            Items.SLIMESTEEL, new ItemStack(Material.FLINT_AND_STEEL), Items.SLIMESTEEL,
            SlimefunItems.PLASTIC_SHEET, new ItemStack(Material.CROSSBOW), SlimefunItems.PLASTIC_SHEET
        }).register(addon);

        new Gun(Guns.PISTOL, new ItemStack[] {
            null, Items.SLIMESTEEL, null,
            null, Items.GUN_CASE, Items.SLIMESTEEL,
            null, Items.SLIMESTEEL, new ItemStack(Material.STICK)
        }, 7, 4, 0.75).register(addon);

        new Gun(Guns.REVOLVER, new ItemStack[] {
            null, Items.SLIMESTEEL, null,
            null, Guns.PISTOL, Items.SLIMESTEEL,
            null, Items.SLIMESTEEL, null
        }, 10, 6, 0.5).register(addon);

        new Gun(Guns.MACHINE_GUN, new ItemStack[] {
            Items.SLIMESTEEL, Items.SCOPE, null,
            Items.BARREL, Guns.REVOLVER, Items.SLIMESTEEL,
            Items.SLIMESTEEL, Items.SLIMESTEEL, SlimefunItems.PLASTIC_SHEET
        }, 30, 5, 6, 0.15).register(addon);

        new Gun(Guns.MINIGUN, new ItemStack[]{
            Items.REINFORCED_SLIMESTEEL, Items.SCOPE, Items.REINFORCED_SLIMESTEEL,
            Items.ADVANCED_BARREL, Guns.MACHINE_GUN, Items.REINFORCED_SLIMESTEEL,
            Items.REINFORCED_SLIMESTEEL, SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET
        }, 40, 5, 8, 0).register(addon);

        new Gun(Guns.RIFLE, new ItemStack[]{
            null, Items.SCOPE, null,
            Items.BARREL, Items.GUN_CASE, Items.SLIMESTEEL,
            null, Items.SLIMESTEEL, SlimefunItems.PLASTIC_SHEET
        }, 40, 5, 8, 0.75).register(addon);

        new Gun(Guns.SHOTGUN, new ItemStack[]{
            Items.SLIMESTEEL, Items.SLIMESTEEL, null,
            Items.BARREL, Items.BARREL, Items.GUN_CASE,
            Items.SLIMESTEEL, Items.SLIMESTEEL, SlimefunItems.PLASTIC_SHEET
        }, 25, 5, 13, 1.25).register(addon);

        new Gun(Guns.ASSAULT_RIFLE, new ItemStack[]{
            Items.SLIMESTEEL, Items.SCOPE, new ItemStack(Material.OAK_PLANKS),
            Items.BARREL, Guns.RIFLE, Items.REINFORCED_SLIMESTEEL,
            Items.SLIMESTEEL, Items.SLIMESTEEL, SlimefunItems.PLASTIC_SHEET
        }, 50, 3, 13, 0.3).register(addon);

        new Gun(Guns.SNIPER, new ItemStack[]{
            null, Items.REINFORCED_SLIMESTEEL, Items.REINFORCED_SLIMESTEEL,
            Items.ADVANCED_BARREL, Items.ADVANCED_BARREL, Guns.ASSAULT_RIFLE,
            new ItemStack(Material.STICK), Items.REINFORCED_SLIMESTEEL, SlimefunItems.PLASTIC_SHEET
        }, 130, 50, 22, 8).register(addon);
    }

    static void setupExplosives(SlimefunWarfare addon) {
        new AirLiquefier().register(addon);
        new ExplosiveSynthesizer().register(addon);

        new SlimefunItem(Items.sfwarfareCategory, Explosives.REINFORCED_CONCRETE, RecipeType.SMELTERY,
            new ItemStack[]{
                SlimefunItems.IRON_DUST, new ItemStack(Material.GRAY_CONCRETE_POWDER), null,
                null, null, null,
                null, null, null
        }).register(addon);

        new SlimefunItem(Items.sfwarfareExplosivesCategory, Items.LIQUID_AIR, AirLiquefier.RECIPE_TYPE,
            new ItemStack[]{
                SlimefunItems.TIN_CAN, null, null,
                null, null, null,
                null, null, null
            }).register(addon);

        new SlimefunItem(
            Items.sfwarfareExplosivesCategory, Items.LIQUID_NITROGEN, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                Items.LIQUID_AIR, Items.LIQUID_AIR, Items.LIQUID_AIR,
                Items.LIQUID_AIR, Items.LIQUID_AIR, Items.LIQUID_AIR,
                Items.LIQUID_AIR, Items.LIQUID_AIR, Items.LIQUID_AIR
            }, new SlimefunItemStack(Items.LIQUID_NITROGEN, 4)).register(addon);

        new SlimefunItem(
            Items.sfwarfareExplosivesCategory, Items.PURIFIED_LIQUID_NITROGEN, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                Items.LIQUID_NITROGEN, Items.LIQUID_NITROGEN, Items.LIQUID_NITROGEN,
                Items.LIQUID_NITROGEN, Items.LIQUID_NITROGEN, Items.LIQUID_NITROGEN,
                Items.LIQUID_NITROGEN, Items.LIQUID_NITROGEN, Items.LIQUID_NITROGEN
            }, new SlimefunItemStack(Items.PURIFIED_LIQUID_NITROGEN, 4)).register(addon);

        new SlimefunItem(
            Items.sfwarfareExplosivesCategory, Explosives.NITROGEN_TRIIODIDE, ExplosiveSynthesizer.RECIPE_TYPE,
            new ItemStack[]{
                Items.LIQUID_NITROGEN, new ItemStack(Material.DRIED_KELP), null,
                null, null, null,
                null, null, null
        }).register(addon);

        new SlimefunItem(
            Items.sfwarfareExplosivesCategory, Explosives.AZIDOAZIDE_AZIDE, ExplosiveSynthesizer.RECIPE_TYPE,
            new ItemStack[]{
                Items.PURIFIED_LIQUID_NITROGEN, new ItemStack(Material.COAL), null,
                null, null, null,
                null, null, null
        }).register(addon);

        new SlimefunItem(
            Items.sfwarfareExplosivesCategory, Explosives.ARSENIC, RecipeType.GEO_MINER, new ItemStack[9]
        ).register(addon);

        new Arsenic(Explosives.ARSENIC).register();

        new SlimefunItem(
            Items.sfwarfareExplosivesCategory, Explosives.EMPTY_GRENADE, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                Items.PYRO_POWDER, SlimefunItems.STEEL_INGOT, Items.PYRO_POWDER,
                SlimefunItems.STEEL_INGOT, SlimefunItems.TIN_CAN, SlimefunItems.STEEL_INGOT,
                Items.PYRO_POWDER, SlimefunItems.STEEL_INGOT, Items.PYRO_POWDER,
            },
        new SlimefunItemStack(Explosives.EMPTY_GRENADE, 4)).register(addon);

        new Grenade(Explosives.NITROGEN_TRIIODIDE).register(addon);
        new Grenade(Explosives.AZIDOAZIDE_AZIDE).register(addon);
        new Grenade(Explosives.ARSENIC).register(addon);
        new Grenade(Items.PYRO_POWDER).register(addon);
        new Grenade(Explosives.THIOACETONE).register(addon);

        new NuclearBomb(Items.sfwarfareExplosivesCategory, Explosives.NUCLEAR_BOMB, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.URANIUM, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.URANIUM, new ItemStack(Material.NETHER_STAR), SlimefunItems.URANIUM,
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.URANIUM, SlimefunItems.BLISTERING_INGOT_3
            }).register(addon);
    }
}
