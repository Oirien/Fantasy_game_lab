package org.example;

public enum Spell {
    FIREBALL("Fireball", 7),
    ICERAY("Iceray", 4),
    FLAMING_SPHERE("Flaming Sphere", 15);
    public String name;
    public int damage;

    Spell(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
