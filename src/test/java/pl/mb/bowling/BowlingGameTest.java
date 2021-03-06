package pl.mb.bowling;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameTest {

    private Game g;

    @Before
    public void setUp(){
        g = new Game();
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);
        assertThat(g.score()).isEqualTo(0);
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1);
        assertThat(g.score()).isEqualTo(20);
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertThat(g.score()).isEqualTo(16);
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertThat(g.score()).isEqualTo(24);
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertThat(g.score()).isEqualTo(300);
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollMany(int rolls, int knockedPins){
        for (int i = 0; i < rolls; i++) {
            g.roll(knockedPins);
        }
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }
}
