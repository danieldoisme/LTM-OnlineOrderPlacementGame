package onlineorderplacementgame;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
    public static List<Player> getOnlinePlayers() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 50, "online"));
        players.add(new Player("Bob", 30, "playing"));
        players.add(new Player("Charlie", 70, "offline"));
        // Add more players as needed
        return players;
    }
}
