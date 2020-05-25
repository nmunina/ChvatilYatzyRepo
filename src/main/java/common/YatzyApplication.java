package common;

import java.util.Scanner;

public class YatzyApplication {
	private final static int ROUNDSNUMBER = 3; //change easily to have quicker games. Needed for testing
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		DiceRoll diceRoll;
		boolean doYouWantToPlay = true;
		Player[] playersInGame; //array of players for this game
		Yatzy game;
		int[] playerScore;
		boolean firstReroll = false, secondReroll = false;

		//TODO: How do we play the game. Instructions
		System.out.println("Här är reglerna. Okej. Låt oss spela Yatzy!");

		System.out.println("Nu kan vi starta spelet. ");

		//while (doYouWantToPlay) is used to have different games within one session
		while (doYouWantToPlay) {
			//creating players for this particular game
			game = new Yatzy(); //new instance for the game is created
			playersInGame = game.createPlayers(); //first we create the players. Ask for names etc.
			playerScore = new int[playersInGame.length]; //array of scores is created. One for each player

			int tempScore = 0;
			int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
			int temp;
			int[] fiveDice = new int[5]; //

			//looping each round
			for (int round = 0; round < ROUNDSNUMBER; round++) { //play 15 rounds

				//players throwing dice
				for (int l = 0; l < playersInGame.length; l++) {
					System.out.println("Det är din tur spelare: " + playersInGame[l].name);

					// Roll five dice
					diceRoll = new DiceRoll();
					for (int i = 0; i < fiveDice.length; i++) {
						fiveDice[i] = diceRoll.roll();
					}

					//Sort dice from lowest to highest
					diceRoll.diceSort(fiveDice);

					System.out.println("Din tärning rullar: " + java.util.Arrays.toString(fiveDice));
					
					System.out.println("Vill du rullar igen? \n 1. Ja \n 2. Nej");
					int choice = scanner.nextInt();
					
					if (choice == 1 && firstReroll == false) {
						firstReroll = true;
						fiveDice = diceRoll.reroll(fiveDice);
						System.out.println("Your dice roll after first reroll is: " + java.util.Arrays.toString(fiveDice));
						System.out.println("Would you like to reroll again? \n 1. Ja \n 2. Nej");
						choice = scanner.nextInt();
						
						if (choice == 1 && secondReroll == false) {
							secondReroll = true;
							fiveDice = diceRoll.reroll(fiveDice);
							System.out.println("Din runda poäng är " + DiceRoll.getRoundScore(fiveDice));
							tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
							System.out.println("Din spelpoäng är nu" + tempScore);

						}
						else if (choice == 2) {
							System.out.println("Din runda poäng är " + DiceRoll.getRoundScore(fiveDice));
							tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
							System.out.println("Din spelpoäng är nu " + tempScore);
						}
						
						else {
							System.out.println("Illegal input");
						}
					}

					else if (choice == 2) {
						System.out.println("Din runda poäng är " + DiceRoll.getRoundScore(fiveDice));
						tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
						System.out.println("Din spelpoäng är nu " + tempScore);
						//System.out.println("Thank you, next turn. Press Enter to continue.\n");
						scanner.nextLine();

					}					
					
					else {
						System.out.println("Illegal input");
					
						System.out.println(java.util.Arrays.toString(fiveDice));
					}

					// if the last player has thrown dice for the last time, we end the game
					if (round == ROUNDSNUMBER - 1 && l == playersInGame.length - 1) {
						System.out.println();
						System.out.println("Spelet över. Vi räknar poängen.");
					} else {
//						playersInGame[l].printPlayersScore();
						Thread.sleep(500);
						System.out.println("Tack, nästa tur. Tryck på Enter för att fortsätta.\n");
						scanner.nextLine();
					}
				}
			}

			System.out.println("Och vinnaren är!");
			System.out.println();

			//TODO the game is over
			//game.gameOver(); //is the game over?

			// set up a new game (or not)
			System.out.println("Vill du spela igen? Skriv ut Y om du gör det, eller något annat om du är trött.");
			char response = scanner.next().charAt(0);
			doYouWantToPlay = (response == 'Y'); // if Yes then doYouWantToPlay is true;
			System.out.println();
			System.out.println();
		}

		System.out.println("Tack för att du spelade med oss");

		scanner.close();
	}
}
