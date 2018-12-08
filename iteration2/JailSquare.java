public class JailSquare extends Square{
    private int jailPenalty;

    public JailSquare(String name, int location, int jailPenalty){
        super(name, location);
        this.jailPenalty=jailPenalty;
    }

    @Override
    public void landedOn(Player player) {       //stays in jail until getting double dice for 3 rounds and at the end of it player pays money
        Die[] dice = player.getDice();
        if(dice[0].getValue()==dice[1].getValue()) {
            player.setJailStatus(false);
            player.setJailRounds(0);
            System.out.println(" " + player.getName() + " went out of Jail by rolling double dice.");
        }
        else {
            player.setJailRounds(player.getJailRounds()+1);
            if(player.getJailRounds()!=0)
                System.out.println(" " + player.getName() + " is still in Jail.");

            if(player.getJailRounds()==0){
                player.decreaseMoney(jailPenalty);
                player.setJailStatus(false);
                System.out.println(" " + player.getName() + " went out of Jail by paying jail penalty(50$).");
            }
        }


    }
}