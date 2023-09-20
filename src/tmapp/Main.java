package tmapp;

import tmapp.club.Club;
import tmapp.player.FemalePlayer;
import tmapp.player.MalePlayer;
import tmapp.player.Player;
import tmapp.team.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Club myClub = new Club("BC Hiddinghausen");

        myClub.addMalePlayerToClub(123, "Peter Lustig", 46, 6);
        myClub.addMalePlayerToClub(111, "Peter Beispiel", 38, 5);
        myClub.addMalePlayerToClub(122, "Frodo Beutlin", 24, 12);
        myClub.addFemalePlayerToClub(1, "Maxine Mustermann", 27, 1);
        myClub.addFemalePlayerToClub(1, "Anne Boss", 45, 6);

        myClub.displayAllPlayersInCLub();


        Player player1 = new FemalePlayer(1, "Maxine Mustermann", 27, 1);
        Player player2 = new MalePlayer(2, "Max Mustermann", 35, 2);
        Player player3 = new MalePlayer(3, "Klaus Staplerfahrer", 55, 55);
        Player player4 = new MalePlayer(4, "Frank Tank", 45, 5);
        Player player5 = new FemalePlayer(1, "Anne Boss", 45, 6);

        Team team = new Team("Geiles Team", new ArrayList<>());
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);

        System.out.println(team.getTeamName());
        team.displayPlayers();

        team.assignPlayerForMs1((player1));
        team.assignPlayerForMs1((player2));
        team.getMenSingles1().playerInfo();
        team.assignPlayerForMs2(player3);
        team.getMenSingles2().playerInfo();

        team.addPlayerToMensDoubles1(player1);
        team.addPlayerToMensDoubles1(player2);
        team.addPlayerToMensDoubles1(player4);
        team.addPlayerToMensDoubles1(player3);

        team.displayMensDoubles1();

        team.addPlayerToWomensDoubles(player2);
        team.addPlayerToWomensDoubles(player1);
        team.addPlayerToWomensDoubles(player5);
        team.addPlayerToWomensDoubles(player5);

        team.displayWomensDoubles();

        team.clearDoubles(team.getWomensDoubles());

        team.displayWomensDoubles();

        team.addPlayerToMixedDoubles(player1);
        team.addPlayerToMixedDoubles(player2);
        team.addPlayerToMixedDoubles(player5);

        team.displayMixedDoubles();

        //System.out.println("Remove all male Players");
        //team.removeAllMalePlayers();
        //team.removePlayerByPlayerID(2);
        //team.displayPlayers();

    }

}
