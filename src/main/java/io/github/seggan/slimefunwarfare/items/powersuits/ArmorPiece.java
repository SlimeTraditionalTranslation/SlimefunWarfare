package io.github.seggan.slimefunwarfare.items.powersuits;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ArmorPiece {
    HEAD("頭盔"),
    CHEST("胸甲"),
    LEGS("護腿"),
    FEET("靴子");

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
