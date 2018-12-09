public class GoToJailSquare extends Square {
    private Square jailLocation;

    public GoToJailSquare(String name, int location, Square jailLocation){
        super(name, location);
        this.jailLocation=jailLocation;
    }

    @Override
    public void landedOn(Player player) {
        player.getPawn().setLocation(jailLocation);
        player.setJailStatus(true);
        System.out.println(" " + player.getName() + " went to Jail.");
    }
}
