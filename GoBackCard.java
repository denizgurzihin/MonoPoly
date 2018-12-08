public class GoBackCard extends Card {

    private Square location;

    public GoBackCard(String explanation){
        super(explanation);
    }

    @Override
    public void action(Player player) {
        player.getPawn().setLocation(this.location.getIndex()-3);
        System.out.println(" New location is: " + player.getPawn().getLocation().getName());
        player.getPawn().getLocation().landedOn(player);
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}