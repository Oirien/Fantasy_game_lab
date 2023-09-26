package org.example;
import org.example.Entities.Player.Player;
import java.util.ArrayList;

public class Party {
    ArrayList<Player> players;
    int treasureHeld;

    public Party() {
        this.players = new ArrayList<>();
        this.treasureHeld = 0;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
