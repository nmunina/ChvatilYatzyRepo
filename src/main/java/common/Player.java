package common;

public class Player {
    public static String name = "OnePlayerGameDummy";
    boolean winner;
    private static int score;
    private static boolean[] combinationsChecked = new boolean[15];
    private static int[] combinationScore = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static int[] upperScore = {combinationScore[0], combinationScore[1],
    		combinationScore[2], combinationScore[3], combinationScore[4], 
    		combinationScore[5]};
    

    //Player player = new Player();
    public static void printPlayersScore(){
//        for (int i = 0; i < combinationScore.length; i++) {
//            score += combinationScore[i];
//        }
        System.out.println("Total summa f�r spelare " + name + ": " + score);
    }

    public static void increasePlayersScore(int position, int scoreInput) {
        score += scoreInput;
        combinationScore[position] += scoreInput;
        combinationsChecked[position] = true;
    }
    
    public static int combinationTotal(int score) {
		return combinationScore[score];
	}
    public static int bonus(int[] upper) {
    	int scoreBonus = 0;
    	int temp = 0;
    	for (int i = 0; i < 6; i++) {
			temp += combinationScore[i];
		}
    	if (temp >= 63) {
			scoreBonus = 50;
		}
    	return scoreBonus;
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
