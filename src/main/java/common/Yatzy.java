package common;

public class Yatzy {

    protected String winner;

    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner(); // how do we know who is the winner?

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

    public void printScoreBoard() {
        System.out.println();
        System.out.println("Here should be a scoreboard");
        System.out.println();
    }

    //how does the game look like
	//user name(-s)
	//user score
	//who is the winner



}
