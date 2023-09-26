package org.example.Entities.Player.Fighter;

import org.example.Entities.Enemy.Enemy;
import org.example.Entities.Player.Player;
import org.example.IAttack;
import org.example.Weapon;

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
        enemy.setHealth(enemy.getHealth() - this.weapon.damage);
        return String.format("%s attacks with %s", this.getName(), this.weapon.name());
    }
    public void replaceWeapon(Weapon weapon){
        this.setWeapon(weapon);
    }
}
