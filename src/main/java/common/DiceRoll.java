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
		value = rand.nextInt(6);
		return value;
	}

	public static int getPoints() {
		//here we calculate points from all 5 Dice
		roundPoints = value;
		return roundPoints;
	}

	public int get() {
		return (value);
	}
}
