package pl.mb.bowling;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameTest {

    @Test
    public void gutterGame() {
        Game g = new Game();
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }

        assertThat(g.score()).isEqualTo(0);
    }
}
