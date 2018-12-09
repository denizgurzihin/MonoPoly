public class DrawCardSquare extends Square {
    private DeckInterface deck;

    public DrawCardSquare(String name, int location, DeckInterface deck){
        super(name, location);
        this.deck=deck;
    }

    @Override
    public void landedOn(Player player) {
        System.out.println(" " + player.getName() + " draws card from :"+ deck.getName());
        deck.drawCard();
        System.out.println("  " + deck.getTopCard().getExplanation());
        deck.getTopCard().action(player);
    }
}
