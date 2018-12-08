public class MoveAndCollectMoneyCard extends  Card{
    private Square location;
    private int amount;

    public MoveAndCollectMoneyCard(String explanation, int amount){
        super(explanation);
        this.amount=amount;
    }

    @Override
    public void action(Player player) {
        player.getPawn().setOldLocation(player.getLocation());
        player.getPawn().setLocation(this.location);
        if (player.getPawn().getOldLocation().getIndex() >= player.getPawn().getLocation().getIndex()) {
            player.increaseMoney(amount);
            System.out.println(" " + player.getName() + " collects 200$ for passing Go Square");
        }
        System.out.println(" New location is: " + player.getPawn().getLocation().getName());
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
