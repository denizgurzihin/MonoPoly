public class DrawCardSquare extends Square {
    private Deck deck;

    public DrawCardSquare(String name, int location, Deck deck){
        super(name, location);
        this.deck=deck;
    }

    @Override
    public void landedOn(Player player) {
        deck.drawCard().action(player);
        System.out.println(" " + player.getName() + " draws card from "+ deck.getName());
        System.out.println("  " + deck.getTopCard().getName()+": "+deck.getTopCard().getExplanation());
    }
}
