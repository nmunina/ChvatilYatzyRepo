package common;

import java.util.Scanner;

public class YatzyApplication {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean doYouWantToPlay = true;

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

			// YatzyOperations.createPlayers(); //we start with 1 player on this sprint?

			Player player = new Player();
			System.out.println("We have created a Player: " + player.name);
				//for (int i = 0; i < YatzyOperations.createPlayers().length; i++) {

					//kast 1
					System.out.println("Your 1 roll result:  " + DiceRoll.roll());
					//player.increaseScore(DiceRoll.getPoints());
					System.out.println("Your score is: " + Player.getScore());

					//kast 2

					System.out.println("Your 2 roll result: " + DiceRoll.roll()); // TODO: player selected dice to roll DiceRoll.roll(Player.choise());
					//player.increaseScore(DiceRoll.getPoints());
					System.out.println(Player.getScore());

					//kast 3
					System.out.println("Your score is " + DiceRoll.roll()); // TODO: player selected dice to roll DiceRoll.roll(Player.choise());
					//player.increaseScore(DiceRoll.getPoints());
					System.out.println(Player.getScore());

					game.printScoreBoard();

					System.out.println("Thank you, next user turn");

//				}
//				game.gameOver(); //is the game over?
//
//				System.out.println("Your score board after this turn is: ");
//				game.printScoreBoard();
//				System.out.println(game.gameOver());
//
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
