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
        int score = -(incorrectCount * 8);

        for(int i = 1; i <= correctCount; i++)
            score += Math.pow(5, i);

        if(score < 0)
            score = 0;

        return score;
    }

}
