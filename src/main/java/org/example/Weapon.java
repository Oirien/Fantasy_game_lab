package org.example;

public enum Weapon {
    AXE("Axe", 10, DamageType.SLASHING),
    SWORD("Sword", 5, DamageType.SLASHING),
    MAUL("Maul", 12, DamageType.BLUDGEONING),
    SPEAR("Spear", 6, DamageType.PIERCING);

    public int damage;
    public String name;
    public DamageType type;

    Weapon(String name, int damage, DamageType type){}

    public DamageType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
