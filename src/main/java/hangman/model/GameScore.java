package hangman.model;

public interface GameScore {

    /**
     * General palette for game scoring calculation
     * @param correctCount: number of correct assertions
     * @param incorrectCount: number of incorrect assertions
     * @return calculated score
     */
    public int calculateScore(int correctCount, int incorrectCount);

}
