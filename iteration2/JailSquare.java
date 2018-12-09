public class JailSquare extends Square{
    private int jailPenalty;

    public JailSquare(String name, int location, int jailPenalty){
        super(name, location);
        this.jailPenalty=jailPenalty;
    }

    @Override
    public void landedOn(Player player) {       //stays in jail until getting double dice for 3 rounds and at the end of it player pays money
        if(player.getJailStatus()==true) {
            if (player.getDice()[0] == player.getDice()[1]) {
                player.setJailStatus(false);
                player.setJailRounds(0);
                System.out.println(" " + player.getName() + " went out of Jail by rolling double dice.");
            } else {
                int currentJailRounds = player.getJailRounds();
                currentJailRounds++;
                player.setJailRounds(currentJailRounds);
                if (player.getJailRounds() > 0 && player.getJailRounds() < 3)
                    System.out.println(" " + player.getName() + " is still in Jail. (Round: " + currentJailRounds + ")");

                if (player.getJailRounds() == 3) {
                    player.decreaseMoney(jailPenalty);
                    player.setJailStatus(false);
                    System.out.println(" " + player.getName() + " went out of Jail by paying jail penalty(100$).");
                    player.setJailRounds(0);
                }
            }
        }

    }
}
