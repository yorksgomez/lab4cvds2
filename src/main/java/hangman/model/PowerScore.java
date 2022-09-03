package hangman.model;

public class PowerScore implements GameScore{

    /**
     * Starting with 0 points, n letter is bonified with 5^n points,
     * incorrect assertions sustract 8 points, minimal points are 0 and
     * maximum points are 500
     * @param correctCount: number of correct assertions
     * @param incorrectCount: number of incorrect assertions
     * @return calculated score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }

}
