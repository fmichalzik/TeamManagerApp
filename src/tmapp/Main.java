package tmapp;

import tmapp.player.FemalePlayer;
import tmapp.player.MalePlayer;
import tmapp.player.Player;
import tmapp.team.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new FemalePlayer(1, "Maxine Mustermann", 27, 1);
        Player player2 = new MalePlayer(2, "Max Mustermann", 35, 2);
        Player player3 = new MalePlayer(3, "Klaus Staplerfahrer", 55, 55);

        Team team = new Team("Geiles Team", new ArrayList<>());
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);

        System.out.println(team.getTeamName());
        team.displayPlayers();

        System.out.println("Remove all male Players");
        team.removeAllMalePlayers();
        //team.removePlayerByPlayerID(2);
        team.displayPlayers();

    }

}
