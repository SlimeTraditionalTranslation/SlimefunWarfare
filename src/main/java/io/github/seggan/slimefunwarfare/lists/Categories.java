package io.github.seggan.slimefunwarfare.lists;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import org.bukkit.Material;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class Categories {

    public static final ItemGroup GENERAL = new SubGroup(
        "slimefunwarfare_general",
        new CustomItemStack(Material.DIAMOND_SWORD, "黏液戰爭 - 一般")
    );

    public static final ItemGroup MACHINES = new SubGroup(
        "slimefunwarfare_machines",
        new CustomItemStack(Material.STONECUTTER, "黏液戰爭 - 機器")
    );

    public static final ItemGroup GUNS = new SubGroup(
        "slimefunwarfare_guns",
        new CustomItemStack(Material.CROSSBOW, "黏液戰爭 - 槍")
    );

    public static final ItemGroup MELEE = new SubGroup(
        "slimefunwarfare_melee",
        new CustomItemStack(Material.IRON_AXE, "黏液戰爭 - 近戰武器")
    );

    public static final ItemGroup EXPLOSIVES = new SubGroup(
        "slimefunwarfare_explosives",
        new CustomItemStack(Material.TNT, "黏液戰爭 - 爆炸物")
    );

    public static final ItemGroup RESOURCES = new SubGroup(
        "slimefunwarfare_resources",
        new CustomItemStack(Material.IRON_ORE, "黏液戰爭 - 資源")
    );

    public static final ItemGroup POWER_SUITS = new SubGroup(
        "slimefunwarfare_power_suits",
        new CustomItemStack(PlayerHead.getItemStack(Heads.SUIT_HELMET), "黏液戰爭 - 動力服")
    );

    private static final ItemGroup MAIN = new MultiGroup(
        "slimefunwarfare",
        new CustomItemStack(Material.DIAMOND_SWORD, "黏液戰爭"),
        GENERAL, MACHINES, GUNS, MELEE, EXPLOSIVES, RESOURCES, POWER_SUITS
    );

    public static void setup(SlimefunWarfare addon) {
        MAIN.register(addon);
    }
}
