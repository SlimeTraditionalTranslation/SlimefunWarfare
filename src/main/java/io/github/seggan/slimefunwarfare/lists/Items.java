package io.github.seggan.slimefunwarfare.lists;

import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {
    public static final Category sfwarfareCategory = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare"),
        new CustomItem(Material.DIAMOND_SWORD, "黏液戰爭")
    );
    public static final Category sfwarfareGunsCategory = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_guns"),
        new CustomItem(Material.CROSSBOW, "黏液戰爭 - 槍")
    );
    public static final Category sfwarfareExplosivesCategory = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_explosives"),
        new CustomItem(Material.TNT, "黏液戰爭 - 爆炸物")
    );

    public static final SlimefunItemStack SLIMESTEEL = new SlimefunItemStack(
        "SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a黏液鋼錠",
        "",
        "堅硬但有彈性,這種合金",
        "非常適合各種應用"
    );

    public static final SlimefunItemStack REINFORCED_SLIMESTEEL = new SlimefunItemStack(
        "REINFORCED_SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a強化黏液鋼錠",
        "",
        "堅硬但有彈性,這種合金",
        "非常適合各種應用"
    );

    public static final SlimefunItemStack SCOPE = new SlimefunItemStack(
        "SCOPE",
        Material.STICK,
        "&a瞄準鏡"
    );

    public static final SlimefunItemStack BARREL = new SlimefunItemStack(
        "BARREL",
        Material.STICK,
        "&7槍管"
    );

    public static final SlimefunItemStack ADVANCED_BARREL = new SlimefunItemStack(
        "ADVANCED_BARREL",
        Material.STICK,
        "&7進階槍管"
    );

    public static final SlimefunItemStack BULLET_PRESS = new SlimefunItemStack(
        "BULLET_PRESS",
        Material.SMOKER,
        "&7子彈製造機",
        LoreBuilder.powerPerSecond(16),
        LoreBuilder.powerBuffer(32),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack AIR_LIQUEFIER = new SlimefunItemStack(
        "AIR_LIQUEFIER",
        Material.BEACON,
        "&bAir Liquefier",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack EXPLOSIVE_SYNTHESIZER = new SlimefunItemStack(
        "EXPLOSIVE_SYNTHESIZER",
        Material.TNT,
        "&4Explosive Synthesizer",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7鐵子彈",
        "&7x0.75傷害"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7鉛彈",
        "&7x1傷害"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&a鈾子彈",
        "&7使命中生物時著火",
        "&7x1.5傷害"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6黃金子彈",
        "&7x2傷害"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6三硝基丁烯",
        "&7使命中生物時著火",
        "&7x2.75傷害"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7槍外殼",
        "&7所有槍的基礎"
    );

    public static final SlimefunItemStack PYRO_POWDER = new SlimefunItemStack(
        "PYRO_POWDER",
        Material.REDSTONE,
        "&4火焰兵粉",
        "&7一種極易爆炸的物質"
    );

    public static final SlimefunItemStack LIQUID_AIR = new SlimefunItemStack(
        "LIQUID_AIR",
        HeadTexture.TIN_CAN,
        "&fLiquid Air",
        "&7Don't touch!"
    );

    public static final SlimefunItemStack LIQUID_NITROGEN = new SlimefunItemStack(
        "LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&fLiquid Nitrogen",
        "&7Ice cream anyone?"
    );

    public static final SlimefunItemStack PURIFIED_LIQUID_NITROGEN = new SlimefunItemStack(
        "PURIFIED_LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&fPurified Liquid Nitrogen",
        "&7As pure as can be"
    );
}
