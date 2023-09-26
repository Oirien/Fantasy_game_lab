package org.example.Entities.Player.Spellcaster;

import org.example.Spell;

import java.util.ArrayList;

public class Wizard extends Spellcaster{
    public Wizard(String name, int health, ArrayList<Spell> knownSpells) {
        super(name, health, knownSpells);
    }

    @Override
    public void defend() {

    }
}
