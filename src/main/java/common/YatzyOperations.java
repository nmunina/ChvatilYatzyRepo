package common;

import java.util.Scanner;

public class YatzyOperations {
	static DiceRoll diceRoll = new DiceRoll();
	static Scanner scanner = new Scanner(System.in);
	static Player[] players;

	//function to create array of players
	public static Player[] createPlayers() {
		System.out.println("Enter amount of players (1 - 4): ");
		int numPlayers = scanner.nextInt();
		
		players = new Player[numPlayers];

		//asking users for their names
		if ((numPlayers >= 1) && (numPlayers <= 4)) {
			for (int i = 0; i < players.length; i++) {
				players[i] = new Player();
				System.out.println("Player " + (i+1) + " enter your name :"); // "Player " + (i+1) + " enter your name :" (?)
				String name = scanner.next();
				players[i].name = name;
			}
			
		} else {
			System.out.println("Invalid input, try again.");
			createPlayers();
		}

		return players;
	}
}
