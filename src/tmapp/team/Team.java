package tmapp.team;

import tmapp.player.FemalePlayer;
import tmapp.player.MalePlayer;
import tmapp.player.Player;

import java.util.ArrayList;

public class Team {

    private String teamName;
    // Creates a list to hold player objects
    private ArrayList<Player> players;

    // disciplines
    private ArrayList<Player> mensDoubles1 = new ArrayList<>();
    private ArrayList<Player> mensDoubles2 = new ArrayList<>();
    private ArrayList<Player> womensDoubles = new ArrayList<>();
    private ArrayList<Player> mixedDoubles = new ArrayList<>();
    private Player maleSingles1;
    private Player maleSingles2;
    private Player maleSingles3;
    private Player femaleSingles;
    private String noFemaleInMale = "Cannot assign a female player for male player discipline.";
    private String noMaleInFemale = "Cannot assign a male player for female player discipline.";
    private String noPlayerInDiscipline = "No player/players assigned for this discipline.";

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
        if (mensDoubles1.isEmpty()) {
            System.out.println(noPlayerInDiscipline);
        }
        else {
            System.out.println("    >>> Mens Doubles 1 <<<    ");
            mensDoubles1.forEach(Player::playerInfo);
        }
    }

    public void displayMensDoubles2() {
        if (mensDoubles2.isEmpty()) {
            System.out.println(noPlayerInDiscipline);
        }
        else {
            System.out.println("    >>> Mens Doubles 2 <<<    ");
            mensDoubles2.forEach(Player::playerInfo);
        }
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
        if (womensDoubles.isEmpty()) {
            System.out.println(noPlayerInDiscipline);
        }
        else {
            System.out.println("    >>> Women Doubles <<<    ");
            womensDoubles.forEach(Player::playerInfo);
        }
    }

    public void addPlayerToMixedDoubles(Player player) {
        int male = 0;
        int female = 0;
        for (Player p : mixedDoubles) {
            if (p instanceof FemalePlayer) {
                female ++;
            }
            else {
                male ++;
            }
        }
        if ((player instanceof FemalePlayer && female >= 1) || (player instanceof MalePlayer && male >=1)) {
            System.out.println("There can only be one female/male player each in mixed doubles.");
        }
        else if (mixedDoubles.size() >= 2) {
            System.out.println("There are already two players assigned for mixed doubles.");
        }
        else {
            mixedDoubles.add(player);
        }
    }

    public void displayMixedDoubles() {
        if (mixedDoubles.isEmpty()) {
            System.out.println(noPlayerInDiscipline);
        }
        else {
            System.out.println("    >>> Mixed Doubles <<<    ");
            mixedDoubles.forEach(Player::playerInfo);
        }
    }

    public void clearDoubles (ArrayList<Player> doublesDiscipline) {
        doublesDiscipline.clear();
        System.out.println("Removed players from discipline.");
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

    public ArrayList<Player> getMensDoubles1() {
        return mensDoubles1;
    }

    public ArrayList<Player> getMensDoubles2() {
        return mensDoubles2;
    }

    public ArrayList<Player> getWomensDoubles() {
        return womensDoubles;
    }

    public ArrayList<Player> getMixedDoubles() {
        return mixedDoubles;
    }
}
