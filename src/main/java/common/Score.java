package common;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
	private static int tempScore = 0;
	public static Scanner scanner = new Scanner(System.in);
	static int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
	//private static boolean[] combinationsChecked = new boolean[15];
	//private static int[] combinationScore = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; //move to player
	//public static Player score = new Player();
	
	public static void combinations(int[] diceRolls) {
		tempScore = 0;
		//count occurances in dice Roll
		countOccurrences(diceRolls);

		//TODO: add check to see if score is already used (combinationsChecked bool)
		System.out.println(java.util.Arrays.toString(diceRolls));

		// Upper score board points
		printBoard();

		//System.out.println("Total summa: ");
		Player.printPlayersScore();//Show player score
		System.out.println("vart vill du spara dina täningar?");
		
		int choice2 = scanner.nextInt();
		
		switch (choice2) {
		
		case 1:
			System.out.println("Poäng i ettor: " + (one * 1));
			Player.increasePlayersScore(0, one * 1); // increase and mark combination checked
			break;
		case 2:
			System.out.println("Poäng i tvåor: " + (two * 2));
			Player.increasePlayersScore(1, two * 2);
			break;
		case 3:
			System.out.println("Poäng i treor: " + (three * 3));
			Player.increasePlayersScore(2,three * 3);
			break;
		case 4:
			System.out.println("Poäng i fyror: " + (four * 4));
			Player.increasePlayersScore(3,four * 4);
			break;
		case 5:
			System.out.println("Poäng i femmor: " + (five * 5));
			Player.increasePlayersScore(4, five * 5);
			break;
		case 6:
			System.out.println("Poäng i sexor: " + (six * 6));
			Player.increasePlayersScore(5, six * 6);
			break;
			
		case 7:
			
			if (six >= 2) {
				tempScore = (six * 2);
			}
			else if (five >= 2) {
				tempScore = (five * 2);
			}
			else if (four >= 2) {
				tempScore = (four * 2);
			}
			else if (three >= 2) {
				tempScore = (three * 2);
			}
			else if (two >= 2) {
				tempScore = (two * 2);
			}
			else if (one >= 2) {
				tempScore = (one * 2);
			}
			System.out.println("Poäng i par: " + tempScore);
			Player.increasePlayersScore(6, tempScore);
			break;
		case 8:
			
			tempScore = 0;
			if ((diceRolls[0] == diceRolls[1]) && (diceRolls[2] == diceRolls[3])) {
				for (int i = 0; i < (diceRolls.length - 1); i++) {
					tempScore += diceRolls[i];
					
				}
			}
			else if ( (diceRolls[1] == diceRolls[2]) && (diceRolls[3] == diceRolls[4])) {
				for (int i = 1; i < diceRolls.length; i++) {
					tempScore += diceRolls[i];
				}
			}

			System.out.println("Poäng i två par: " + tempScore);
			Player.increasePlayersScore(7, tempScore);
			break;
		case 9:
			if ( (diceRolls[0] == diceRolls[2]) || (diceRolls[1] == diceRolls[3]) || (diceRolls[2] == diceRolls[4]) ) {
				tempScore = (diceRolls[2] * 3);
			}

			System.out.println("Poäng i triss: " + tempScore);
			Player.increasePlayersScore(8, tempScore);
			break;
		case 10:
			if ((diceRolls[0] == diceRolls[3]) || (diceRolls[1] == diceRolls[4])) {
				tempScore = diceRolls[2] * 4;
			}

			System.out.println("Poäng i fyrtal: " + tempScore);
			Player.increasePlayersScore(9, tempScore);
			
			break;
		case 11:

//			for (int i = 0; i < diceRolls.length; i++) {
//				if (diceRolls[i] == (i+1)) {
					Player.increasePlayersScore(10, 15);
//				}
//			}
			System.out.println("Poäng i liten stege: 15");
			break;
		case 12:

//			for (int i = 0; i < diceRolls.length; i++) {
//				if (diceRolls[i] == (i+2)) {
					Player.increasePlayersScore(11, 20);
//				}
//			}
			System.out.println("Poäng i stor stege: 20");
			break;
		case 13:

			if ( (((diceRolls[0] == diceRolls[1]) && (diceRolls[1] == diceRolls[2])) &&
					(diceRolls[3] == diceRolls[4]) &&
					(diceRolls[2] != diceRolls[3])) ||
					((diceRolls[0] == diceRolls[1]) &&
					((diceRolls[2] == diceRolls[3]) && 
					(diceRolls[3] == diceRolls[4])) &&
					(diceRolls[1] != diceRolls[2]))) {
				tempScore = Arrays.stream(diceRolls).sum();
				Player.increasePlayersScore(12, tempScore);
				System.out.println("Poäng i kåk: " + tempScore);
			}
			break;
		case 14:

			tempScore = Arrays.stream(diceRolls).sum();
			Player.increasePlayersScore(13, tempScore);
			System.out.println("Poäng i chans: " + tempScore);
			break;
		case 15:

			if (diceRolls[0] == diceRolls[4]) {
				tempScore = 50;
				Player.increasePlayersScore(14, tempScore);
				System.out.println("Poäng i YATZY: " + tempScore);
			}
			
			break;

		default:
			System.out.println("Felaktig input");
			break;
		}
			// TODO
			/*
			 * Implement the option to enter a blank score
			 */
		}

	private static void printBoard() {
		int upperTotal = Arrays.stream(Player.upperScore).sum();
		
		System.out.println("Poängval");

		System.out.println("1. Ettor: " + Player.combinationTotal(0));
		System.out.println("2. Tvåor: " + Player.combinationTotal(1));
		System.out.println("3. Treor: " + Player.combinationTotal(2));
		System.out.println("4. Fyror: " + Player.combinationTotal(3));
		System.out.println("5. Femmor: " + Player.combinationTotal(4));
		System.out.println("6. Sexor: " + Player.combinationTotal(5));
		System.out.println("Summa 1-6: " + upperTotal); //combined score of upper section
		System.out.println("Bonus: " + Player.bonus(Player.upperScore)); //if combined score is 63 or more, add 50 points in bonus
		System.out.println("7. Ett par: " + Player.combinationTotal(6));
		System.out.println("8. Två par: " + Player.combinationTotal(7));
		System.out.println("9. Triss: " + Player.combinationTotal(8));
		System.out.println("10. Fyrtal: " + Player.combinationTotal(9));
		System.out.println("11. Liten stege: " + Player.combinationTotal(10));
		System.out.println("12. Stor stege: " + Player.combinationTotal(11));
		System.out.println("13. Kåk: " + Player.combinationTotal(12));
		System.out.println("14. Chans: " + Player.combinationTotal(13));
		System.out.println("15. YATZY!: " + Player.combinationTotal(14));
	}

	private static void countOccurrences(int[] diceRolls) {
		one = 0; two = 0; three = 0; four = 0; five = 0; six = 0;
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
	}

}
