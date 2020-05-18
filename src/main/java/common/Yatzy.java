package common;

import java.util.Scanner;

public class Yatzy {

    protected String winner;
    static DiceRoll diceRoll = new DiceRoll();
    static Scanner scanner = new Scanner(System.in);
    static Player[] players;

    //function to create array of players
    public static Player[] createPlayers() {
        System.out.println("Enter amount of players (1 - 4): ");
        int numPlayers = scanner.nextInt();

        players = new Player[numPlayers];

        //asking users for their names
        if ((numPlayers >= 1) && (numPlayers <= 4)) {
            for (int i = 0; i < players.length; i++) {
                players[i] = new Player();
                System.out.println("Player " + (i+1) + " enter your name :"); // "Player " + (i+1) + " enter your name :" (?)
                String name = scanner.next();
                players[i].name = name;
            }

        } else {
            System.out.println("Invalid input, try again.");
            createPlayers();
        }

        return players;
    }


    // TODO after 15 rounds we choose a winner.
    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();

        if(didSomeoneWin) {
            return "We have a winner! The winner is " + this.winner + "'s";
        } else {
            return "notOver";
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
        System.out.println("Here should be a scoreboard");
        System.out.println();
    }
}
