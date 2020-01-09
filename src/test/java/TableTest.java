import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableTest {
    private Deck deck;
    private Player player1;
    private Player player2;
    private Table table;
    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        table =  new Table();
    }

    @Test
    public void startsWithZeroPlayers(){
        assertEquals(0, table.getPlayers());
    }

    @Test
    public void canAddPlayer(){
        table.addPlayer(player1);
        assertEquals(1,table.getPlayers());
    }

    @Test
    public void hasDeck(){
        assertEquals(0,table.countCardsInDeck());
    }

    @Test
    public void canPopulate(){
        table.populateDeck();
        assertEquals(52, table.countCardsInDeck());
    }

    @Test
    public void dealsToPlayer(){
        table.populateDeck();
        table.deck.shuffle();
        table.dealToPlayer(player1);

        assertEquals(1,player1.getCards());
    }
}
