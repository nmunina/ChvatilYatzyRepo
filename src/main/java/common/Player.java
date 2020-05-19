package common;

public class Player {
    public String name = "OnePlayerGameDummy";
    boolean winner;
    private int score;

    //Player player = new Player();
    public void printPlayersScore(){
        System.out.println("printPlayersScore() shows score " + score);
    }

    public int increasePlayersScore(int points) {
        score +=points;
        return score;
    }

    //TODO player choses what dice to (re)roll
    public int[] choise() {
        // wich dice you want to reroll
        // numbers in the array

        int[] firstRoll = new int[5];

        return firstRoll;
    }
}
