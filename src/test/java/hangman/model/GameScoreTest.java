package hangman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Checks game score class is working correctly
 * Also tests using the classes OriginalScore, BonusScore, PowerScore
 */
public class GameScoreTest {

    @Test
    public void Given_6Correct4Incorrect_When_OriginalScore_Then_ShouldReturn60() {
        //Arrage
        int expected = 60;
        int testingCorrect = 6,
            testingIncorrect = 4;

        //Action
        int actual = new OriginalScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_6Correct100Incorrect_When_OriginalScore_Then_ShouldReturn60() {
        //Arrage
        int expected = 60;
        int testingCorrect = 100,
                testingIncorrect = 4;

        //Action
        int actual = new OriginalScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_0Correct0Incorrect_When_OriginalScore_Then_ShouldReturn100() {
        //Arrage
        int expected = 100;
        int testingCorrect = 0,
                testingIncorrect = 0;

        //Action
        int actual = new OriginalScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_6Correct4Incorrect_When_BonusScore_Then_ShouldReturn40() {
        //Arrage
        int expected = 40;
        int testingCorrect = 6,
                testingIncorrect = 4;

        //Action
        int actual = new BonusScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_6Correct100Incorrect_When_BonusScore_Then_ShouldReturn0() {
        //Arrage
        int expected = 0;
        int testingCorrect = 6,
                testingIncorrect = 100;

        //Action
        int actual = new BonusScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_0Correct0Incorrect_When_BonusScore_Then_ShouldReturn0() {
        //Arrage
        int expected = 0;
        int testingCorrect = 0,
                testingIncorrect = 0;

        //Action
        int actual = new BonusScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_6Correct4Incorrect_When_PowerScore_Then_ShouldReturn19498() {
        //Arrage
        int expected = 19498;
        int testingCorrect = 6,
                testingIncorrect = 4;

        //Action
        int actual = new PowerScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_1Correct4Incorrect_When_PowerScore_Then_ShouldReturn0() {
        //Arrage
        int expected = 0;
        int testingCorrect = 1,
                testingIncorrect = 4;

        //Action
        int actual = new PowerScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_0Correct0Incorrect_When_PowerScore_Then_ShouldReturn0() {
        //Arrage
        int expected = 0;
        int testingCorrect = 0,
                testingIncorrect = 0;

        //Action
        int actual = new PowerScore().calculateScore(testingCorrect, testingIncorrect);

        //Assert
        assertEquals(expected, actual);
    }

}