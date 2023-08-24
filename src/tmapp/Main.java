package tmapp;

import tmapp.player.FemalePlayer;
import tmapp.player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new FemalePlayer(1, "Maxine Mustermann", 27, 1);
        player1.playerInfo();

    }
}
