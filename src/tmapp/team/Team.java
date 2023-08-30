package tmapp.team;

import tmapp.player.FemalePlayer;
import tmapp.player.MalePlayer;
import tmapp.player.Player;

import java.util.ArrayList;

public class Team {

    private String teamName;

    // Creates a list to hold player objects
    private ArrayList<Player> players;

    // Constructor to instanciate a team with a team name and a list of players
    public Team(String teamName, ArrayList<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

/*    public void addFemalePlayer(int playerID, String playerName, int playerAge, int playerRank) {
        players.add(new FemalePlayer(playerID, playerName, playerAge, playerRank));
    }*/

    // Adds a player (femalePlayer or malePlayer subtype) to the list of players
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Removes a player (femalePlayer or malePlayer subtype) from the list of players
    // not very specific - removePlayerByAttribute might be better
    public void removePlayer(Player player) {
        players.remove(player);
    }

    // Removes a player by playerID (femalePlayer or malePlayer subtype) from the list of players
    public void removePlayerByPlayerID(int playerID) {
        for (Player player : players) {
            int id = player.getPlayerID();
            if (id == playerID) {
                removePlayer(player);
            }
        }
    }

    // Removes all male players from the list of players
    // It "for each" goes through the players list and collects all MalePlayers in a new internal
    // maleplayers list.
    public void removeAllMalePlayers() {
        ArrayList<Player> malePlayers = new ArrayList<>();
        for (Player player : players) {
            if (player instanceof MalePlayer) {
                malePlayers.add(player);
            }
        }
        // Remove all elements from players list present in malePlayers list
        players.removeAll(malePlayers);
    }
    public void removeAllFemalePlayers() {
        ArrayList<Player> femalePlayers = new ArrayList<>();
        for (Player player : players) {
            if (player instanceof FemalePlayer) {
                femalePlayers.add(player);
            }
        }
        // Remove all elements from players list present in malePlayers list
        players.removeAll(femalePlayers);
    }


    // Shows playerInfo per player in the players list
    public void displayPlayers(){
        for (Player player : players) {
            player.playerInfo();
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
