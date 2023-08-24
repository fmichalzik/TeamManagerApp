package tmapp.player;

public class MalePlayer extends Player {

    public MalePlayer(int playerID, String playerName, int playerAge, int playerRank) {
        super(playerID, playerName, playerAge, playerRank);
        setPlayerGender('m');
        setMaleSingles(true);
        setMaleDoubles(true);
        setMixedDoubles(true);
    }
}
