public class GoToJailSquare extends Square {
    private Square jail;

    public GoToJailSquare(String name, int location, Square jail){
        super(name, location);
        this.jail=jail;
    }

    @Override
    public void landedOn(Player player) {
        player.getPawn().setLocation(jail);
        player.setJailStatus(true);
        System.out.println(" " + player.getName() + " went to Jail.");
    }
}
