public class GoBackCard extends Card {

    public GoBackCard(String explanation){
        super(explanation);
    }

    @Override
    public void action(Player player) {
        player.getPawn().setLocation(player.getPawn().getLocation().getIndex()-3);
        System.out.println(" New location is: " + player.getPawn().getLocation().getName());
        player.getPawn().getLocation().landedOn(player);
    }

}