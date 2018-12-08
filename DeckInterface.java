public interface DeckInterface {
    int SIZE = 17;
    //draw a card set it to topCard attribute
    Card drawCard();

    //shuffle deck
    void Shuffle();

    //get deck name
    String getName();

    //get top card of the deck
    Card getTopCard();
}

