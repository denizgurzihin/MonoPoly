public class TaxSquare extends Square{
    private int taxAmount;

    public TaxSquare(String name, int location,int taxAmount){
        super(name, location);
        this.taxAmount=taxAmount;
    }

    @Override
    public void landedOn(Player player) {
        player.decreaseMoney(taxAmount);
        System.out.println(" " + player.getName() + " paid "+taxAmount+" for taxes.");
    }
}
