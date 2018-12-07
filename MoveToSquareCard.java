public class MoveToSquareCard extends Card {

    private Square location;

    public MoveToSquareCard(String name, String explanation,Square location){
        super(name,explanation);
        this.location = location;

    }

    @Override
    public void action(Player player) {
        player.getPawn().setLocation(this.location);
    }
}
