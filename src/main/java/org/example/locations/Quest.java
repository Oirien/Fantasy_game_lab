package org.example.locations;

import org.example.Entities.Enemy.Enemy;
import org.example.Exit;

import java.util.ArrayList;
import java.util.Collection;

public class Quest {
    ArrayList<Room> rooms;
    ArrayList<Room> emptyRooms;

    public Quest() {
        this.rooms = new ArrayList<>();
        this.emptyRooms = new ArrayList<>();
    }

    public void addRoom(Room room, Enemy enemy, int treasure) {
        this.rooms.add(room);
        room.addEnemy(enemy);
        room.addRandomExits();
        room.addTreasure(treasure);
    }

    public void addEmptyRoom(Room room) {
        this.emptyRooms.add(room);
    }
    public void removeRoom(Room room) {
        this.rooms.remove(room);

    }
    public void continueQuest(Room room, Room room2) {
        if (room.checkForEnemies() == true){
            addEmptyRoom(room);
            removeRoom(room);
            room2.addParty(room.getParty());
            room.removeParty();
        }
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
