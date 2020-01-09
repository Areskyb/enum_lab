import java.text.DecimalFormat;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }


    int getCards() {
        return this.cards.size();
    }
}
