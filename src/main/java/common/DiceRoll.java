package common;

import java.util.Random;

public class DiceRoll {
	//TODO: implement this for 5 dice
	private static Random rand = new Random();
	
	private static int value;
	private static int roundPoints = 0;

	//is it constructor? Could you please comment what is this doing and why. Couldnot get
	//what's the differemce with roll()? Isn't roll() enough?
//	public DiceRoll() {
//	    value = 0;
//	    rand = new Random();
//	}
	 
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
