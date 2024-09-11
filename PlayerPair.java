package FootballPlayers;

import java.util.Objects;

public class PlayerPair {
    private int player1Id;
    private int player2Id;
    private int sharedTime;

    public PlayerPair(int player1Id, int player2Id, int sharedTime) {

        // Ensures player1Id is always less than player2Id for uniqueness
        if (player1Id < player2Id) {
            this.player1Id = player1Id;
            this.player2Id = player2Id;
        } else {
            this.player1Id = player2Id;
            this.player2Id = player1Id;
        }
        this.sharedTime = sharedTime;
    }

    public int getPlayer1Id() {
        return player1Id;
    }

    public int getPlayer2Id() {
        return player2Id;
    }

    public int getSharedTime() {
        return sharedTime;
    }

    public void addSharedTime(int time) {
        this.sharedTime += time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        PlayerPair that = (PlayerPair) o;
        return player1Id == that.player1Id && player2Id == that.player2Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(player1Id, player2Id);
    }

    @Override
    public String toString() {
        return "PlayerPair{" +
                "player1Id=" + player1Id +
                ", player2Id=" + player2Id +
                ", sharedTime=" + sharedTime +
                '}';
    }
}
