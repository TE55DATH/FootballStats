package FootballPlayers;

public class Record {
    private int id;
    private int playerID;
    private int matchID;
    private int fromMinutes;
    private Integer toMinutes; // Use Integer to allow null => 90

    public Record(int id, int playerID, int matchID, int fromMinutes, Integer toMinutes) {
        this.id = id;
        this.playerID = playerID;
        this.matchID = matchID;
        this.fromMinutes = fromMinutes;
        this.toMinutes = (toMinutes != null) ? toMinutes : 90; // Handle NULL = 90 minutes
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    public int getFromMinutes() {
        return fromMinutes;
    }

    public void setFromMinutes(int fromMinutes) {
        this.fromMinutes = fromMinutes;
    }

    public Integer getToMinutes() {
        return toMinutes;
    }

    public void setToMinutes(Integer toMinutes) {
        this.toMinutes = (toMinutes != null) ? toMinutes : 90; // Handle NULL = 90 minutes
    }

    @Override
    public String toString() {
        return "Record [ID=" + id + ", PlayerID=" + playerID + ", MatchID=" + matchID +
                ", FromMinutes=" + fromMinutes + ", ToMinutes=" + toMinutes + "]";
    }
}
