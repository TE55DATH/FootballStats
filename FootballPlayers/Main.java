package FootballPlayers;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVParser parser = new CSVParser();
        PairCalculator pairCalculator = new PairCalculator();

        try {
            // Define paths to CSV files
            String recordsPath = "src/FootballPlayers/resources/records.csv";
            String playersPath = "src/FootballPlayers/resources/players.csv";
            String teamsPath = "src/FootballPlayers/resources/teams.csv";
            String matchesPath = "src/FootballPlayers/resources/matches.csv";

            // Parse the data
            List<Record> records = parser.parseRecords(recordsPath);
            List<Player> players = parser.parsePlayers(playersPath);
            List<Team> teams = parser.parseTeams(teamsPath);
            List<Match> matches = parser.parseMatches(matchesPath);

            // Calculate the pair with the longest shared playtime
            PlayerPair longestPair = pairCalculator.calculateLongestSharedTime(records);

            // Output the result
            System.out.println("The pair with the longest shared playtime:");
            System.out.println("Player 1 ID: " + longestPair.getPlayer1Id());
            System.out.println("Player 2 ID: " + longestPair.getPlayer2Id());
            System.out.println("Shared time: " + longestPair.getSharedTime() + " minutes");

        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}
