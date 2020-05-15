package common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YatzyApplication {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean doYouWantToPlay = true;
		Player[] playingThisGame;

		//TODO: How do we play the game. Instructions
		
		//start the game
		
		
		while (doYouWantToPlay) {
			//keep playing

			System.out.println("Here should be the rules. All right. Let's play Yatzy!");

			//TODO: decide, how to have Yatzy and YatzyOperations as one class. No need for two classes I think.
			Yatzy game = new Yatzy();

			// set up the game
			System.out.println("Now we can start the game. ");
			game.printScoreBoard(); //implement later

			//while (game.gameOver().equals("notOver")) {

			//creating players for this particular game
			playingThisGame = YatzyOperations.createPlayers();
				for (int i = 0; i < playingThisGame.length; i++) {
					System.out.println("It's your turn player: " + playingThisGame[i].name);

					//kast 1
					int result1 = DiceRoll.roll(); //TODO: it should be not stored here!
					playingThisGame[i].increaseScore(result1);
					System.out.println("Your 1 roll dice show:  " + result1);
					//player.increaseScore(DiceRoll.getPoints());
					System.out.println("Your score is: " + playingThisGame[i].getScore());

					//kast 2
					int result2 = DiceRoll.roll(); //TODO: it should be not stored here!
					playingThisGame[i].increaseScore(result2);
					System.out.println("Your 2 roll dice show: " + result2); // TODO: player selected dice to roll DiceRoll.roll(Player.choise());
					//player.increaseScore(DiceRoll.getPoints());
					System.out.println("Your score is: " + playingThisGame[i].getScore());

					//kast 3
					int result3 = DiceRoll.roll(); //TODO: it should be not stored here!
					playingThisGame[i].increaseScore(result3);
					System.out.println("Your 3 roll dice show " + result3); // TODO: player selected dice to roll DiceRoll.roll(Player.choise());
					//player.increaseScore(DiceRoll.getPoints());
					System.out.println("Your score is: " +playingThisGame[i].getScore());

					game.printScoreBoard();

					System.out.println("Thank you, next player turn. Press Enter to continue");
					//TODO: implement press Enter to continue
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
				System.out.println("Do you want to play again? Print Y if you do, or anything else if you are tired.");
				//TODO Again proplem with scanner next :( It's something dealing with several nextLine() in code
				// Probably we could use Buffered reader?
				// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//				char response = scanner.next().charAt(0);
//				doYouWantToPlay = (response == 'Y'); // if Yes then doYouWantToPlay is true;
//				System.out.println();
//				System.out.println();

		}

		System.out.println("Thank you for playing with us");

		scanner.close();
	}
}
