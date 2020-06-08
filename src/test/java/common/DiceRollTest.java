package common;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DiceRollTest {
    DiceRoll diceRoll = new DiceRoll();

    @Test
    public void rollSmallerThan6() {
        Assert.assertTrue(DiceRoll.roll() > 0 && DiceRoll.roll() <= 6);
    }

    @Test
    public void getRoundScore() {
    }

    //Can not test due to scanner inside function
    //@Test(expected = InterruptedException.class)
    //public void rerollThrowsException() throws InterruptedException {
//        int[] testRoll = new int[5];
//        diceRoll.reroll(testRoll);
    //}

    @Test
    public void get() {
    }

    @Test
    public void diceSort() {
        int[] originalFiveDice = new int[]{ 1, 7, 4, 5, 6};
        int[] expectedFiveDice = new int[]{ 1, 4, 5, 6, 7};
        diceRoll.diceSort(originalFiveDice);
        Assert.assertTrue(Arrays.equals(originalFiveDice, expectedFiveDice));
    }

    @Test
    public void diceSortEmptyArray() {
        int[] originalFiveDice = new int[]{};
        int[] expectedFiveDice = new int[]{};
        diceRoll.diceSort(originalFiveDice);
        Assert.assertTrue(Arrays.equals(originalFiveDice, expectedFiveDice));
    }
}