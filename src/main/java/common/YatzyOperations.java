package common;

import java.util.Scanner;

public class YatzyOperations {
	static DiceRoll diceRoll = new DiceRoll();
	static Scanner scanner = new Scanner(System.in);
	static Player[] players;
	
	public static int newRound() {
		int newRoll = diceRoll.get();
		System.out.println(newRoll);
		return newRoll;
	}
	
	public static Player[] createPlayers() {


		//enter number of players
		System.out.println("Enter amount of players (1 - 4): ");
		int numPlayers = scanner.nextInt();
		players = new Player[numPlayers];

		if ((numPlayers >= 1) || (numPlayers <= 4)) {

			for (int i = 0; i < players.length; i++) {
				players[i] = new Player();

				System.out.println("Player " + (i+1) + " enter your name :"); // "Player " + (i+1) + " enter your name :" (?)
				String name = scanner.next();
				players[i].name = name;

			}

			System.out.print("Welcome players: ");
			for (Player e: players) {
				System.out.print(e.name + " ");
			}
			System.out.println();
			System.out.println();

			scanner.close();
		} //TODO: else {error message}

		return players;
	}
//	public String[] createPlayers(int amount) {
//		String[] players = new String[amount];
//		String tempName;
//		for (int i = 0; i < players.length; i++) {
//			System.out.println("Player " + (i + 1) + " enter your name: ");
//			tempName = scanner.nextLine();
//			players[i] = tempName;
//		}
//
//		return players;
//	}


}
