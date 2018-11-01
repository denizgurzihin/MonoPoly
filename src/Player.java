public class Player {
    private String name;
    private Pawn pawn;
    private Die[2] dice;

    public Player(String name, Die[] dice){
        this.setName(name);
        this.dice = dice;
        this.pawn = new Pawn(0);
    }

    public void playTurn(){
        System.out.println(name + " playing his turn...");

        dice[0].rollDice();
        int value1=dice[0].getValue();
        System.out.println(" First die rolled: " + value1);
        dice[1].rollDice();
        int value2=dice[1]getValue();
        System.out.println(" Second die rolled:" + value2);

        Square oldLocation = getLocation();
        Square newLocation = pawn.move(oldLocation, value1+value2);
        this.pawn.setLocation(newLocation);
        System.out.println(" New location is: " + getLocation().getIndex());
    }

    public Square getLocation(){
        return this.pawn.getLocation();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
