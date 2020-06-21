package common;

import java.util.Scanner;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Random;

public class DiceRoll {
	
	private static int value;
	private static int roundPoints = 0;
	int temp;
	
	public static int roll() {
		value = (int)(Math.random() * 6) + 1;
		return value;
	}

	//TODO calculate points from all 5 Dice
	public static int getRoundScore(int[] reRollKept) {
		roundPoints = Arrays.stream(reRollKept).sum();
		return roundPoints;
	}
		
	// First and Second Reroll
	public int[] reroll(int[] fiveDice) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int tempZero = 0;
		int temp;
		int[] firstKeep;

		System.out.println("Vilka t�rningar vill du spara? Skriv 1 for att spara eller 0 f�r att kasta. T.ex. 0 1 1 0 1 f�r att spara 2a, 3e och 5e t�rningen");

		try	{
			String choice = scanner.nextLine();

			String[] splitChosen = choice.split(" ");

			// Parse the string array into an int array
			int[] dieArr = new int[5];
			for (int i = 0; i < 5; i++) {
				dieArr[i] = Integer.parseInt(splitChosen[i]);
			}

			// Just a little pause to build up a suspense
			Thread.sleep(500);

			// Check which dice to reroll
			for (int i = 0; i < dieArr.length; i++) {
				if (dieArr[i] == 0) {
					fiveDice[i] = DiceRoll.roll();
				}
			}
		} catch (Exception e) {
			System.out.println("Felaktig input, f�rs�k igen.");
		}

		firstKeep = fiveDice;

		return firstKeep;
		
	}
	

	//TODO calculation of all possible combinations
	public int get() {
		return (value);
	}

	public void diceSort(int[] fiveDice) {
		for (int i = 1; i < fiveDice.length; i++) {
			for (int j = i; j > 0; j--) {
				if (fiveDice[j] < fiveDice[j - 1]) {
					temp = fiveDice[j];
					fiveDice[j] = fiveDice[j - 1];
					fiveDice[j - 1] = temp;
				}
			}
		}
	}
}
