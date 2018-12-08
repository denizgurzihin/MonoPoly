public class GoToNearestUtilityCard  extends Card{
    private int targetLocationIndex;

    public GoToNearestUtilityCard(String explanation){
        super(explanation);
    }

    @Override
    public void action(Player player) {
        int locationIndex = player.getPawn().getLocation().getIndex();
        if(Math.abs(locationIndex-15)<Math.abs(locationIndex-25))
            this.targetLocationIndex=15;
        else
            this.targetLocationIndex=25;
        player.getPawn().setLocation(targetLocationIndex);
        System.out.println(" New location is: " + player.getPawn().getLocation().getName());
    }
}
