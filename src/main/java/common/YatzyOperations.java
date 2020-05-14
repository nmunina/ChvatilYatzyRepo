package common;

import java.util.Scanner;

public class YatzyOperations {
	static DiceRoll diceRoll = new DiceRoll();
	static Scanner scanner = new Scanner(System.in);
	
	public static int newRound() {
		int newRoll = diceRoll.get();
		System.out.println(newRoll);
		return newRoll;
	}
	
//	public static Player[] createPlayers() {
//
//
//		//enter number of players
//		System.out.println("Enter amount of players (1 - 4): ");
//		int numPlayers = scanner.nextInt();
//		Player[] players = new Player[numPlayers];
//
//		if ((numPlayers >= 1) || (numPlayers <= 4)) {
//
//			for (int i = 0; i < players.length; i++) {
//				Player player = new Player();
//
//				System.out.println("Player " + (i+1) + " enter your name :"); // "Player " + (i+1) + " enter your name :" (?)
//				String name = scanner.nextLine();
//				player.name = name;
//				System.out.println("why do not ask?");
//
//			}
//
//		scanner.close();
//		} //TODO: else {error message}
//		
//		return players;
//	}
	public String[] createPlayers(int amount) {
		String[] players = new String[amount];
		String tempName;
		for (int i = 0; i < players.length; i++) {
			System.out.println("Player " + (i + 1) + " enter your name: ");
			tempName = scanner.nextLine();
			players[i] = tempName; 
		}
		
		return players;
	}
}
