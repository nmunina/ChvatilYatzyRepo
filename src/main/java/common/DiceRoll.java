package common;

import java.util.Scanner;

public class DiceRoll {
	
	private static int value;
	private static int roundPoints = 0;
	
	public static int roll() {
		value = (int)(Math.random() * 6) + 1;
		return value;
	}

	//TODO calculate points from all 5 Dice
	public static int getRoundScore(int[] reRollKept) {
		roundPoints = reRollKept[0] + reRollKept[1] + reRollKept[2] + reRollKept[3] + reRollKept[4];;
		return roundPoints;
	}
	
	// First and Second Reroll
	public int[] reroll(int[] dice) {
		Scanner scanner = new Scanner(System.in);
		int temp;
		int choice;
		
		System.out.println("How many dice would you like to keep? (1-5)");
		choice = scanner.nextInt();
		int[] firstKeep = new int[choice];
		
		System.out.println("Would you like to keep ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Die number " + (i + 1) + ": " + dice[i] + "? \n 1. Yes \n 2. No\n");
			choice = scanner.nextInt();
			if (choice == 1) {
				firstKeep[i] = dice[i];
			}
		}
		int[] reRoll1 = new int[5 - firstKeep.length];
		
		for (int i = 0; i < reRoll1.length; i++) {
			reRoll1[i] = DiceRoll.roll(); 
		}	
		
		int[] firstKeep2 = new int[firstKeep.length + reRoll1.length];
		System.arraycopy(firstKeep, 0, firstKeep2, 0, firstKeep.length);
		System.arraycopy(reRoll1, 0, firstKeep2, firstKeep.length, reRoll1.length);
		
		
		for (int i = 1; i < firstKeep2.length; i++) {
			for (int j = i; j > 0; j--) {
				if (firstKeep2[j] < firstKeep2[j - 1]) {
					temp = firstKeep2[j];
					firstKeep2[j] = firstKeep2[j - 1];
					firstKeep2[j - 1] = temp;
				}
			}
		}
		scanner.close();
		return firstKeep2;
		
	}
	

	//TODO calculation of all possible combinations

	public int get() {
		return (value);
	}
}
