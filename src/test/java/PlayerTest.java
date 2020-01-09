import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player1;
    Player player2;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
    }

    @Test
    public void playerStartsWithNoCards(){
        assertEquals(0,player1.getCards());
    }


}
