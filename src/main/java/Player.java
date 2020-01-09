import java.awt.geom.Area;
import java.util.ArrayList;

public class Player {
    private ArrayList<Card> cards;

    public Player() {
        this.cards = new ArrayList<Card>();
    }


    public int getCards() {
        return this.cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }
}
