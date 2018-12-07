public class CollectMoneyCard extends Card{

    private int amount;

    public CollectMoneyCard(String name, String explanation, int amount){
        super(name,explanation);
        this.amount = amount;
    }

    @Override
    public void action(Player player) {
       player.increaseMoney(amount);
    }






}
