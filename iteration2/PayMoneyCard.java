public class PayMoneyCard extends Card {

    private int amount;

    public PayMoneyCard(String explanation, int amount){
        super(explanation);
        this.amount = amount;
    }

    @Override
    public void action(Player player) {
        player.decreaseMoney(amount);
    }

}




