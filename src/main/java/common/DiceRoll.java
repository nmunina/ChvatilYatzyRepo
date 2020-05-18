package common;

import java.util.Random;

public class DiceRoll {
	
	private static int value;
	private static int roundPoints = 0;
	
	public static int roll() {
		value = (int)(Math.random() * 6) + 1;
		return value;
	}

	//TODO calculate points from all 5 Dice
	public static int getPoints() {
		roundPoints = value;
		return roundPoints;
	}

	//TODO calculation of all possible combinations

	public int get() {
		return (value);
	}
}
