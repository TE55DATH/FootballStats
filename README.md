This project focuses on analyzing football match data to determine which pair of players has played together for the longest cumulative duration across all matches.
The application parses and processes data from several CSV files - information about players, teams, matches, and player participation records. 
The goal is to calculate and identify the pair of players who shared the most time on the field during their matches.

To achieve this, the application reads data from four types of CSV files: players.csv, teams.csv, matches.csv, and records.csv.
Each file contains information such as player details, team affiliations, match outcomes, and specific minutes played by players during each match.
 The program is designed to handle these CSV files by parsing their content and using it to compute the shared playtime between player pairs.

The core of the solution involves grouping player records by match and comparing the participation durations of every pair of players.
By calculating the overlap in their playing times, the application determines the total shared playtime for each pair across all matches.
The pair with the longest total shared playtime is identified and reported.

The application handles basic errors related to CSV parsing and data formatting, ensuring that anomalies in the input data do not disrupt the process.

To use the application, simply place the CSV files in the src/FootballPlayers/resources/ directory and run the Main class.
The application will read the data, perform the calculations, and output the player pair with the longest cumulative shared playtime.
