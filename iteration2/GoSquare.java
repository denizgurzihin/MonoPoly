public class GoSquare extends Square {
    private int roundPrize;

    public GoSquare(String name, int location, int roundPrize){
        super(name, location);
        this.roundPrize=roundPrize;
    }

    @Override
    public void landedOn(Player player) {
        if (player.getPawn().getOldLocation().getIndex() >= player.getPawn().getLocation().getIndex()) {
            player.increaseMoney(roundPrize);
            System.out.println(" " + player.getName() + " collects 200$ for passing Go Square");
        }
    }
}
