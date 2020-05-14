package common;

import java.util.Scanner;

public class YatzyOperations {
	static DiceRoll diceRoll = new DiceRoll();
	
	public static int newRound() {
		int newRoll = diceRoll.get();
		System.out.println(newRoll);
		return newRoll;
	}
	
	public static String[] createPlayers(int numPlayers) {
		Scanner scanner = new Scanner(System.in);
		String[] players = new String[numPlayers];
		
		for (int i = 0; i < players.length; i++) {
			System.out.println("Player " + (i+1) + ":");
			players[i] = scanner.nextLine();
		}
		scanner.close();
		
		return players;
	}
	
}
