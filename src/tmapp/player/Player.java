package tmapp.player;

public abstract class Player {
    private int playerID;
    private String playerName;
    private char playerGender;
    private int playerAge;
    private int playerRank;
    private boolean womenSingles;
    private boolean womensDoubles;
    private boolean menSingles;
    private boolean mensDoubles;
    private boolean mixedDoubles;

    public Player(int playerID, String playerName, int playerAge, int playerRank) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerRank = playerRank;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public char getPlayerGender() {
        return playerGender;
    }

    public void setPlayerGender(char playerGender) {
        this.playerGender = playerGender;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getPlayerRank() {
        return playerRank;
    }

    public void setPlayerRank(int playerRank) {
        this.playerRank = playerRank;
    }

    public boolean isWomenSingles() {
        return womenSingles;
    }

    public void setWomenSingles(boolean womenSingles) {
        this.womenSingles = womenSingles;
    }

    public boolean isWomensDoubles() {
        return womensDoubles;
    }

    public void setWomensDoubles(boolean womensDoubles) {
        this.womensDoubles = womensDoubles;
    }

    public boolean isMenSingles() {
        return menSingles;
    }

    public void setMenSingles(boolean menSingles) {
        this.menSingles = menSingles;
    }

    public boolean isMensDoubles() {
        return mensDoubles;
    }

    public void setMensDoubles(boolean mensDoubles) {
        this.mensDoubles = mensDoubles;
    }

    public boolean isMixedDoubles() {
        return mixedDoubles;
    }

    public void setMixedDoubles(boolean mixedDoubles) {
        this.mixedDoubles = mixedDoubles;
    }

    public void playerInfo() {
        System.out.println(" -- Player Information --");
        System.out.println("\tID: " + playerID);
        System.out.println("\tName: " + playerName);
        System.out.println("\tAge: " + playerAge);
        System.out.println("\tGender: " + playerGender);
        if (playerGender == 'f') {
            System.out.println("\tFemale Singles: " + womenSingles);
            System.out.println("\tFemale Doubles: " + womensDoubles);
            System.out.println("\tMixed Doubles: " + mixedDoubles);
        }
        if (playerGender == 'm') {
            System.out.println("\tMale Singles: " + menSingles);
            System.out.println("\tMale Doubles: " + mensDoubles);
            System.out.println("\tMixed Doubles: " + mixedDoubles);
        }
    }
}
