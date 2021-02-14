package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Explosives {

    private Explosives() {
    }

    public static final SlimefunItemStack PYRO_POWDER = new SlimefunItemStack(
        "PYRO_POWDER",
        Material.REDSTONE,
        "&4火焰兵粉",
        "",
        "&7一種極易爆炸的物質"
    );

    public static final SlimefunItemStack LIQUID_AIR = new SlimefunItemStack(
        "LIQUID_AIR",
        HeadTexture.TIN_CAN,
        "&f液態空氣",
        "",
        "&7不要碰!"
    );

    public static final SlimefunItemStack LIQUID_NITROGEN = new SlimefunItemStack(
        "LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f液氮",
        "",
        "&7誰要點冰淇淋?"
    );

    public static final SlimefunItemStack PURIFIED_LIQUID_NITROGEN = new SlimefunItemStack(
        "PURIFIED_LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f純化液氮",
        "",
        "&7盡可能純淨"
    );

    public static final SlimefunItemStack LIQUID_OXYGEN = new SlimefunItemStack(
        "LIQUID_OXYGEN",
        HeadTexture.TIN_CAN,
        "&f液氧",
        "",
        "&7提神醒腦"
    );

    public static final SlimefunItemStack FLOX = new SlimefunItemStack(
        "FLOX",
        HeadTexture.TIN_CAN,
        "&fFLOX",
        "",
        "&7燃料+液態氧. 右鍵來去太空",
        "&c請確保點兩次空白鍵當",
        "&c你在傳送的時候繼續落下"
    );

    public static final SlimefunItemStack THIOACETONE = new SlimefunItemStack(
        "THIOACETONE",
        Material.BROWN_DYE,
        "&6硫丙酮",
        "",
        "&7聞起來非常臭"
    );

    public static final SlimefunItemStack NITROGEN_TRIIODIDE = new SlimefunItemStack(
        "NITROGEN_TRIIODIDE",
        Material.PURPLE_DYE,
        "&5三碘化氮",
        "",
        "&7一種手榴彈的材料"
    );

    public static final SlimefunItemStack AZIDOAZIDE_AZIDE = new SlimefunItemStack(
        "AZIDOAZIDE_AZIDE",
        Material.SUGAR,
        "&e疊氮化碳",
        "",
        "&7一種手榴彈的材料"
    );

    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "ARSENIC",
        Material.GUNPOWDER,
        "&7砷",
        "",
        "&7一種手榴彈的材料"
    );

    public static final SlimefunItemStack ENRICHED_URANIUM = new SlimefunItemStack(
        "ENRICHED_URANIUM",
        HeadTexture.BOOSTED_URANIUM,
        "&a濃縮鈾"
    );

    public static final SlimefunItemStack EMPTY_GRENADE = new SlimefunItemStack(
        "GRENADE",
        Material.SNOWBALL,
        "&f化學手榴彈",
        "",
        "&7內容物: 無"
    );

    public static final SlimefunItemStack REINFORCED_CONCRETE = new SlimefunItemStack(
        "REINFORCED_CONCRETE",
        Material.GRAY_CONCRETE,
        "&7鋼筋混凝土",
        "",
        "&7防爆的混凝土"
    );

    public static final SlimefunItemStack NUCLEAR_BOMB = new SlimefunItemStack(
        "NUCLEAR_BOMB",
        Material.TNT,
        "&7核彈",
        "",
        "&7KABOOM!"
    );
}
