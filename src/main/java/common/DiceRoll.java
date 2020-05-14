package common;

import java.util.Random;

public class DiceRoll {
	
	private int value;
	  private Random rand;
	 
	  public DiceRoll() {
	    value = 0;
	    rand = new Random();
	  }
	 
	  public void roll() {
	    value = 1 + rand.nextInt(6);
	  }
	 
	  public int get() {
	    return (value);
	  }
}
