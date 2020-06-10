package common;

import org.junit.Test;

import junit.framework.Assert;
import snipets.SnippetsToTest;

import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void ShouldReturnTrue_IfRollIsStraight() {
    	// Arrange
    	int[] dice = {1, 2, 3, 4, 5};
    	int didItWork = 5;
    	// Act
    	didItWork = TestEnvironment.testStraight(dice);
    	
    	// Assert
    	assertEquals(5, didItWork);
    }
    @Test
    public void ShouldReturnTrue_IfRollIsYatzy() {
    	int[] dice = {3, 3, 3, 3, 3};
    	int didItWork = 5;
    	didItWork = TestEnvironment.testYatzy(dice);
    	
    	assertEquals(5, didItWork);
    }
}