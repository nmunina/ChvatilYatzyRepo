package common;


import java.beans.JavaBean;
import java.util.Arrays;
import java.util.Scanner;

public class YatzyApplication {
	private final static int ROUNDSNUMBER = 3; //change easily to have quicker games. Needed for testing
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		DiceRoll diceRoll = new DiceRoll();
		boolean doYouWantToPlay = true;
		Player[] playersInGame; //array of players for this game
		Yatzy game;
		int[] playerScore;
		boolean firstReroll = false, secondReroll = false;

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
					
					System.out.println("Would you like to reroll? \n 1. Yes \n 2. No");
					int choice = scanner.nextInt();
					
					
					if (choice == 1 && firstReroll == false) {
						firstReroll = true;
						fiveDice = diceRoll.reroll(fiveDice);
						System.out.println(java.util.Arrays.toString(fiveDice));
						System.out.println("Would you like to reroll again? \n 1. Yes \n 2. No");
						choice = scanner.nextInt();
						
						if (choice == 1 && secondReroll == false) {
							secondReroll = true;
							fiveDice = diceRoll.reroll(fiveDice);
						}
						else if (choice == 2) {
							System.out.println("Your round score is " + DiceRoll.getRoundScore(fiveDice));
							tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
							System.out.println("Your game score by now is " + tempScore);
						}
						
						else {
							System.out.println("Illegal input");
						}
					}
//					// getting ready for incapsulation
//					DiceRoll roll = new DiceRoll();
//					roll.reRoll(diceToKeep);

					else if (choice == 2) {
						System.out.println("Your round score is " + DiceRoll.getRoundScore(fiveDice));
						tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
						System.out.println("Your game score by now is " + tempScore);
					}					
					
					else {
						System.out.println("Illegal input");
					
						System.out.println(java.util.Arrays.toString(fiveDice));
					}
					
					
					firstReroll = false;
					secondReroll = false;
					
//					//getting ready for incapsulation
					System.out.println("Your dice roll: " + java.util.Arrays.toString(fiveDice));
					System.out.println("Your round score is " + DiceRoll.getRoundScore(fiveDice));
					tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));


					System.out.println("Your game score by now is " + tempScore);


					// if the last player has thrown dice for the last time, we end the game
					if (round == ROUNDSNUMBER - 1 && l == playersInGame.length - 1) {
						System.out.println();
						System.out.println("Game over. We are counting the score.");
					} else {
						playersInGame[l].printPlayersScore();
						System.out.println("Thank you, next turn. Press Enter to continue.\n");
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
