public class MoveToSquareCard extends Card {

    private Square location;

    public MoveToSquareCard(String explanation){
        super(explanation);
    }

    @Override
    public void action(Player player) {
        player.getPawn().setLocation(this.location);
        System.out.println(" New location is: " + player.getPawn().getLocation().getName());
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
