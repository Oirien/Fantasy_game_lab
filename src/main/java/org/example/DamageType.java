package org.example;

public enum DamageType {
    FIRE("Fire"),
    ICE("Ice"),
    POISON("Poison"),
    LIGHTNING("Lightning"),
    ACID("Acid"),
    NECROTIC("Necrotic"),
    RADIANT("Radiant"),
    FORCE("Force"),
    PSYCHIC("Psychic"),
    THUNDER("Thunder"),
    BLUDGEONING("Bludgeoning"),
    PIERCING("Piercing"),
    SLASHING("Slashing");

    String name;

    DamageType(String name) {
        this.name = name;
    }
}
