package org.example.Entities.Player;

import org.example.IHeal;

public class Cleric extends Player implements IHeal {

    public Cleric(String name, int health) {
        super(name, health);
    }

    @Override
    public void heal(Player player, int heal) {
        player.setHealth(player.getHealth() + heal);
    }
}
