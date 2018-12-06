import java.util.ArrayList;
import java.util.List;

public class Deck {
    public static final int SIZE = 16;
    private String name;

    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>(SIZE);

        //build deck
        for(int i=0; i<SIZE; i++){
            Card card = new RegularCard("Card "+i, "");
            deck.add(card);
        }

        deck.get(0).setName("Go");

    }

    public Card getCard(){
        //pull card
        //send it bottom
        return newCard;
    }

    public void Shuffle(){
        //shuffle deck
    }
}
