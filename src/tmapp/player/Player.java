package tmapp.player;

public abstract class Player {
    private int playerID;
    private String playerName;
    private char playerGender;
    private int playerAge;
    private int playerRank;
    private boolean femaleSingles;
    private boolean femaleDoubles;
    private boolean maleSingles;
    private boolean maleDoubles;
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

    public boolean isFemaleSingles() {
        return femaleSingles;
    }

    public void setFemaleSingles(boolean femaleSingles) {
        this.femaleSingles = femaleSingles;
    }

    public boolean isFemaleDoubles() {
        return femaleDoubles;
    }

    public void setFemaleDoubles(boolean femaleDoubles) {
        this.femaleDoubles = femaleDoubles;
    }

    public boolean isMaleSingles() {
        return maleSingles;
    }

    public void setMaleSingles(boolean maleSingles) {
        this.maleSingles = maleSingles;
    }

    public boolean isMaleDoubles() {
        return maleDoubles;
    }

    public void setMaleDoubles(boolean maleDoubles) {
        this.maleDoubles = maleDoubles;
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
            System.out.println("\tFemale Singles: " + femaleSingles);
            System.out.println("\tFemale Doubles: " + femaleDoubles);
            System.out.println("\tMixed Doubles: " + mixedDoubles);
        }
        if (playerGender == 'm') {
            System.out.println("\tMale Singles: " + maleSingles);
            System.out.println("\tMale Doubles: " + maleDoubles);
            System.out.println("\tMixed Doubles: " + mixedDoubles);
        }
    }
}
