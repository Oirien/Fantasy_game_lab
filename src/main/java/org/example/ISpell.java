package org.example;

import org.example.Entities.Enemy.Enemy;

public interface ISpell {
    String cast(Enemy enemy, Spell spell);
}
