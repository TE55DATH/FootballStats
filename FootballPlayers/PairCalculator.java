package FootballPlayers;

import java.util.*;

public class PairCalculator {

    // Method to calculate the pair with the longest shared playtime
    public PlayerPair calculateLongestSharedTime(List<Record> records) {

        // Map to track shared time between each pair of players
        Map<PlayerPair, PlayerPair> playerPairs = new HashMap<>();

        // Group records by match
        Map<Integer, List<Record>> matchRecords = groupRecordsByMatch(records);

        // Iterate through each match
        for (Map.Entry<Integer, List<Record>> entry : matchRecords.entrySet()) {
            List<Record> matchRecordList = entry.getValue();

            // Compare each player with every other player in the match
            for (int i = 0; i < matchRecordList.size(); i++) {
                Record player1 = matchRecordList.get(i);

                for (int j = i + 1; j < matchRecordList.size(); j++) {
                    Record player2 = matchRecordList.get(j);

                    // Calculate overlapping playtime
                    int sharedTime = calculateOverlap(player1, player2);

                    // Create a unique player pair
                    PlayerPair pair = new PlayerPair(player1.getPlayerID(), player2.getPlayerID(), 0);

                    // Add or update the shared time for this pair
                    playerPairs.putIfAbsent(pair, pair);
                    playerPairs.get(pair).addSharedTime(sharedTime);
                }

            }
        }

        // Find the pair with the longest shared time
        return Collections.max(playerPairs.values(), Comparator.comparingInt(PlayerPair::getSharedTime));
    }

    // Helper method to group records by match ID
    private Map<Integer, List<Record>> groupRecordsByMatch(List<Record> records) {
        Map<Integer, List<Record>> matchRecords = new HashMap<>();
        for (Record record : records) {
            matchRecords.putIfAbsent(record.getMatchID(), new ArrayList<>());
            matchRecords.get(record.getMatchID()).add(record);
        }
        return matchRecords;
    }

    // Helper method to calculate overlapping playtime between two players
    private int calculateOverlap(Record player1, Record player2) {
        // The "from" minute should be the maximum of the two players' start times
        int start = Math.max(player1.getFromMinutes(), player2.getFromMinutes());

        // The "to" minute should be the minimum of the two players' end times
        int end1 = (player1.getToMinutes() != null) ? player1.getToMinutes() : 90;
        int end2 = (player2.getToMinutes() != null) ? player2.getToMinutes() : 90;
        int end = Math.min(end1, end2);

        // Calculate overlap, if any
        return Math.max(0, end - start);
    }
}
