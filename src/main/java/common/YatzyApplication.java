package common;

import java.beans.JavaBean;
import java.util.Arrays;
import java.util.Scanner;

public class YatzyApplication {
	private final static int ROUNDSNUMBER = 3; //change easily to have quicker games. Needed for testing
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean doYouWantToPlay = true;
		Player[] playersInGame; //array of players for this game
		Yatzy game;
		int[] playerScore;

		//TODO: How do we play the game. Instructions
		System.out.println("Here should be the rules. All right. Let's play Yatzy!");

		System.out.println("Now we can start the game. ");

		//while (doYouWantToPlay) is used to have different games within one session
		while (doYouWantToPlay) {
			//creating players for this particular game
			game = new Yatzy(); //new instance for the game is created
			playersInGame = game.createPlayers(); //first we create the players. Ask for names etc.
			playerScore = new int[playersInGame.length]; //array of scores is created. One for each player

			int tempScore = 0;
			int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
			int temp;
			int[] fiveDice = new int[5]; //
			
			
			//game.printScoreBoard();

			//looping each round
			for (int round = 0; round < ROUNDSNUMBER; round++) { //play 15 rounds

				//players throwing dice
				for (int l = 0; l < playersInGame.length; l++) {
					System.out.println("It's your turn player: " + playersInGame[l].name);

					// Roll five dice
					for (int i = 0; i < fiveDice.length; i++) {
						fiveDice[i] = DiceRoll.roll();

					}

					//Sort dice from lowest to highest
					for (int i = 1; i < fiveDice.length; i++) {
						for (int j = i; j > 0; j--) {
							if (fiveDice[j] < fiveDice[j - 1]) {
								temp = fiveDice[j];
								fiveDice[j] = fiveDice[j - 1];
								fiveDice[j - 1] = temp;
							}
						}
					}

					System.out.println("Your dice roll: " + java.util.Arrays.toString(fiveDice));
					

					// ------------------------------ First Reroll ---------------------------------------
					System.out.println("Which dice would you like to keep? Enter each number and separate with space");
					String diceToKeep = scanner.nextLine();
					String[] splitDiceToKeep = diceToKeep.split(" ");
					int[] diceKept = new int[splitDiceToKeep.length]; // Split the user input into an array
					
					for (int i = 0; i < splitDiceToKeep.length; i++) { // Loop through the array and parse each int
						String num = splitDiceToKeep[i];
						diceKept[i] = Integer.parseInt(num);
					}
					
					int[] reRoll1 = new int[5 - diceKept.length];
					
					for (int i = 0; i < reRoll1.length; i++) {
						reRoll1[i] = DiceRoll.roll(); 
					}					
					
					int[] reRollKept = new int[diceKept.length + reRoll1.length];
					System.arraycopy(diceKept, 0, reRollKept, 0, diceKept.length);
					System.arraycopy(reRoll1, 0, reRollKept, diceKept.length, reRoll1.length);
					
					
					System.out.println("Your dice roll: " + java.util.Arrays.toString(reRollKept));
					
					// -------------------------- Second reroll -----------------------------------
					System.out.println("Which dice would you like to keep? Enter each number and separate with space");
					String diceToKeep2 = scanner.nextLine();
					String[] splitDiceToKeep2 = diceToKeep2.split(" ");
					int[] diceKept2 = new int[splitDiceToKeep2.length]; // Split the user input into an array
					
					for (int i = 0; i < splitDiceToKeep2.length; i++) { // Loop through the array and parse each int
						String num = splitDiceToKeep2[i];
						diceKept2[i] = Integer.parseInt(num);
					}
					
					int[] reRoll2 = new int[5 - diceKept2.length];
					
					for (int i = 0; i < reRoll2.length; i++) {
						reRoll2[i] = DiceRoll.roll(); 
					}					
					
					int[] reRollKept2 = new int[diceKept2.length + reRoll2.length];
					System.arraycopy(diceKept2, 0, reRollKept2, 0, diceKept2.length);
					System.arraycopy(reRoll2, 0, reRollKept2, diceKept2.length, reRoll2.length);
					
					
					System.out.println("Your dice roll: " + java.util.Arrays.toString(reRollKept2));					
					
					
					// if the last player has thrown dice for the last time, we end the game
					if (round == ROUNDSNUMBER - 1 && l == playersInGame.length - 1) {
						System.out.println();
						System.out.println("Game over. We are counting the score.");
					} else {
						System.out.println("Thank you, next turn. Press Enter to continue");
						scanner.nextLine();
					}
				}
			}

			System.out.println("And the winner is!");
			System.out.println();

			//TODO the game is over
			//game.gameOver(); //is the game over?

			// set up a new game (or not)
			System.out.println("Do you want to play again? Print Y if you do, or anything else if you are tired.");
			char response = scanner.next().charAt(0);
			doYouWantToPlay = (response == 'Y'); // if Yes then doYouWantToPlay is true;
			System.out.println();
			System.out.println();
		}

		System.out.println("Thank you for playing with us");

		scanner.close();
	}
}
