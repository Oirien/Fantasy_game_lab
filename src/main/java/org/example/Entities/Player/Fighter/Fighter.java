package org.example.Entities.Player.Fighter;

import org.example.DamageType;
import org.example.Entities.Enemy.Enemy;
import org.example.Entities.Player.Player;
import org.example.IAttack;
import org.example.Weapon;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IAttack {
    Weapon weapon;
    public Fighter(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String attack(Enemy enemy, Weapon weapon) {
        enemy.takeDamage(weapon.getDamage(), weapon.getType());
        return String.format("%s attacks with %s", this.getName(), weapon.getName());
    }
    public void replaceWeapon(Weapon weapon){
        this.setWeapon(weapon);
    }
}
