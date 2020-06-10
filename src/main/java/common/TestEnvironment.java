package common;

public class TestEnvironment {
	public TestEnvironment(){
		
	}
	public static int testStraight(int[] testDice) {
		int count = 0;
		for (int i = 0; i < testDice.length; i++) {
			if (testDice[i] == (i+1)) {
				count++;
			}
		}
		return count;
	}
	public static int testYatzy(int[] dice) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < dice.length; i++) {
			for (int j = 0; j < dice.length; j++) {
				if (j == i) {
					count++;
				}
			}
		}
		return count;
		
	}
}
