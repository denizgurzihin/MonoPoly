public class GoToJailSquare extends Square {
    private JailSquare jail;

    GoToJailSquare(String name, int location, JailSquare jail){ //Jailsiz şekliyle bi dene
        super(name, location);
        this.jail=jail;
    }

    @Override
    public void landedOn(Player player) {
        player.getPawn().setLocation(jail);
        player.setJailStatus(true);
    }
}
