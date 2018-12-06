public class DrawCardSquare extends Square {
    private Deck deck;
    DrawCardSquare(String name, int location, Deck deck){
        super(name, location);
        this.deck=deck;
    }

    @Override
    public void landedOn(Player player) {
        deck.getCard().action(player);
    }
}
