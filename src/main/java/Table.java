import java.util.ArrayList;

public class Table {
    Deck deck;
    ArrayList<Player> players;

    public Table() {
        this.deck = new Deck();
        this.players = new ArrayList<Player>();
    }

    public int getPlayers(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void populateDeck(){
        this.deck.populate();
    }

    public int countCardsInDeck(){
        return this.deck.getCards();
    }

//    public void shuffleDeck(){
//        this.deck.shuffle();
//    }


    public void dealToPlayer(Player player) {
        player.addCard(this.deck.deal(this.deck.getFirstCard()));
    }
}
