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
        player1.playerInfo();

        Team team = new Team("Geiles Team", new ArrayList<>());
        team.addPlayer(player2);

        System.out.println(team.getTeamName());
        team.displayPlayers();

    }

}
