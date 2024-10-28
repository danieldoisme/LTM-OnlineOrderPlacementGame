package onlineorderplacementgame;

public class Player {
    private String name;
    private int totalPoints;
    private String status;

    public Player(String name, int totalPoints, String status) {
        this.name = name;
        this.totalPoints = totalPoints;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public String getStatus() {
        return status;
    }
}
