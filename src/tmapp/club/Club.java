package tmapp.club;

public class Club {
    private String clubName;
    private int clubID;
    private int numOfPlayersInClub = getNumOfFemalePlayersInClub() + getNumOfMalePlayersInClub();
    private int numOfFemalePlayersInClub;
    private int numOfMalePlayersInClub;


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
        return numOfPlayersInClub;
    }

    public int getNumOfFemalePlayersInClub() {
        return numOfFemalePlayersInClub;
    }

    public void setNumOfFemalePlayersInClub(int numOfFemalePlayersInClub) {
        this.numOfFemalePlayersInClub = numOfFemalePlayersInClub;
    }

    public int getNumOfMalePlayersInClub() {
        return numOfMalePlayersInClub;
    }

    public void setNumOfMalePlayersInClub(int numOfMalePlayersInClub) {
        this.numOfMalePlayersInClub = numOfMalePlayersInClub;
    }
}
