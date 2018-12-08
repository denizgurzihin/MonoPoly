import java.util.ArrayList;
import java.util.List;

public class Deck {
    public static final int SIZE = 16;
    private String name;
    private Card topCard;
    private List<Card> deck;

    public Deck(String name) {
        this.name=name;
        deck = new ArrayList<>(SIZE);

        //build deck
        for(int i=0; i<SIZE; i++){
            Card card = new RegularCard("Card "+i, "");
            deck.add(card);
        }

        deck.get(0).setName("Go");

    }

    public Card drawCard(){
        //pull card
        //send it bottom
        //set topCard
    }

    public void Shuffle(){
        //shuffle deck
    }

    public String getName() {
        return name;
    }

    public Card getTopCard() {
        return topCard;
    }
}
