package common;

public class Yatzy {

    protected String winner;

    // TODO how do we know who is the winner?
    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();

        if(didSomeoneWin) {
            return "We have a winner! The winner is " + this.winner + "'s";
        } else {
            return "notOver";
        }

    }
    private boolean isThereAWinner() {
        //TODO: how do we get the winner
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
