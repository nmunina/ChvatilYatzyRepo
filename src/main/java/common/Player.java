package common;

public class Player {
    public static String name = "OnePlayerGameDummy";
    boolean winner;
    private static int score;
    private static boolean[] combinationsChecked = new boolean[15];
    private static int[] combinationScore = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };


    //Player player = new Player();
    public static void printPlayersScore(){
        for (int i = 0; i < combinationScore.length; i++) {
            score += combinationScore[i];
        }
        System.out.println("Total summa för spelare " + name + ": " + score);
    }

    public static void increasePlayersScore(int position, int scoreInput) {
        combinationScore[position] += scoreInput;
        combinationsChecked[position] = true;
    }
    
    public static int combinationTotal(int score) {
		return combinationScore[score];
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
