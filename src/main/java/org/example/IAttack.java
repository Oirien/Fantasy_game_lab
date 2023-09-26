package org.example;

import org.example.Entities.Enemy.Enemy;

public interface IAttack {
    String attack(Enemy enemy, Weapon weapon);
    void replaceWeapon(Weapon weapon);
}
