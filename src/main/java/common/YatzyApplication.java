package common;

import java.util.Scanner;

public class YatzyApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean doYouWantToPlay = true;

		//TODO: How do we play the game. Instructions
		
		//start the game
		
		
		while (doYouWantToPlay) {
			//keep playing

			System.out.println("All right. Let's play Yatzy!");

			//enter number of players
			System.out.println("Enter amount of players (1 - 4): ");
			int numPlayers = scanner.nextInt();
			if ((numPlayers >= 1) || (numPlayers <= 4)) {
				YatzyOperations.createPlayers(numPlayers);
			}
			
			//create new game instance
			YatzyOperations

			//TODO: play until the game is over


			scanner.close();
		}
	}
}
