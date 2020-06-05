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
		//TODO 
		//add check to see if score is already used (combinationsChecked bool)
		System.out.println(java.util.Arrays.toString(diceRolls));

		System.out.println("Poängval");

		System.out.println("1. Ettor");
		System.out.println("2. Tvåor");
		System.out.println("3. Treor");
		System.out.println("4. Fyror");
		System.out.println("5. Femmor");
		System.out.println("6. Sexor");
		System.out.println("Summa 1-6: ");
		System.out.println("Bonus: ");
		System.out.println("7. Ett par");
		System.out.println("8. Två par");
		System.out.println("9. Triss");
		System.out.println("10. Fyrtal");
		System.out.println("11. Liten stege");
		System.out.println("12. Stor stege");
		System.out.println("13. Kåk");
		System.out.println("14. Chans");
		System.out.println("15. YATZY!");
		System.out.println("Total summa: ");
		System.out.println("vart vill du spara dina täningar?");
		
		int choice2 = scanner.nextInt();
		
		switch (choice2) {
		
		case 1:
			System.out.println("Poäng i ettor: " + (one * 1));
			tempScore += (one * 1);
			combinationScore[0] = (one * 1);
			combinationsChecked[0] = true;
			break;
		case 2:
			System.out.println("Poäng i tvåor: " + (two * 2));
			tempScore += (two * 2);
			combinationScore[1] = (two * 2);
			combinationsChecked[1] = true;
			break;
		case 3:
			System.out.println("Poäng i treor: " + (three * 3));
			tempScore += (three * 3);
			combinationScore[2] = (three * 3);
			combinationsChecked[2] = true;
			break;
		case 4:
			System.out.println("Poäng i fyror: " + (four * 4));
			tempScore += (four * 4);
			combinationScore[3] = (four * 4);
			combinationsChecked[3] = true;
			break;
		case 5:
			System.out.println("Poäng i femmor: " + (five * 5));
			tempScore += (five * 5);
			combinationScore[4] = (five * 5);
			combinationsChecked[4] = true;
			break;
		case 6:
			System.out.println("Poäng i sexor: " + (six * 6));
			tempScore += (six * 6);
			combinationScore[5] = (six * 6);
			combinationsChecked[5] = true;
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
			break;
		case 12:
			System.out.println("Poäng i stor stege: ");
			break;
		case 13:
			System.out.println("Poäng i kåk: ");
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
	}
