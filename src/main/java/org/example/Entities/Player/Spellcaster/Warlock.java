package org.example.Entities.Player.Spellcaster;

import org.example.DamageType;
import org.example.Spell;

import java.util.ArrayList;

public class Warlock extends Spellcaster{

    public Warlock(String name, int health, ArrayList<Spell> knownSpells) {
        super(name, health, knownSpells);
    }

    @Override
    public void defend() {

    }
}
