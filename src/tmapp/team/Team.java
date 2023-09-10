package tmapp.team;

import tmapp.player.FemalePlayer;
import tmapp.player.MalePlayer;
import tmapp.player.Player;

import java.util.ArrayList;

public class Team {

    private String teamName;
    // Creates a list to hold player objects
    private ArrayList<Player> players;

    private ArrayList<Player> mensDoubles1 = new ArrayList<>();
    private ArrayList<Player> mensDoubles2 = new ArrayList<>();

    private ArrayList<Player> womensDoubles = new ArrayList<>();

    // disciplines
    private Player maleSingles1;
    private Player maleSingles2;
    private Player maleSingles3;
    private Player femaleSingles;
    private String noFemaleInMale = "Cannot assign a female player for male player discipline.";
    private String noMaleInFemale = "Cannot assign a male player for female player discipline.";

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


    public void assignPlayerForMs1(Player player) {
        if (player instanceof FemalePlayer) {
            System.out.println(noFemaleInMale);
        }
        else {
            maleSingles1 = player;
        }
    }

    public void assignPlayerForMs2(Player player) {
        if (player instanceof FemalePlayer) {
            System.out.println(noFemaleInMale);
        }
        else {
            maleSingles2 = player;
        }
    }

    public void assignPlayerForMs3(Player player) {
        if (player instanceof FemalePlayer) {
            System.out.println(noFemaleInMale);
        }
        else {
            maleSingles3 = player;
            System.out.println("Player assigned for Mens Doubles.");
        }
    }

    public void assignPlayerForFs(Player player) {
        if (player instanceof MalePlayer) {
            System.out.println(noMaleInFemale);
        }
        else {
            femaleSingles = player;
        }
    }

    public void addPlayerToMensDoubles1(Player player) {
        if (player instanceof FemalePlayer) {
            System.out.println(noFemaleInMale);
        }
        else if (mensDoubles1.size() >= 2) {
            System.out.println("There are already two players assigned for mens doubles.");
        }
        else {
            mensDoubles1.add(player);
        }
    }

    public void addPlayerToMensDoubles2(Player player) {
        if (player instanceof FemalePlayer) {
            System.out.println(noFemaleInMale);
        }
        else if (mensDoubles2.size() >= 2) {
            System.out.println("There are already two players assigned for mens doubles.");
        }
        else {
            mensDoubles2.add(player);
        }
    }

    public void displayMensDoubles1() {
        System.out.println("    >>> Mens Doubles 1 <<<    ");
        mensDoubles1.forEach(Player::playerInfo);
    }

    public void displayMensDoubles2() {
        System.out.println("    >>> Mens Doubles 2 <<<    ");
        mensDoubles2.forEach(Player::playerInfo);
    }

    public void addPlayerToWomensDoubles(Player player) {
        if (player instanceof MalePlayer) {
            System.out.println(noMaleInFemale);
        }
        else if (womensDoubles.size() >= 2) {
            System.out.println("There are already two players assigned for women doubles.");
        }
        else {
            womensDoubles.add(player);
        }
    }

    public void displayWomensDoubles() {
        System.out.println("    >>> Women Doubles <<<    ");
        womensDoubles.forEach(Player::playerInfo);
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player getMaleSingles1() {
        return maleSingles1;
    }

    public Player getMaleSingles2() {
        return maleSingles2;
    }

    public Player getMaleSingles3() {
        return maleSingles3;
    }

}
