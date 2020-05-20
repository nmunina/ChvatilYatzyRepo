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
		//roundPoints = reRollKept[0] + reRollKept[1] + reRollKept[2] + reRollKept[3] + reRollKept[4];
		roundPoints = Arrays.stream(reRollKept).sum(); // More compact, ready for testing
		return roundPoints;
	}
		
	// First and Second Reroll
	public int[] reroll(int[] dice) {
		Scanner scanner = new Scanner(System.in);
		int temp;
		int amountToKeep;
		int choice;
		System.out.println("How many dice would you like to keep? (1-5)");
		amountToKeep = scanner.nextInt();
		int[] firstKeep = new int[5];
		System.out.println(java.util.Arrays.toString(dice));
		
		for (int k = 0; k < firstKeep.length; k++) {

			System.out.println("Would you like to keep ");
			System.out.print("Die number " + (k + 1) + ": " + dice[k] + "? \n 1. Yes \n 2. No\n");
			choice = scanner.nextInt();
			if (choice == 1) {
				firstKeep[k] = dice[k];
			}
			else if (choice == 2) {
				firstKeep[k] = 0; 
			}
			else {
				System.out.println("Input not recognized! No was chosen by default.");
				firstKeep[k] = 0; 
			}
			
			for(int i = 0; i < firstKeep.length; i++){
	            if(firstKeep[i] == 0){
	                // shifting elements
	                for(int j = i; j < firstKeep.length - 1; j++){
	                    firstKeep[j] = firstKeep[j+1];
	                }
	                break;
	            }
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
