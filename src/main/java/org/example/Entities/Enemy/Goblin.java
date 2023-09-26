package org.example.Entities.Enemy;

import org.example.DamageType;
import org.example.Entities.Player.Player;

import java.util.ArrayList;

public class Goblin extends Enemy{
    DamageType fire = DamageType.FIRE;
    DamageType ice = DamageType.ICE;
    DamageType poison = DamageType.POISON;
    public Goblin(String name, int health) {
        super(name, health);
        this.resistances.add(fire);
        this.vulnerabilities.add(ice);
        this.vulnerabilities.add(poison);
    }
    public void attack(Player player) {
        player.takeDamage(5, DamageType.PIERCING);
    }
}
