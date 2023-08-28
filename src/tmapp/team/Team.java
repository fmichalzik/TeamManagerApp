package tmapp.team;

import tmapp.player.FemalePlayer;
import tmapp.player.MalePlayer;
import tmapp.player.Player;

import java.util.ArrayList;

public class Team {

    private String teamName;

    private ArrayList<Player> players;

    public Team(String teamName, ArrayList<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

/*    public void addFemalePlayer(int playerID, String playerName, int playerAge, int playerRank) {
        players.add(new FemalePlayer(playerID, playerName, playerAge, playerRank));
    }*/

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void removePlayerByPlayerID(int playerID) {
        for (Player player : players) {
            int id = player.getPlayerID();
            if (id == playerID) {
                removePlayer(player);
            }
        }
    }

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
