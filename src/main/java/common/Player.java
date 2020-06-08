package common;

public class Player {
    public String name = "OnePlayerGameDummy";
    boolean winner;
    private int score;
    private boolean[] combinationsChecked = new boolean[15];
    private int[] combinationScore = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };


    //Player player = new Player();
    public void printPlayersScore(){
        for (int i = 0; i < combinationScore.length; i++) {
            score += combinationScore[i];
        }
        System.out.println("Total summa: " + score);
    }

    public void increasePlayersScore(int position, int scoreInput) {
        combinationScore[position] += scoreInput;
    }

    public void isCombinationChecked(int position, boolean isChecked) {
        combinationsChecked[position] = isChecked;
    }


//    //TODO player choses what dice to (re)roll
//    public int[] choise() {
//        // wich dice you want to reroll
//        // numbers in the array
//
//        int[] firstRoll = new int[5];
//
//        return firstRoll;
//    }
}
