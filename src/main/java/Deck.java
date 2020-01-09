import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }


    int getCards() {
        return this.cards.size();
    }


    void addCard(Card card) {
        this.cards.add(card);
    }


     void shuffle() {
         Collections.shuffle(cards);
    }



    int getFirstRankValue() {
        return this.cards.get(0).getRankValue();
    }

    Card getFirstCard(){
        return this.cards.get(0);
    }


    public Card deal(Card card) {
        this.cards.remove(card);
        return card;
    }

     void populate(){
//        ArrayList<Card> newDeck = null;

        for (SuitType suit : SuitType.values()) {

            for(RankType rank : RankType.values()){
                Card card = new Card(suit,rank);
                this.cards.add(card);
            }
        }
//        this.cards = newDeck;

    }

}
