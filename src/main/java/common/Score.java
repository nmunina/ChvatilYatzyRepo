package common;

import java.util.Scanner;

public class Score {
	private static int tempScore = 0;
	public static Scanner scanner = new Scanner(System.in);
	private static boolean[] combinationsChecked = new boolean[15];
	private static int[] combinationScore = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public static void combinations(int[] diceRolls) {
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
		// Counts the number occurances of the dice
		for (int i = 0; i < diceRolls.length; i++) {
			if (diceRolls[i] == 1) {
				one++;
			}
			if (diceRolls[i] == 2) {
				two++;
			}
			if (diceRolls[i] == 3) {
				three++;
			}
			if (diceRolls[i] == 4) {
				four++;
			}
			if (diceRolls[i] == 5) {
				five++;
			}
			if (diceRolls[i] == 6) {
				six++;
			}
		}
		// Upper score board points
		System.out.println(java.util.Arrays.toString(diceRolls));

		System.out.println("Poängval");

		if (one > 0) {
			System.out.println("1. Ettor");
		}
		if (two > 0) {
			System.out.println("2. Tvåor");
		}
		if (three > 0) {
			System.out.println("3. Treor");
		}
		if (four > 0) {
			System.out.println("4. Fyror");
		}
		if (five > 0) {
			System.out.println("5. Femmor");
		}
		if (six > 0) {
			System.out.println("6. Sexor");
		}

		int choice2 = scanner.nextInt();
		if (choice2 == 1 && one > 0) {
			System.out.println("Score in ones: " + (one * 1));
			tempScore += (one * 1);
			combinationScore[0] = (one * 1);
			combinationsChecked[0] = true;
		} else if (choice2 == 2 && two > 0) {

			System.out.println("Score in twos: " + (two * 2));
			tempScore += (two * 2);
			combinationScore[1] = (two * 2);
			combinationsChecked[1] = true;
		}

		else if (choice2 == 3 && three > 0) {
			System.out.println("Score in threes: " + (three * 3));
			tempScore += (three * 3);
			combinationScore[2] = (three * 3);
			combinationsChecked[2] = true;
		}

		else if (choice2 == 4 && four > 0) {
			System.out.println("Score in fours: " + (four * 4));
			tempScore += (four * 4);
			combinationScore[3] = (four * 4);
			combinationsChecked[3] = true;
		}

		else if (choice2 == 5 && five > 0) {
			System.out.println("Score in fives: " + (five * 5));
			tempScore += (five * 5);
			combinationScore[4] = (five * 5);
			combinationsChecked[4] = true;
		}

		else if (choice2 == 5 && five > 0) {
			System.out.println("Score in sixes: " + (six * 6));
			tempScore += (six * 6);
			combinationScore[5] = (six * 6);
			combinationsChecked[5] = true;
		}

		else {
			// TODO
			/*
			 * Implement the option to enter a blank score
			 */
		}
	}

}
