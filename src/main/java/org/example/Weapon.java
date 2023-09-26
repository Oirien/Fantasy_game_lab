package org.example;

public enum Weapon {
    AXE("Axe", 10),
    SWORD("Sword", 5),
    MAUL("Maul", 12),
    SPEAR("Spear", 6);

    public int damage;
    public String name;

    Weapon(String name, int damage){}
}
