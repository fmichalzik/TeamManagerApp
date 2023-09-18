package tmapp.club;

import tmapp.player.FemalePlayer;
import tmapp.player.MalePlayer;
import tmapp.player.Player;

import java.util.ArrayList;

public class Club {
    private String clubName;
    private int clubID;

    private ArrayList<Player> femalePlayersInCLub = new ArrayList<>();
    private ArrayList<Player> malePlayersInCLub = new ArrayList<>();

    // Constructor
    public Club(String clubName) {
        this.clubName = clubName;
    }

    // Club Managing Functionalities
    public void addFemalePlayerToClub(int playerID, String playerName, int playerAge, int playerRank) {
        femalePlayersInCLub.add(new FemalePlayer(playerID, playerName, playerAge, playerRank));
    }

    public void addMalePlayerToClub(int playerID, String playerName, int playerAge, int playerRank) {
        malePlayersInCLub.add(new MalePlayer(playerID, playerName, playerAge, playerRank));
    }


    // Getter & Setter

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public int getNumOfPlayersInClub() {
        return femalePlayersInCLub.size() + malePlayersInCLub.size();
    }

    public int getNumOfFemalePlayersInClub() {
        return femalePlayersInCLub.size();
    }

    public int getNumOfMalePlayersInClub() {
        return malePlayersInCLub.size();
    }

}
