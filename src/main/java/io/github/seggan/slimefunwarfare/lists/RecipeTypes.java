package io.github.seggan.slimefunwarfare.lists;

import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class RecipeTypes {

    public static final RecipeType ELEMENT_FORGE = new RecipeType(
        SlimefunWarfare.inst().getKey("element_forge"),
        Items.ELEMENT_FORGE,
        "&c元素鍛造台",
        "&7用於製作新的元素"
    );

    public static final RecipeType AIR_LIQUEFIER = new RecipeType(
        SlimefunWarfare.inst().getKey("air_liquefier"),
        Items.AIR_LIQUEFIER
    );

    public static final RecipeType BULLET_PRESS = new RecipeType(
        SlimefunWarfare.inst().getKey("bullet_factory"),
        Items.BULLET_PRESS
    );

    public static final RecipeType EXPLOSIVE_SYNTHESIZER = new RecipeType(
        SlimefunWarfare.inst().getKey("explosive_synthesizer"),
        Items.EXPLOSIVE_SYNTHESIZER
    );

    public static final RecipeType BOOMINATOR = new RecipeType(
        SlimefunWarfare.inst().getKey("boominator_9000"),
        Items.BOOMINATOR_9000
    );

    public static final RecipeType ION_SEPARATOR = new RecipeType(
        SlimefunWarfare.inst().getKey("ion_exchange_separator"),
        Items.ION_EXCHANGE_SEPARATOR
    );

    public static final RecipeType METEOR_ATTRACTOR = new RecipeType(
        SlimefunWarfare.inst().getKey("meteor_attractor"),
        Items.METEOR_ATTRACTOR
    );
}
