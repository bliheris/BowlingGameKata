package pl.mb.bowling;

public class Game {

    private int score;

    public Game() {
        score = 0;
    }

    public void roll(int knockedPins) {
        score += knockedPins;
    }

    public int score() {
        return score;
    }
}
