public class PayMoneyCard extends Card {

    private int amount;

    public PayMoneyCard(String name, String explanation, int amount){
        super(name,explanation);
        this.amount = amount;
    }

    @Override
    public void action(Player player) {
        player.decreaseMoney(amount);
    }

}




