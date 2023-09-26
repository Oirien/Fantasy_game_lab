package org.example.Entities.Player.Spellcaster;

import org.example.Entities.Enemy.Enemy;
import org.example.Entities.Player.Player;
import org.example.IDefend;
import org.example.ISpell;
import org.example.Spell;

import java.util.ArrayList;

public abstract class Spellcaster extends Player implements ISpell, IDefend {
    ArrayList<Spell> knownSpells;
    public Spellcaster(String name, int health, ArrayList<Spell> knownSpells) {
        super(name, health);
        this.knownSpells = new ArrayList<>();
    }
    public void learnSpell(Spell spell){
        this.knownSpells.add(spell);
    }

    public String cast(Enemy enemy, Spell spell){
        enemy.setHealth(enemy.getHealth() - spell.damage);
        return String.format("%s casts %s", this.getName(), spell.name());
    }
}
