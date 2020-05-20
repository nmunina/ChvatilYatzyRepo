package common;

import java.util.Arrays;
import java.util.Random;

public class DiceRoll {
	
	private static int value;
	private static int roundPoints = 0;
	private static int[] reRollKept;
	int temp;
	
	public static int roll() {
		value = (int)(Math.random() * 6) + 1;
		return value;
	}

	public int[] reRoll(String diceToKeep) {
		String[] splitDiceToKeep = diceToKeep.split(" ");
		int[] diceKept = new int[splitDiceToKeep.length]; // Split the user input into an array

		for (int i = 0; i < splitDiceToKeep.length; i++) { // Loop through the array and parse each int
			String num = splitDiceToKeep[i];
			diceKept[i] = Integer.parseInt(num);
		}

		int[] reRoll1 = new int[5 - diceKept.length];

		for (int i = 0; i < reRoll1.length; i++) {
			reRoll1[i] = DiceRoll.roll();
		}

		int[] reRollKept = new int[diceKept.length + reRoll1.length];
		System.arraycopy(diceKept, 0, reRollKept, 0, diceKept.length);
		System.arraycopy(reRoll1, 0, reRollKept, diceKept.length, reRoll1.length);

		for (int i = 1; i < reRollKept.length; i++) {
			for (int j = i; j > 0; j--) {
				if (reRollKept[j] < reRollKept[j - 1]) {
					temp = reRollKept[j];
					reRollKept[j] = reRollKept[j - 1];
					reRollKept[j - 1] = temp;
				}
			}
		}

		System.out.println("Your dice roll: " + java.util.Arrays.toString(reRollKept));
		return reRollKept;
	}

	//TODO calculate points from all 5 Dice
	public static int getRoundScore(int[] reRollKept) {
		roundPoints = reRollKept[0] + reRollKept[1] + reRollKept[2] + reRollKept[3] + reRollKept[4];;
		return roundPoints;
	}

	//TODO calculation of all possible combinations
	public int get() {
		return (value);
	}








}
