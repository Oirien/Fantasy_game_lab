package org.example.Entities.Player;

import org.example.DamageType;
import org.example.IHeal;

import java.util.ArrayList;

public class Cleric extends Player implements IHeal {

    public Cleric(String name, int health) {
        super(name, health);
    }



    @Override
    public void heal(Player player, int heal) {
        if (player.getCurrentHealth() + heal > player.getMaxHealth()){
            player.setCurrentHealth(player.getMaxHealth());
        } else {
            player.setCurrentHealth(player.getCurrentHealth() + heal);
        }
    }
}
