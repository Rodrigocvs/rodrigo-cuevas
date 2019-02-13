package topic13;

import org.junit.Before;
import org.junit.Test;
import topic13.BowlingGame.BowlingGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class topic13Test {

    private BowlingGame bowlingGame;
    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }


    @Test
    public void testBw() throws Exception {


        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }
         assertEquals(0, bowlingGame.score());
    }


    @Test
    public void TestAllOnes() throws Exception {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(1);
        }
        assertEquals(20, bowlingGame.score());
    }
}
