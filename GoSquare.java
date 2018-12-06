public class GoSquare extends Square {
    private int roundPrize;

    GoSquare(String name, int location){
        super(name, location);
    }

    public void setRoundPrize(int roundPrize) {
        this.roundPrize = roundPrize;
    }

    @Override
    public void landedOn(Player player) {
        player.increaseMoney(roundPrize);
    }
}
