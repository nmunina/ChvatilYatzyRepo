package snipets;

//here we store scratches that are not longer needed in the code, but we are not ready to delete them
public class Scratch {
    //					//kast 1
//					int result1 = DiceRoll.roll(); //TODO: it should be not stored here!
//					playersInGame[i].increaseScore(result1);
//					System.out.println("Your 1 roll dice show:  " + result1);
//					//player.increaseScore(DiceRoll.getPoints());
//					System.out.println("Your score is: " + playersInGame[i].getScore());
//
//					//kast 2
//					int result2 = DiceRoll.roll(); //TODO: it should be not stored here!
//					playersInGame[i].increaseScore(result2);
//					System.out.println("Your 2 roll dice show: " + result2); // TODO: player selected dice to roll DiceRoll.roll(Player.choise());
//					//player.increaseScore(DiceRoll.getPoints());
//					System.out.println("Your score is: " + playersInGame[i].getScore());
//
//					//kast 3
//					int result3 = DiceRoll.roll(); //TODO: it should be not stored here!
//					playersInGame[i].increaseScore(result3);
//					System.out.println("Your 3 roll dice show " + result3); // TODO: player selected dice to roll DiceRoll.roll(Player.choise());
//					//player.increaseScore(DiceRoll.getPoints());
//					System.out.println("Your score is: " +playersInGame[i].getScore());


    // ---------- One after one reroll function
    /*

					System.out.println("Your dice roll: " + java.util.Arrays.toString(fiveDice));

					System.out.println("Would you like to reroll? \n 1. Yes \n 2. No");
					int choice = scanner.nextInt();


					if (choice == 1 && firstReroll == false) {
						firstReroll = true;
						fiveDice = diceRoll.reroll(fiveDice);
						System.out.println(java.util.Arrays.toString(fiveDice));
						System.out.println("Would you like to reroll again? \n 1. Yes \n 2. No");
						choice = scanner.nextInt();

						if (choice == 1 && secondReroll == false) {
							secondReroll = true;
							fiveDice = diceRoll.reroll(fiveDice);
						}
						else if (choice == 2) {
							System.out.println("Your round score is " + DiceRoll.getRoundScore(fiveDice));
							tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
							System.out.println("Your game score by now is " + tempScore);
						}

						else {
							System.out.println("Illegal input");
						}
					}
//					// getting ready for incapsulation
//					DiceRoll roll = new DiceRoll();
//					roll.reRoll(diceToKeep);

					else if (choice == 2) {
						System.out.println("Your round score is " + DiceRoll.getRoundScore(fiveDice));
						tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
						System.out.println("Your game score by now is " + tempScore);
						System.out.println("Thank you, next turn. Press Enter to continue.\n");
						scanner.nextLine();

					}

					else {
						System.out.println("Illegal input");

						System.out.println(java.util.Arrays.toString(fiveDice));
					}


					firstReroll = false;
					secondReroll = false;

					//getting ready for incapsulation
					System.out.println("Your dice roll: " + java.util.Arrays.toString(fiveDice));
					System.out.println("Your round score is " + DiceRoll.getRoundScore(fiveDice));
					tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
					System.out.println("Your game score by now is " + tempScore);

     */

    // first reroll() implementation
    /*
    	public int[] reroll(int[] dice) {
		Scanner scanner = new Scanner(System.in);
		int tempZero = 0;
		int temp;
		int choice;
		int[] firstKeep = dice;
		System.out.println(java.util.Arrays.toString(dice));

		for (int k = 0; k < 5; k++) {

			System.out.println("Would you like to keep ");
			System.out.print("Die number " + (k + 1) + ": " + dice[k] + "? \n 1. Yes \n 2. No\n");
			choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("Ok, keep this one.");
			}
			else if (choice == 2) {
				firstKeep[k] = roll();
			}
			else {
				System.out.println("Input not recognized! Yes was chosen by default.");
				System.out.println("Keep this one.");
			}

//			for(int i = 0; i < firstKeep.length; i++){
//	            if(firstKeep[i] == tempZero){
//	                // shifting elements
//	                for(int j = i; j < firstKeep.length - 1; j++){
//	                    firstKeep[j] = firstKeep[j+1];
//	                }
//
//	                break;
//	            }
//	        }
//		}
//		int[] reRoll1 = new int[5 - firstKeep.length];
//
//		for (int i = 0; i < reRoll1.length; i++) {
//			reRoll1[i] = roll();
//		}
//
//		int[] firstKeep2 = new int[firstKeep.length + reRoll1.length];
//		System.arraycopy(firstKeep, 0, firstKeep2, 0, firstKeep.length);
//		System.arraycopy(reRoll1, 0, firstKeep2, firstKeep.length, reRoll1.length);
//
//
//		for (int i = 1; i < firstKeep2.length; i++) {
//			for (int j = i; j > 0; j--) {
//				if (firstKeep2[j] < firstKeep2[j - 1]) {
//					temp = firstKeep2[j];
//					firstKeep2[j] = firstKeep2[j - 1];
//					firstKeep2[j - 1] = temp;
//				}
//			}
	}

		return firstKeep;

	}

     */

    // changing turn
    /*

					firstReroll = false;
					secondReroll = false;

					//getting ready for incapsulation
					System.out.println("Your dice roll: " + java.util.Arrays.toString(fiveDice));
					System.out.println("Your round score is " + DiceRoll.getRoundScore(fiveDice));
					tempScore = playersInGame[l].increasePlayersScore(DiceRoll.getRoundScore(fiveDice));
					System.out.println("Your game score by now is " + tempScore);
     */


}
