package common;

import java.util.Scanner;

public class Yatzy {

    protected String winner;
    static DiceRoll diceRoll = new DiceRoll();
    static Scanner scanner = new Scanner(System.in);
    static Player[] players;

    //function to create array of players
    public Player[] createPlayers() {
        System.out.println("Välj antal spelare (1 - 4): ");

        //handling InvalidInputException
        int numPlayers = 0;
        boolean bError = true;
        while (bError) {
            if (scanner.hasNextInt())
                numPlayers = scanner.nextInt();
            else {
                System.out.println("Felaktig input, försök igen.");
                scanner.next();
                continue;
            }
            bError = false;
        }


        players = new Player[numPlayers];

        //asking users for their names

        if ((numPlayers >= 1) && (numPlayers <= 4)) {
            for (int i = 0; i < players.length; i++) {
                players[i] = new Player();
                System.out.println("Spelare " + (i+1) + " ange ditt namn :"); // "Player " + (i+1) + " enter your name :" (?)
                String name = scanner.next();
                players[i].name = name;
            }

        } //else {
//            System.out.println("Invalid input, try again.");
//            createPlayers();
//        }

        return players;
    }


    // TODO after 15 rounds we choose a winner.
    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();

        if(didSomeoneWin) {
            return "Vi har en vinnare! Vinnaren är " + this.winner + "'s";
        } else {
            return "inte Över";
        }

    }

    //TODO this particular is not needed. Winning mekanism can be implemented in gameOver()
    private boolean isThereAWinner() {
        //TODO: how do we get the winner
        //compare all players score and make players variable winner = true.
        return false;
    }

    //TODO draw a scorebord template (empty board)
    //TODO fill in the scoreboard
    public void printScoreBoard() {
        System.out.println();
        System.out.println("Här borde vara en resultattavla");
        System.out.println();
    }
}
