package topic13;

import org.junit.Test;
import topic13.BowlingGame.BowlingGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class topic13Test {


    @Test
    public void testBw() throws Exception {

        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }

         assertEquals(0, bowlingGame.score());


    }
}
