package FootballPlayers;

public class Player {
    private int id;
    private int teamNumber;
    private String position;
    private String fullName;
    private int teamID;

    public Player(int id, int teamNumber, String position, String fullName, int teamID) {
        this.id = id;
        this.teamNumber = teamNumber;
        this.position = position;
        this.fullName = fullName;
        this.teamID = teamID;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getFullName() {
        return fullName;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", teamNumber=" + teamNumber +
                ", position='" + position + '\'' +
                ", fullName='" + fullName + '\'' +
                ", teamID=" + teamID +
                '}';
    }
}
