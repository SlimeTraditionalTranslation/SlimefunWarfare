package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Guns {

    private Guns() {}

    public static final SlimefunItemStack PISTOL = new SlimefunItemStack(
        "GUN_PISTOL",
        Material.CROSSBOW,
        "&7手槍",
        "",
        "&7短射程槍",
        "&7快速重裝.",
        "&7對近距離戰鬥有用.",
        "&c射程: 10",
        "&c傷害: 3格血",
        "&c重新裝載: 0.5秒"
    );

    public static final SlimefunItemStack REVOLVER = new SlimefunItemStack(
        "GUN_REVOLVER",
        Material.CROSSBOW,
        "&7左輪手槍",
        "",
        "&7短射程槍",
        "&7快速重裝.",
        "&7對近距離戰鬥有用.",
        "&c射程: 10",
        "&c傷害: 3格血",
        "&c重新裝載: 0.3秒"
    );

    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7機槍",
        "",
        "&7Pew pew pew",
        "&c射程: 30",
        "&c最短射程: 5",
        "&c傷害: 3格血",
        "&c重新裝載: 0.15秒"
    );

    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7迷你砲機槍",
        "",
        "&7與你的朋友相處",
        "&7的終極設備.",
        "&c射程: 40",
        "&c最短射程: 5",
        "&c傷害: 4格血",
        "&c重新裝載: 無"
    );

    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7步槍",
        "",
        "&7標準步槍.",
        "&c射程: 40",
        "&c最短射程: 5",
        "&c傷害: 4格血",
        "&c重新裝載: 0.75秒"
    );

    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7霰彈槍",
        "",
        "&7射程比步槍短,",
        "&7但傷害更高.",
        "&c射程: 25",
        "&c最短射程: 5",
        "&c傷害: 6.5格血",
        "&c重新裝載: 1.25秒"
    );

    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7突擊步槍",
        "",
        "&7突擊步槍是步槍",
        "&7的衍生品,",
        "&7標準的軍事武器",
        "&c射程: 50",
        "&c最短射程: 3",
        "&c傷害: 6.5格血",
        "&c重新裝載: 0.3秒"
    );

    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7狙擊步槍",
        "",
        "&7終極長距離槍,",
        "&7狙擊手非常強大.",
        "&c射程: 130",
        "&c最短射程: 50",
        "&c傷害: 11格血",
        "&c重新裝載: 8秒"
    );

    public static final SlimefunItemStack ENERGY_RIFLE = new SlimefunItemStack(
        "GUN_ENERGY_RIFLE",
        Material.CROSSBOW,
        "&e能量步槍",
        "",
        "&7終於, 不需要在攜帶子彈!",
        "&c每槍使用5J電力",
        "&c射程: 100",
        "&c傷害: 10格血",
        "&c重新裝載: 0.2秒",
        LoreBuilder.powerCharged(0, 2500),
        "&e注意: 子彈的視覺射出有點偏差",
        "&e但你仍然會擊中目標"
    );
}
