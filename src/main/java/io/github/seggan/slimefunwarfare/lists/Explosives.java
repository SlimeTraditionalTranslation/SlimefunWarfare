package io.github.seggan.slimefunwarfare.lists;

import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Explosives {

    public static final SlimefunItemStack THIOACETONE = new SlimefunItemStack(
        "THIOACETONE",
        Material.BROWN_DYE,
        "&6硫丙酮",
        "&7聞起來非常臭"
    );

    private Explosives() {}

    public static final SlimefunItemStack NITROGEN_TRIIODIDE = new SlimefunItemStack(
        "NITROGEN_TRIIODIDE",
        Material.PURPLE_DYE,
        "&5三碘化氮",
        "&7一種手榴彈的材料"
    );

    public static final SlimefunItemStack AZIDOAZIDE_AZIDE = new SlimefunItemStack(
        "AZIDOAZIDE_AZIDE",
        Material.SUGAR,
        "&e疊氮化碳",
        "&7一種手榴彈的材料"
    );

    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "ARSENIC",
        Material.GUNPOWDER,
        "&7砷",
        "&7一種手榴彈的材料"
    );

    public static final SlimefunItemStack EMPTY_GRENADE = new SlimefunItemStack(
        "GRENADE",
        Material.SNOWBALL,
        "&7化學手榴彈",
        "&7內容物: 無"
    );

    public static final SlimefunItemStack REINFORCED_CONCRETE = new SlimefunItemStack(
        "REINFORCED_CONCRETE",
        Material.GRAY_CONCRETE,
        "&7鋼筋混凝土",
        "&7防爆的混凝土"
    );

    public static final SlimefunItemStack NUCLEAR_BOMB = new SlimefunItemStack(
        "NUCLEAR_BOMB",
        Material.TNT,
        "&7核彈",
        "&7KABOOM!"
    );
}
