public class GoToJailCard extends Card {

    private Square location;

    public GoToJailCard(String explanation){
        super(explanation);
    }

    @Override
    public void action(Player player) {
        player.getPawn().setLocation(this.location);
        player.setJailStatus(true);
        System.out.println(" " + player.getName() + " went to Jail.");
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}