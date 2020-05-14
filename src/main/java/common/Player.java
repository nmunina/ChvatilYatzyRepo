package common;

public class Player {
    public String name = "OnePlayerGameDummy";
    boolean winner;
    private int score;

    //Player player = new Player();

    public void increaseScore(int points) {
        score +=points;
    }



    public int getScore() {
        return score;
    }

    public int[] choise() {
        // wich dice you want to reroll
        // numbers in the array

        int[] firstRoll = new int[5];

        return firstRoll;
    }
}
