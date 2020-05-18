package common;

import java.util.Scanner;

public class YatzyApplication {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean doYouWantToPlay = true;
		Player[] playersInGame; //array of players for this game
		Yatzy game;

		//TODO: How do we play the game. Instructions
		System.out.println("Here should be the rules. All right. Let's play Yatzy!");

		//start the game
		// set up the game
		System.out.println("Now we can start the game. ");

		game = new Yatzy(); //new instance for the game is created
		playersInGame = Yatzy.createPlayers(); //first we create the players. Ask for names etc.

		int[] playerScore = new int[playersInGame.length]; //array of scores is created. One for each player
		int tempScore = 0;
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        int temp;
        int[] fiveDice = new int[5]; //

		//this while would be used to have different games within one session. Now it
		while (doYouWantToPlay) {
			//keep playing

			//TODO: decide, how to have Yatzy and YatzyOperations as one class. No need for two classes I think.
			
			//game.printScoreBoard();

			//while (game.gameOver().equals("notOver")) { //play 15 times

			//creating players for this particular game and looping each round
				for (int l = 0; l < playersInGame.length; l++) {
					System.out.println("It's your turn player: " + playersInGame[l].name);


					//game.printScoreBoard();
					
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
					
			        
			        // Reroll feature in progress
			        System.out.println("Would you like to reroll? (Y/N)");
//			        String choice = scanner.nextLine();
//			        switch (choice) {
//					case "y":
//					case "yes":
//					case "Y":
//					case "Yes":
//						{
//							System.out.println("How many dice would you like to keep? (1 - 5)");
//							int keepAmount = scanner.nextInt();
//							System.out.println("Which dice would you like to keep? Enter the corresponding value and press enter for each die");
//							int[] firstKeep = new int[keepAmount];
//							for (int i = 0; i < firstKeep.length; i++) {
//								temp = scanner.nextInt();
//								for (int j = 0; j < fiveDice.length; j++) {
//									if (temp == fiveDice[j]) {
//										firstKeep[i] = temp; 
//									}
//									else {
//										System.out.println("You didn't roll that number.");
//									}
//								}
//								
//							}
//							
//							
//							
//						}
//						break;
//					case "N":
//					case "n":
//					case "no":
//					case "No":
//					{
//						
//					}
//						break;
//					default:
//						break;
//					}

					System.out.println("Thank you, next turn. Press Enter to continue");
			        scanner.nextLine();

				}

				//TODO the game is over
//				game.gameOver(); //is the game over?
//
//				System.out.println("Your score board after this turn is: ");
//				game.printScoreBoard();
//				System.out.println(game.gameOver());
//
				// set up a new game (or not)
				//System.out.println("Do you want to play again? Print Y if you do, or anything else if you are tired.");
//				char response = scanner.next().charAt(0);
//				doYouWantToPlay = (response == 'Y'); // if Yes then doYouWantToPlay is true;
//				System.out.println();
//				System.out.println();

		}

		System.out.println("Thank you for playing with us");

		scanner.close();
	}
}
