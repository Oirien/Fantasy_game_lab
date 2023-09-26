package org.example.Entities.Player;

import org.example.DamageType;
import org.example.Entities.Entity;

import java.util.ArrayList;

public abstract class Player extends Entity {
    DamageType fire = DamageType.FIRE;
    DamageType ice = DamageType.ICE;
    DamageType poison = DamageType.POISON;
    public Player(String name, int health) {
        super(name, health);
        this.resistances.add(fire);
        this.vulnerabilities.add(ice);
        this.vulnerabilities.add(poison);
    }

    public void regenHealth(){
        if (this.getCurrentHealth() + this.getMaxHealth() / 10 > this.getMaxHealth())
            this.setCurrentHealth(this.getMaxHealth());
        else {
            this.setCurrentHealth(this.getCurrentHealth() + this.getMaxHealth() / 10);
        }
    }
}
