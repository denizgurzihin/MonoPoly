public class CollectMoneyCard extends Card{

    private int amount;

    public CollectMoneyCard(String explanation, int amount){
        super(explanation);
        this.amount = amount;
    }

    @Override
    public void action(Player player) {
       player.increaseMoney(amount);
    }

}
