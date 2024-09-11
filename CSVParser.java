package FootballPlayers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CSVParser {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
    
    public List<Record> parseRecords(String filePath) throws IOException {
        List<Record> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 5) {
                    int id = Integer.parseInt(values[0].trim());
                    int playerID = Integer.parseInt(values[1].trim());
                    int matchID = Integer.parseInt(values[2].trim());
                    int fromMinutes = Integer.parseInt(values[3].trim());
                    Integer toMinutes = (values[4].trim().isEmpty()) ? null : Integer.parseInt(values[4].trim());
                    records.add(new Record(id, playerID, matchID, fromMinutes, toMinutes));
                }
            }
        }
        return records;
    }

    public List<Player> parsePlayers(String filePath) throws IOException {
        List<Player> players = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 5) {
                    int id = Integer.parseInt(values[0].trim());
                    int teamNumber = Integer.parseInt(values[1].trim());
                    String position = values[2].trim();
                    String fullName = values[3].trim();
                    int teamID = Integer.parseInt(values[4].trim());
                    players.add(new Player(id, teamNumber, position, fullName, teamID));
                }
            }
        }
        return players;
    }

    public List<Team> parseTeams(String filePath) throws IOException {
        List<Team> teams = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 4) {
                    int id = Integer.parseInt(values[0].trim());
                    String name = values[1].trim();
                    String managerFullName = values[2].trim();
                    String group = values[3].trim();
                    teams.add(new Team(id, name, managerFullName, group));
                }
            }
        }
        return teams;
    }

    public List<Match> parseMatches(String filePath) throws IOException {
        List<Match> matches = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 5) {
                    int id = Integer.parseInt(values[0].trim());
                    int aTeamID = Integer.parseInt(values[1].trim());
                    int bTeamID = Integer.parseInt(values[2].trim());
                    Date date;
                    try {
                        date = dateFormat.parse(values[3].trim());
                    } catch (ParseException e) {
                        // Handle different date formats or defaults
                        date = new Date();
                    }
                    String score = values[4].trim();
                    matches.add(new Match(id, aTeamID, bTeamID, date, score));
                }
            }
        }
        return matches;
    }
}
