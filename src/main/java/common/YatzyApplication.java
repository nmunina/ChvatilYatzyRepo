package common;

import java.util.Scanner;

public class YatzyApplication {
	private final static int ROUNDSNUMBER = 15; //change easily to have quicker games. Needed for testing
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		DiceRoll diceRoll;
		boolean doYouWantToPlay = true;
		Player[] playersInGame; //array of players for this game
		Yatzy game;
		int[] playerScore;
		boolean firstReroll = false, secondReroll = false;

		//TODO: How do we play the game. Instructions
		System.out.println("H�r �r reglerna. Okej. L�t oss spela Yatzy!");

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
					System.out.println("Det �r din tur spelare: " + playersInGame[l].name);

					// Roll five dice
					diceRoll = new DiceRoll();
					for (int i = 0; i < fiveDice.length; i++) {
						fiveDice[i] = diceRoll.roll();
					}

					//Sort dice from lowest to highest
					diceRoll.diceSort(fiveDice);

					System.out.println("Dina t�rningar rullade: " + java.util.Arrays.toString(fiveDice));
					
					System.out.println("Vill du kasta igen? \n 1. Ja \n 2. Nej");
					int choice = scanner.nextInt();
					
					if (choice == 1 && firstReroll == false) {
						firstReroll = true;
						fiveDice = diceRoll.reroll(fiveDice);
						diceRoll.diceSort(fiveDice);
						System.out.println("Dina t�rningar efter omkastet �r: " + java.util.Arrays.toString(fiveDice));
						System.out.println("Vill du kasta igen? \n 1. Ja \n 2. Nej");
						choice = scanner.nextInt();
						
						if (choice == 1 && secondReroll == false) {
							secondReroll = true;
							fiveDice = diceRoll.reroll(fiveDice);
							diceRoll.diceSort(fiveDice);
							
//							System.out.println("Din runda po�ng �r " + DiceRoll.getRoundScore(fiveDice));
//							tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
//							System.out.println("Din spelpo�ng �r nu" + tempScore);
							
							Score.combinations(fiveDice);
						}
						else if (choice == 2) {
							
//							System.out.println("Din runda po�ng �r " + DiceRoll.getRoundScore(fiveDice));
//							tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
//							System.out.println("Din spelpo�ng �r nu " + tempScore);
							
							Score.combinations(fiveDice);
						}
						
						else {
							System.out.println("Felaktig input");
						}
					}

					else if (choice == 2) {
						
//						System.out.println("Din runda po�ng �r " + DiceRoll.getRoundScore(fiveDice));
//						tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
//						System.out.println("Din spelpo�ng �r nu " + tempScore);
//						System.out.println("Tack, n�sta tur. Tryck p� Enter f�r att forts�tta.\n");
						 
						Score.combinations(fiveDice);
						scanner.nextLine();

					}					
					
					else {
						System.out.println("Felaktig input");
					
						System.out.println(java.util.Arrays.toString(fiveDice));
					}

					// if the last player has thrown dice for the last time, we end the game
					if (round == ROUNDSNUMBER - 1 && l == playersInGame.length - 1) {
						System.out.println();
						System.out.println("Spelet �ver. Vi r�knar po�ngen.");
						Player.printPlayersScore();

					} else {
//						playersInGame[l].printPlayersScore();
						Thread.sleep(500);
						System.out.println("Tack, n�sta tur. Tryck p� Enter f�r att forts�tta.\n");
						scanner.nextLine();
					}
				}
			}

			System.out.println("Och vinnaren �r!");
			System.out.println();

			//TODO the game is over
			//game.gameOver(); //is the game over?

			// set up a new game (or not)
			System.out.println("Vill du spela igen? Skriv ut Y om du g�r det, eller n�got annat om du vill avsluta spelet.");
			char response = scanner.next().charAt(0);
			doYouWantToPlay = (response == 'Y'); // if Yes then doYouWantToPlay is true;
			System.out.println();
			System.out.println();
		}

		System.out.println("Tack f�r att du spelade med oss");

		scanner.close();
	}
}
