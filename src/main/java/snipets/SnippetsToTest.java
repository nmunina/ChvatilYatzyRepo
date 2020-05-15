package snipets;

import common.DiceRoll;
import common.Player;

import java.util.Random;
import java.util.Scanner;

//here we can store and test/ code parts

public class SnippetsToTest {
    static Scanner scanner = new Scanner(System.in);
    static Player[] players;
    private static int value;
    private static Random rand = new Random();
    private static int roundPoints = 0;


    public static void main(String[] args) {

        value = rand.nextInt(6);
        System.out.println(value);
        
        
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        
        int[] fiveDice = new int[5];
        for (int i = 0; i < fiveDice.length; i++) {
			fiveDice[i] = DiceRoll.roll();
			
		}
        System.out.println(java.util.Arrays.toString(fiveDice));
        
        for (int i = 0; i < fiveDice.length; i++) {
			if (fiveDice[i] == 1) {
				one++;
			}
			if (fiveDice[i] == 2) {
				two++;
			}
			if (fiveDice[i] == 3) {
				three++;
			}
			if (fiveDice[i] == 4) {
				four++;
			}
			if (fiveDice[i] == 5) {
				five++;
			}
			if (fiveDice[i] == 6) {
				six++;
			}	
		}
        
        System.out.println("Which score do you want to see?");
        System.out.println("1. Ones");
        System.out.println("2. Twos");
        System.out.println("3. Threes");
        System.out.println("4. Fours");
        System.out.println("5. Fives");
        System.out.println("6. Sixes");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
		case 1:
		{
			System.out.println("Score in ones: " + (one * 1));
		}
			break;
		case 2:
		{
			System.out.println("Score in twos: " + (two * 2));
		}
			break;
		case 3:
		{
			System.out.println("Score in threes: " + (three * 3));
		}
			break;
		case 4:
		{
			System.out.println("Score in fours: " + (four * 4));
		}
			break;
		case 5:
		{
			System.out.println("Score in fives: " + (five * 5));
		}
			break;
		case 6:
		{
			System.out.println("Score in sixes: " + (six * 6));
		}
			break;
		default:
			System.out.println("No score here.");
			break;
		}
        
    }
}
