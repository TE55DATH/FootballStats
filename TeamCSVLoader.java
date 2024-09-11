package FootballPlayers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeamCSVLoader {

    public List<Team> loadTeams(String filePath) {
        List<Team> teams = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip the header line
            br.readLine();

            // Read each line of the CSV file
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length == 4) {
                    int id = Integer.parseInt(values[0].trim());
                    String name = values[1].trim();
                    String managerFullName = values[2].trim();
                    String group = values[3].trim();

                    // Create a new Team object and add it to the list
                    Team team = new Team(id, name, managerFullName, group);
                    teams.add(team);
                } else {
                    System.out.println("Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return teams;
    }
}
