public class TaxSquare extends Square{
    private int taxAmount;

    TaxSquare(String name, int location){
        super(name, location);
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public void landedOn(Player player) {
        player.decreaseMoney(taxAmount);
    }
}
