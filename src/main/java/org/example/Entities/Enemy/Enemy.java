package org.example.Entities.Enemy;

import org.example.DamageType;
import org.example.Entities.Entity;
import org.example.Entities.Player.Player;

import java.util.ArrayList;

public abstract class Enemy extends Entity {
    public Enemy(String name, int health) {
        super(name, health);
    }
    abstract public void attack(Player player);
}
