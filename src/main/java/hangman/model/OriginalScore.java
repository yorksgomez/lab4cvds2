package hangman.model;

public class OriginalScore implements GameScore {

    /**
     * Starting with 100 points, correct count doesnt matters, and
     * sustract 10 points when failing, minimum points are 0
     * @param correctCount: number of correct assertions
     * @param incorrectCount: number of incorrect assertions
     * @return calculated score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
