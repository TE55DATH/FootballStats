package FootballPlayers;

import java.util.Date;

public class Match {
    private int id;
    private int aTeamID;
    private int bTeamID;
    private Date date;
    private String score;

    public Match(int id, int aTeamID, int bTeamID, Date date, String score) {
        this.id = id;
        this.aTeamID = aTeamID;
        this.bTeamID = bTeamID;
        this.date = date;
        this.score = score;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public int getaTeamID() {
        return aTeamID;
    }

    public int getbTeamID() {
        return bTeamID;
    }

    public Date getDate() {
        return date;
    }

    public String getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setaTeamID(int aTeamID) {
        this.aTeamID = aTeamID;
    }

    public void setbTeamID(int bTeamID) {
        this.bTeamID = bTeamID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", aTeamID=" + aTeamID +
                ", bTeamID=" + bTeamID +
                ", date=" + date +
                ", score='" + score + '\'' +
                '}';
    }
}
