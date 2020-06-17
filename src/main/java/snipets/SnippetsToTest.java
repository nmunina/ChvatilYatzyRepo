package snipets;

import common.DiceRoll;
import common.Player;
import common.Score;

import java.security.PublicKey;
//import java.beans.JavaBean;
import java.util.Random;
import java.util.Scanner;


//here we can store and test/ code parts

public class SnippetsToTest {
	static Scanner scanner = new Scanner(System.in);
	static Player[] players;
	private static int value;
	private static Random rand = new Random();
	private static int roundPoints = 0;



	public static void main(String[] args) throws InterruptedException {
		int[] house22344 = new int[]{2, 2, 3, 4, 4};
		int countPairs = 0;

		for (int i = 0; i < house22344.length - 1; i++) {
			for (int j = i + 1; j < house22344.length; j++) {
				if (house22344[i] == house22344[j]) {
				// adding points
					countPairs++;

				}
			}
		}

		System.out.println("So many pairs found: " + countPairs);







//		value = rand.nextInt(6);
//		System.out.println(value);
//
//		boolean gameRunning = true;
//		boolean[] combinationsChecked = new boolean[15];
//		int[] combinationScore = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//		String[] combinations = { "Ettor", "Tv�or", "Treor", "Fyror", "Femmor", "Sexor", "Pair", "Two Pair",
//				"Tre av en sort", "Fyra av en sort", "Liten rak", "Stor rak", "Fullt hus", "Chans",
//				"Yatzy" };
//		String tempBoolString;
//		int tempScore = 0;
//		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
//		int temp;
//		int[] fiveDice = new int[5];
//		int par = 0;
//
//		// Store combinations and what combinations that are checked
//		for (int i = 0; i < combinationsChecked.length; i++) {
//			combinationsChecked[i] = false;
//		}
//
//		while (gameRunning) {
//
//			// Print Combinations checked or not, and score
//			for (int i = 0; i < combinations.length; i++) {
//				tempBoolString = Boolean.toString(combinationsChecked[i]) + " " + Integer.toString(combinationScore[i]);
//
//				System.out.println(combinations[i] + ": " + tempBoolString);
//			}
//
//			// NEW DICEROLL FEATURE, LESS TEXT AND IN SWEDISH
//
//			// roll five dice
//			for (int i = 0; i < fiveDice.length; i++) {
//				fiveDice[i] = DiceRoll.roll();
//			}
//
//			// sorting dice from smallest to largest
//			for (int i = 1; i < fiveDice.length; i++) {
//				for (int j = i; j > 0; j--) {
//					if (fiveDice[j] < fiveDice[j - 1]) {
//						temp = fiveDice[j];
//						fiveDice[j] = fiveDice[j - 1];
//						fiveDice[j - 1] = temp;
//					}
//				}
//			}
//			System.out.println(
//					"Vilka tarningar vill du spara? Skriv 1 for att spara eller 0 for att kasta. T.ex. 0 1 1 0 1 f�r att spara 2a, 3e och 5e t�rningen");
//			System.out.println(java.util.Arrays.toString(fiveDice));
//
//			// Store choices in str
//			String choice = scanner.nextLine();
//			// Split into string array
//			String[] splitChosen = choice.split(" ");
//
//			// Parse the string array into an int array
//			int[] dieArr = new int[5];
//			for (int i = 0; i < 5; i++) {
//				dieArr[i] = Integer.parseInt(splitChosen[i]);
//			}
//			// Just a little pause to build up a suspense
//			Thread.sleep(2000);
//
//			// Check which dice to reroll
//			for (int i = 0; i < dieArr.length; i++) {
//				if (dieArr[i] == 0) {
//					fiveDice[i] = DiceRoll.roll();
//				}
//			}
//			// Print the new array of dice
//			System.out.println(java.util.Arrays.toString(fiveDice));
//
//			// Waiting for enter to be pressed
//			scanner.nextLine();
//
//			// Counts the number occurances of the dice
//			for (int i = 0; i < fiveDice.length; i++) {
//				if (fiveDice[i] == 1) {
//					one++;
//				}
//				if (fiveDice[i] == 2) {
//					two++;
//				}
//				if (fiveDice[i] == 3) {
//					three++;
//				}
//				if (fiveDice[i] == 4) {
//					four++;
//				}
//				if (fiveDice[i] == 5) {
//					five++;
//				}
//				if (fiveDice[i] == 6) {
//					six++;
//				}
//			}
//			// score board points
//			System.out.println("Po�ngval");
//
//			System.out.println("1. Ettor");
//			System.out.println("2. Tv�or");
//			System.out.println("3. Treor");
//			System.out.println("4. Fyror");
//			System.out.println("5. Femmor");
//			System.out.println("6. Sexor");
//			System.out.println("Summa 1-6: ");
//			System.out.println("Bonus: ");
//			System.out.println("7. Ett par");
//			System.out.println("8. Tv� par");
//			System.out.println("9. Triss");
//			System.out.println("10. Fyrtal");
//			System.out.println("11. Liten stege");
//			System.out.println("12. Stor stege");
//			System.out.println("13. K�k");
//			System.out.println("14. Chans");
//			System.out.println("15. YATZY!");
//			System.out.println("Total summa: ");
//			System.out.println("vart vill du spara dina t�ningar?");
//
//
////			if (one > 0) {
////				System.out.println("1. Ettor");
////			}
////			if (two > 0) {
////				System.out.println("2. Tv�or");
////			}
////			if (three > 0) {
////				System.out.println("3. Treor");
////			}
////			if (four > 0) {
////				System.out.println("4. Fyror");
////			}
////			if (five > 0) {
////				System.out.println("5. Femmor");
////			}
////			if (six > 0) {
////				System.out.println("6. Sexor");
////			}
//
//			int choice2 = scanner.nextInt();
//			switch (choice2) {
//
//			case 1:
//				System.out.println("Po�ng i ettor: " + (one * 1));
//				tempScore += (one * 1);
//				combinationScore[0] = (one * 1);
//				combinationsChecked[0] = true;
//				break;
//			case 2:
//				System.out.println("Po�ng i tv�or: " + (two * 2));
//				tempScore += (two * 2);
//				combinationScore[1] = (two * 2);
//				combinationsChecked[1] = true;
//				break;
//			case 3:
//				System.out.println("Po�ng i treor: " + (three * 3));
//				tempScore += (three * 3);
//				combinationScore[2] = (three * 3);
//				combinationsChecked[2] = true;
//				break;
//			case 4:
//				System.out.println("Po�ng i fyror: " + (four * 4));
//				tempScore += (four * 4);
//				combinationScore[3] = (four * 4);
//				combinationsChecked[3] = true;
//				break;
//			case 5:
//				System.out.println("Po�ng i femmor: " + (five * 5));
//				tempScore += (five * 5);
//				combinationScore[4] = (five * 5);
//				combinationsChecked[4] = true;
//				break;
//			case 6:
//				System.out.println("Po�ng i sexor: " + (six * 6));
//				tempScore += (six * 6);
//				combinationScore[5] = (six * 6);
//				combinationsChecked[5] = true;
//				break;
//			case 7:
//				 System.out.println("Po�ng i ett par: ");
//				break;
//			case 8:
//				System.out.println("Po�ng i tv� par: ");
//				break;
//			case 9:
//				System.out.println("Po�ng i triss: ");
//				break;
//			case 10:
//				System.out.println("Po�ng i fyrtal");
//				break;
//			case 11:
//				System.out.println("Po�ng i liten stege: ");
//				break;
//			case 12:
//				System.out.println("Po�ng i stor stege: ");
//				break;
//			case 13:
//				System.out.println("Po�ng i k�k: ");
//				break;
//			case 14:
//				System.out.println("Po�ng i chans: ");
//				break;
//			case 15:
//				System.out.println("Po�ng i YATZY: ");
//				break;
//
//			default:
//				System.out.println("Felaktig input");
//				break;
//			}
//
//			if (choice2 == 1 && one > 0) {
//				System.out.println("Po�ng i ettor: " + (one * 1));
//				tempScore += (one * 1);
//				combinationScore[0] = (one * 1);
//				combinationsChecked[0] = true;
//			} else if (choice2 == 2 && two > 0) {
//
//				System.out.println("Po�ng i tv�or: " + (two * 2));
//				tempScore += (two * 2);
//				combinationScore[1] = (two * 2);
//				combinationsChecked[1] = true;
//			}
//
//			else if (choice2 == 3 && three > 0) {
//				System.out.println("Po�ng i treor: " + (three * 3));
//				tempScore += (three * 3);
//				combinationScore[2] = (three * 3);
//				combinationsChecked[2] = true;
//			}
//
//			else if (choice2 == 4 && four > 0) {
//				System.out.println("Po�ng i fyror: " + (four * 4));
//				tempScore += (four * 4);
//				combinationScore[3] = (four * 4);
//				combinationsChecked[3] = true;
//			}
//
//			else if (choice2 == 5 && five > 0) {
//				System.out.println("Po�ng i femmor: " + (five * 5));
//				tempScore += (five * 5);
//				combinationScore[4] = (five * 5);
//				combinationsChecked[4] = true;
//			}
//
//			else if (choice2 == 6 && six > 0) {
//				System.out.println("Po�ng i sexor: " + (six * 6));
//				tempScore += (six * 6);
//				combinationScore[5] = (six * 6);
//				combinationsChecked[5] = true;
//			}
//
//
////			else {
//
//				// TODO
//				/*
//				 * Implement the option to enter a blank score
//				 */
//			}
//
//			// Lower scoreboard points
////			}
////
////	        // Small Straight
////	        for (int i = 0; i < fiveDice.length; i++) {
////				if (fiveDice[i] == (i + 1)) {
////					System.out.println("Score in small straight: 15");
////					tempScore += 15;
////					combinationScore[6] = 15;
////					combinationsChecked[6] = true;
////				}
////				else {
////					tempScore += 0;
////					combinationsChecked[6] = true;
////				}
////			}
////	        // Regular Straight
////	        for (int i = 0; i < fiveDice.length; i++) {
////				if (fiveDice[i] == (i + 2)) {
////					System.out.println("Score in regular straight: 20");
////					tempScore += 20;
////					combinationScore[7] = 20;
////					combinationsChecked[7] = true;
////				}
////				else {
////					tempScore += 0;
////					combinationsChecked[7] = true;
////				}
////			}
//		}

	}
}
