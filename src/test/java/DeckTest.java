import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    Deck deck;
    Deck deck2;
    Deck deck3;
    Card card1;
    Card card2;
    Card card3;
    @Before
    public void before(){
        deck2= new Deck();
        deck = new Deck();
        deck3 = new Deck();
        card1= new Card(SuitType.HEARTS,RankType.ACE);
        card2= new Card(SuitType.DIAMONDS,RankType.FIVE);
        card3= new Card(SuitType.CLUBS,RankType.JACK);
    }

    @Test
    public void hasEmptyDeck(){
        assertEquals(0, deck.getCards());
    }

    @Test
    public void putCardsOnDeck(){
        deck.addCard(card1);
        assertEquals(1,deck.getCards());
    }

    @Test
    public void canShuffleDeck(){
        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);
        deck2.addCard(card1);
        deck2.addCard(card2);
        deck2.addCard(card3);
        deck2.shuffle();

        assertNotEquals(deck.getFirstRankValue(),deck2.getFirstRankValue());
    }


    @Test
    public void canDealCard(){
        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);

        assertEquals(card1,deck.deal(card1));

    }

    @Test
    public void canGetFullDeck(){
        deck3.populate();
        assertEquals(52,deck3.getCards());
    }


}

