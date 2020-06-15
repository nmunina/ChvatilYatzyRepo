package common;

import java.util.Scanner;

public class Score {
	private static int tempScore = 0;
	public static Scanner scanner = new Scanner(System.in);
	static int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
	//private static boolean[] combinationsChecked = new boolean[15];
	//private static int[] combinationScore = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; //move to player
	//public static Player score = new Player();

	public static void combinations(int[] diceRolls) {

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
			 System.out.println("Poäng i ett par: ");
			break;
		case 8:
			System.out.println("Poäng i två par: ");
			break;
		case 9:
			System.out.println("Poäng i triss: ");
			break;
		case 10:
			System.out.println("Poäng i fyrtal");
			break;
		case 11:
			System.out.println("Poäng i liten stege: ");
			for (int i = 0; i < diceRolls.length; i++) {
				if (diceRolls[i] == (i+1)) {
					Player.increasePlayersScore(10, 15);
				}
			}
			break;
		case 12:
			System.out.println("Poäng i stor stege: ");
			for (int i = 0; i < diceRolls.length; i++) {
				if (diceRolls[i] == (i+2)) {
					Player.increasePlayersScore(11, 20);
//					combinationScore[11] += 20;
//					combinationsChecked[11] = true;
					
				}
			}
			break;
		case 13:
			System.out.println("Poäng i kåk: ");
			for (int i = 0; i < diceRolls.length; i++) {
				if( (((diceRolls[0] == diceRolls[1]) && (diceRolls[1] == diceRolls[2])) &&
						(diceRolls[3] == diceRolls[4]) &&
						(diceRolls[2] != diceRolls[3])) ||
						((diceRolls[0] == diceRolls[1]) &&
						((diceRolls[2] == diceRolls[3]) && 
						(diceRolls[3] == diceRolls[4])) &&
						(diceRolls[1] != diceRolls[2]))) {
					
				}
			}
			break;
		case 14:
			System.out.println("Poäng i chans: ");
			break;
		case 15:
			System.out.println("Poäng i YATZY: ");
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

		System.out.println("Poängval");

		System.out.println("1. Ettor: " + Player.combinationTotal(0));
		System.out.println("2. Tvåor: " + Player.combinationTotal(1));
		System.out.println("3. Treor: " + Player.combinationTotal(2));
		System.out.println("4. Fyror: " + Player.combinationTotal(3));
		System.out.println("5. Femmor: " + Player.combinationTotal(4));
		System.out.println("6. Sexor: " + Player.combinationTotal(5));
		System.out.println("Summa 1-6: "); //combined score of upper section
		System.out.println("Bonus: "); //if combined score is 63 or more, add 50 points in bonus
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

	public static void pointsHouse(int[] diceRolls){
		System.out.println("Poäng i kåk: ");
		for (int i = 0; i < diceRolls.length; i++) {
			if( (((diceRolls[0] == diceRolls[1]) && (diceRolls[1] == diceRolls[2])) &&
					(diceRolls[3] == diceRolls[4]) &&
					(diceRolls[2] != diceRolls[3])) ||
					((diceRolls[0] == diceRolls[1]) &&
					((diceRolls[2] == diceRolls[3]) && (diceRolls[3] == diceRolls[4])) &&
					(diceRolls[1] != diceRolls[2]))) {
				System.out.println("true");
			} else System.out.println("false");
		}
	}
}
