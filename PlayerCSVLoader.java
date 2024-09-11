package FootballPlayers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayerCSVLoader {

    public List<Player> loadPlayers(String filePath) {
        List<Player> players = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip the header line
            br.readLine();

            // Read each line of the CSV file
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length == 5) {
                    int id = Integer.parseInt(values[0].trim());
                    int teamNumber = Integer.parseInt(values[1].trim());
                    String position = values[2].trim();
                    String fullName = values[3].trim();
                    int teamID = Integer.parseInt(values[4].trim());

                    // Create a new Player object and add it to the list
                    Player player = new Player(id, teamNumber, position, fullName, teamID);
                    players.add(player);
                } else {
                    System.out.println("Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return players;
    }
}
