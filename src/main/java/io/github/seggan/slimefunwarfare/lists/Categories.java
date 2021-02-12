package io.github.seggan.slimefunwarfare.lists;

import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Categories {

    private Categories() {}

    public static final Category GENERAL = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare"),
        new CustomItem(Material.DIAMOND_SWORD, "黏液戰爭")
    );

    public static final Category GUNS = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_guns"),
        new CustomItem(Material.CROSSBOW, "黏液戰爭 - 槍")
    );

    public static final Category MELEE = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_melee"),
        new CustomItem(Material.IRON_AXE, "黏液戰爭 - 近戰武器")
    );

    public static final Category EXPLOSIVES = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_explosives"),
        new CustomItem(Material.TNT, "黏液戰爭 - 爆炸物")
    );

    public static final Category RESOURCES = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_resources"),
        new CustomItem(Material.IRON_ORE, "黏液戰爭 - 資源")
    );
}
