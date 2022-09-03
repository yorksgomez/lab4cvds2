package hangman.model;

public class BonusScore implements GameScore {

    /**
     * The game starts with 0 points, add 10 points after correct assertions and
     * sustract 5 after fails, minimal points are 0
     * @param correctCount: number of correct assertions
     * @param incorrectCount: number of incorrect assertions
     * @return calculated score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 10 * correctCount;
        score -= 5 * incorrectCount;

        if(score < 0)
            score = 0;

        return score;
    }

}
