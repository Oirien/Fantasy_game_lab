package org.example;

public enum Spell {
    FIREBALL("Fireball", 7, DamageType.FIRE),
    ICERAY("Iceray", 4, DamageType.ICE),
    FLAMING_SPHERE("Flaming Sphere", 15, DamageType.FIRE);
    public String name;
    public int damage;
    public DamageType type;

    Spell(String name, int damage, DamageType type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }
}
