package io.github.seggan.slimefunwarfare.lists;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public final class Items {

    // region explosives
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
        "&7KABOOM!",
        LoreBuilder.radioactive(Radioactivity.VERY_DEADLY)
    );
    // endregion

    // region general
    public static final SlimefunItemStack BORAX = new SlimefunItemStack(
        "BORAX",
        Material.QUARTZ,
        "&f硼砂",
        "",
        "&7從石頭上掉下來的一種常見礦物"
    );
    public static final SlimefunItemStack BORON = new SlimefunItemStack(
        "BORON",
        Material.CHARCOAL,
        "&7硼"
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
        "",
        LoreBuilder.powerPerSecond(16),
        LoreBuilder.powerBuffer(32),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack AIR_LIQUEFIER = new SlimefunItemStack(
        "AIR_LIQUEFIER",
        Material.BEACON,
        "&b空氣液化器",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack EXPLOSIVE_SYNTHESIZER = new SlimefunItemStack(
        "EXPLOSIVE_SYNTHESIZER",
        Material.TNT,
        "&4爆炸物合成器",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack BOOMINATOR_9000 = new SlimefunItemStack(
        "BOOMINATOR_9000",
        Material.SMITHING_TABLE,
        "&4Boominator 9000",
        "",
        "&7用於處理核彈的鈾",
        LoreBuilder.powerPerSecond(1024),
        LoreBuilder.powerBuffer(2048),
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7鐵子彈",
        "",
        "&7x0.75傷害"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7鉛彈",
        "",
        "&7x1傷害"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&a鈾子彈",
        "",
        "&7使命中生物時著火",
        "&7x1.5傷害"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6黃金子彈",
        "",
        "&7x2傷害"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6三硝基丁烯",
        "",
        "&7使命中生物時著火",
        "&7x2.75傷害"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7槍外殼",
        "",
        "&7所有槍的基礎"
    );

    public static final SlimefunItemStack OSMIUM_METEOR = new SlimefunItemStack(
        "OSMIUM_METEOR",
        Material.IRON_ORE,
        "&9鋨隕石",
        "",
        "&7稀有金屬的來源"
    );

    public static final SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack(
        "OSMIUM_DUST",
        Material.SUGAR,
        "&9鋨粉",
        "",
        "&7劇毒. 不要吸入!"
    );

    public static final SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack(
        "OSMIUM_INGOT",
        Material.IRON_INGOT,
        "&9鋨錠",
        "",
        "&7一個僅在太空中發現的非常強的金屬"
    );

    public static final SlimefunItemStack OSMIUM_SUPERALLOY = new SlimefunItemStack(
        "OSMIUM_SUPERALLOY",
        Material.IRON_INGOT,
        "&9鋨超級合金",
        "",
        "&7最堅硬, 最堅韌, 最堅固的材料",
        "&7在 Minecraft種類"
    );

    public static final SlimefunItemStack SEGGANESSON_METEOR = new SlimefunItemStack(
        "SEGGANESSON_METEOR",
        Material.DIAMOND_ORE,
        "&7Segganesson 隕石",
        "",
        "&7稀有元素segganesson的來源"
    );

    public static final SlimefunItemStack SEGGANESSON = new SlimefunItemStack(
        "SEGGANESSON",
        Material.LIGHT_BLUE_DYE,
        "&bSegganesson",
        "",
        "&7一種非常有潛力為整個城市供電",
        "&7的稀有元素"
    );

    public static final SlimefunItemStack ENERGY_RECTIFIER = new SlimefunItemStack(
        "ENERGY_RECTIFIER",
        Material.POWERED_RAIL,
        "&b能量整流器",
        "",
        "&7將電能轉化成純能源"
    );

    public static final SlimefunItemStack METEOR_ATTRACTOR = new SlimefunItemStack(
        "METEOR_ATTRACTOR",
        HeadTexture.MAGNET,
        "&f流星吸引器",
        "",
        "&7一個強大的磁鐵, 它可以",
        "&7從太空中吸引流星"
    );

    public static final SlimefunItemStack ELEMENTAL_REACTOR = new SlimefunItemStack(
        "ELEMENTAL_REACTOR",
        HeadTexture.GENERATOR,
        "&b元素反應器",
        "",
        "&7產生容量從",
        "&7豐富非專利能量元素",
        "&7和 Segganesson",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(32_768),
        LoreBuilder.powerPerSecond(32_768)
    );

    public static final SlimefunItemStack FIBER_OPTIC_GLASS = new SlimefunItemStack(
        "FIBER_OPTIC_GLASS",
        Material.BLUE_STAINED_GLASS,
        "&f光纖玻璃"
    );

    public static final SlimefunItemStack FIBER_OPTIC_CABLE = new SlimefunItemStack(
        "FIBER_OPTIC_CABLE",
        Material.STRING,
        "&f光纖電線"
    );

    public static final SlimefunItemStack LASER_DIODE = new SlimefunItemStack(
        "LASER_DIODE",
        Heads.LASER,
        "&4雷射二極體"
    );

    public static final SlimefunItemStack ULTRA_MAGNET = new SlimefunItemStack(
        "ULTRA_MAGNET",
        HeadTexture.MAGNET.getTexture(),
        "&f超級磁鐵"
    );

    public static final SlimefunItemStack RADIO = new SlimefunItemStack(
        "RADIO",
        Material.REDSTONE_TORCH,
        "&f無線電",
        "",
        "&7拿著這個與其他有這個在它們",
        "&7的背包內的來聊天. 加密鑰匙",
        "&7用於對訊息的 編碼/解碼,",
        "&7因此只有與你使用相同的",
        "&7加密鑰匙才能理解該訊息. 拿著來聊天,",
        "&7右鍵點擊來設置加密鑰匙"
    );
    // endregion

    // region rare earths
    public static final SlimefunItemStack ION_EXCHANGE_SEPARATOR = new SlimefunItemStack(
        "ION_EXCHANGE_SEPARATOR",
        Material.SEA_LANTERN,
        "&b離子交換分離器",
        "",
        "&7分離出難以分離的",
        "&7獨居石中的稀土",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(256),
        LoreBuilder.powerBuffer(512)
    );

    public static final SlimefunItemStack MONAZITE = new SlimefunItemStack(
        "MONAZITE",
        Material.ORANGE_DYE,
        "&e獨居石",
        "",
        "&7所有稀土的來源.",
        "&7在火成岩中找到它"
    );

    public static final SlimefunItemStack LANTHANUM_INGOT = new SlimefunItemStack(
        "LANTHANUM_INGOT",
        Material.IRON_INGOT,
        "&e鑭錠",
        "",
        "&7可以用作於無限的打火石"
    );

    public static final SlimefunItemStack NEODYMIUM_INGOT = new SlimefunItemStack(
        "NEODYMIUM_INGOT",
        Material.NETHERITE_INGOT,
        "&e釹錠"
    );

    public static final SlimefunItemStack GADOLINIUM_INGOT = new SlimefunItemStack(
        "GADOLINIUM_INGOT",
        Material.IRON_INGOT,
        "&e釓錠"
    );

    public static final SlimefunItemStack TERBIUM_INGOT = new SlimefunItemStack(
        "TERBIUM_INGOT",
        Material.IRON_INGOT,
        "&e鋱錠"
    );

    public static final SlimefunItemStack DYSPROSIUM_INGOT = new SlimefunItemStack(
        "DYSPROSIUM_INGOT",
        Material.NETHERITE_INGOT,
        "&e鏑錠"
    );

    public static final SlimefunItemStack HOLMIUM_INGOT = new SlimefunItemStack(
        "HOLMIUM_INGOT",
        Material.BRICK,
        "&e鈥錠"
    );

    public static final SlimefunItemStack ERBIUM_INGOT = new SlimefunItemStack(
        "ERBIUM_INGOT",
        Material.IRON_INGOT,
        "&e鉺錠"
    );

    public static final SlimefunItemStack YTTERBIUM_INGOT = new SlimefunItemStack(
        "YTTERBIUM_INGOT",
        Material.IRON_INGOT,
        "&e鐿錠"
    );

    public static final SlimefunItemStack TERFENOL_D = new SlimefunItemStack(
        "TERFENOL_D",
        Material.IRON_INGOT,
        "&6鋱鐵鏑",
        "",
        "&7這種合金具有在",
        "&7磁場中改變形狀",
        "&7的有趣特性"
    );

    public static final SlimefunItemStack TERFENOL_D_BLOCK = new SlimefunItemStack(
        "TERFENOL_D_BLOCK",
        Material.IRON_BLOCK,
        "&6鋱鐵鏑磚"
    );

    public static final SlimefunItemStack NDFEB_ALLOY = new SlimefunItemStack(
        "NDFEB_ALLOY",
        Material.NETHERITE_INGOT,
        "&6釹鐵硼合金",
        "",
        "&7這種合金是人類已知",
        "&7磁性最強的材料"
    );

    public static final SlimefunItemStack NDFEB_ALLOY_BLOCK = new SlimefunItemStack(
        "NDFEB_ALLOY_BLOCK",
        Material.NETHERITE_BLOCK,
        "&6釹鐵硼合金磚"
    );
    // endregion

    // region suits
    public static final SlimefunItemStack UNPATENTABLIUM = new SlimefunItemStack(
        "UNPATENTABLIUM",
        Material.LIGHT_BLUE_DYE,
        "&b非專利能量元素",
        "",
        "&7對於某些原因,",
        "&7聯邦政府不會讓你",
        "&7擁有此強大的",
        "&7能源來源專利"
    );

    public static final SlimefunItemStack POWER_SUIT_GENERATOR = new SlimefunItemStack(
        "POWER_SUIT_GENERATOR",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFkNWExZmY3Zjk3NmMxYzJlYmQ0ZWY5YTkwYWQ5MTQ2Nzk1YzFjNDRmZGFlNjI5NjQ5NDg0MzRhNzI1NyJ9fX0=",
        "&6動力服發電機",
        "",
        "&7任何動力服的",
        "&7主要中心能源"
    );

    public static final SlimefunItemStack ELEMENT_FORGE = new SlimefunItemStack(
        "ELEMENT_FORGE",
        Material.SMITHING_TABLE,
        "&c元素鍛造台",
        "",
        "&7用於製作新的元素",
        "&c多重方快結構"
    );

    public static final SlimefunItemStack POWER_SUIT_HELMET = new SlimefunItemStack(
        "POWER_SUIT_HELMET",
        Heads.SUIT_HELMET,
        "&4動力服頭盔",
        "",
        "&7強大裝甲的一部份",
        "&7被設計為可以修改的.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_CHESTPLATE = new SlimefunItemStack(
        "POWER_SUIT_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.MAROON,
        "&4動力服胸甲",
        "",
        "&7強大裝甲的一部份",
        "&7被設計為可以修改的.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_LEGGINGS = new SlimefunItemStack(
        "POWER_SUIT_LEGGINGS",
        Material.LEATHER_LEGGINGS, Color.MAROON,
        "&4動力服護腿",
        "",
        "&7強大裝甲的一部份",
        "&7被設計為可以修改的.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_BOOTS = new SlimefunItemStack(
        "POWER_SUIT_BOOTS",
        Material.LEATHER_BOOTS, Color.MAROON,
        "&4動力服靴子",
        "",
        "&7強大裝甲的一部份",
        "&7被設計為可以修改的.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );

    public static final SlimefunItemStack MODULE_MANIPULATOR = new SlimefunItemStack(
        "MODULE_MANIPULATOR",
        Material.CRAFTING_TABLE,
        "&f模塊操縱器",
        "",
        "&7允許你安裝, 解除安裝",
        "&7和查看模塊"
    );

    public static final SlimefunItemStack MODULE_CASE = new SlimefunItemStack(
        "MODULE_CASE",
        Heads.MODULE,
        "&6模塊框架"
    );
    // endregion

    // region guns
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
        "&7射程比步槍短",
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
    // endregion

    // region melee
    public static final SlimefunItemStack ENERGY_BLADE = new SlimefunItemStack(
        "ENERGY_BLADE",
        Material.DIAMOND_SWORD,
        "&b能量刃",
        "",
        "&7在某些圈子中被稱為 \"光劍\",",
        "&7這把先進的刀是使用純淨能量來",
        "&7切過活體組織",
        "",
        "&9每次擊中消耗 5J",
        LoreBuilder.powerCharged(0, 2500),
        "",
        "&7在慣用手時:",
        "&2 14 攻擊傷害",
        "&2 1.6 攻擊速度"
    );
    public static final SlimefunItemStack BATTLE_AXE = new SlimefunItemStack(
        "BATTLE_AXE",
        Material.IRON_AXE,
        "&6&l戰斧",
        "",
        "&7這把斧頭是為戰鬥而設計. 不再有令人煩厭的冷卻時間!",
        "",
        "&7在慣用手時:",
        "&2 9 攻擊傷害",
        "&2 1.6 攻擊速度"
    );
    public static final SlimefunItemStack OSMIUM_SWORD = new SlimefunItemStack(
        "OSMIUM_SWORD",
        Material.IRON_SWORD,
        "&6鋨劍",
        "",
        "&7握起來很重",
        "",
        "&7在慣用手時:",
        "&2 10 攻擊傷害",
        "&2 1.6 攻擊速度"
    );
    public static final SlimefunItemStack DUMMY = new SlimefunItemStack(
        "DUMMY",
        Material.HUSK_SPAWN_EGG,
        "&f假人生怪蛋",
        "",
        "&7右鍵點擊來生成一個假人; 當你擊中它的時候",
        "&7它將會告訴你, 你造成了多少傷害.",
        "&7在右鍵一次將它破壞"
    );
    // endregion

    static {
        ENERGY_BLADE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);

        ItemMeta meta = Items.ENERGY_BLADE.getItemMeta();
        meta.setUnbreakable(true);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            13,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        ENERGY_BLADE.setItemMeta(meta);

        // Sets the attack speed to match that of a sword
        meta = BATTLE_AXE.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackSpeed",
            -2.4,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            8,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        BATTLE_AXE.setItemMeta(meta);

        OSMIUM_SWORD.addUnsafeEnchantment(Enchantment.DURABILITY, 8);

        meta = OSMIUM_SWORD.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            9,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        OSMIUM_SWORD.setItemMeta(meta);
    }
}
