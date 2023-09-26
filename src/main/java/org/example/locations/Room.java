package org.example.locations;

import org.example.Entities.Enemy.Enemy;
import org.example.Exit;
import org.example.Party;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Room {
    Set<Exit> exits;
    ArrayList<Enemy> enemies;

    int treasure;

    Party party;


    public Room(ArrayList<Enemy> enemies, int treasure, Party party) {
        this.exits = new HashSet<>();
        this.enemies = enemies;
        this.treasure = treasure;
        this.party = party;
    }
    private int randomNumberGenerator() {
        return (int) (Math.random() * 4);
    }
    public void addRandomExits(){
        Exit[] exit = new Exit[4];
        exit[0] = Exit.EAST;
        exit[1] = Exit.WEST;
        exit[2] = Exit.NORTH;
        exit[3] = Exit.SOUTH;
        int random = randomNumberGenerator();
        for (int i = 0; i < random; i++) {
            int randomExit = randomNumberGenerator();
            exits.add(exit[randomExit]);
        }
    }
    public void addTreasure(int treasure) {
        this.treasure = treasure;
    }
    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public boolean checkForEnemies() {
        if (enemies.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Party getParty() {
        return party;
    }

    public Set<Exit> getExits() {
        return exits;
    }

    public void removeParty() {
        this.party = null;
    }

    public void addParty(Party party) {
        this.party = party;
    }
}