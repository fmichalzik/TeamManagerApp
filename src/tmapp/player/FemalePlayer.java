package tmapp.player;

public class FemalePlayer extends Player {

    public FemalePlayer(int playerID, String playerName, int playerAge, int playerRank) {
        super(playerID, playerName, playerAge, playerRank);
        setPlayerGender('f');
        setFemaleSingles(true);
        setFemaleDoubles(true);
        setMixedDoubles(true);
    }
}
