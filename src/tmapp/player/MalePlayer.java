package tmapp.player;

public class MalePlayer extends Player {

    public MalePlayer(int playerID, String playerName, int playerAge, int playerRank) {
        super(playerID, playerName, playerAge, playerRank);
        setPlayerGender('m');
        setMenSingles(true);
        setMensDoubles(true);
        setMixedDoubles(true);
    }
}
