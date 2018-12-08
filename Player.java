

public class Player {
    private String name;
    private Pawn pawn;
    private Die[] dice;
    private int money;
    private boolean isActive;
    private boolean isInJail;
    private int jailRounds=0;

    public Player(String name, Die[] dice, Board board){
        this.setName(name);
        this.dice = dice;
        this.pawn = new Pawn(board);
        this.money = 1500;
        this.isActive = true;
    }

    public void playTurn(){
        System.out.println("\n" + name + " is playing his turn...");

        dice[0].rollDice();
        int value1=dice[0].getValue();
        System.out.println(" First die rolled: " + value1);
        dice[1].rollDice();
        int value2=dice[1].getValue();
        System.out.println(" Second die rolled:" + value2);

        if(this.isInJail!=true) {
            this.pawn.setOldLocation(getLocation());               //this line added to retreive pawn.oldLocation value in GoSquare class
            Square newLocation = pawn.move(this.pawn.getOldLocation(), value1 + value2);
            this.pawn.setLocation(newLocation);
            System.out.println(" New location is: " + getLocation().getName());

            //implement landedOn method of newLocation
            newLocation.landedOn(this);

            System.out.println(" " + getName() + " has " + getMoney() + " amount of money ");

            if (getMoney() <= 0) {
                bankrupt();
                System.out.println(" " + getName() + " went bankrupt and cannot continue the game!!!");
            }
        }
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

    public Pawn getPawn() {
        return pawn;
    }

    public Die[] getDice() {
        return dice;
    }

    public int getMoney(){
        return this.money;
    }


    public int increaseMoney(int money){
        this.money += money;
        return this.money;
    }

    public int decreaseMoney(int money){
        this.money -= money;
        return this.money;
    }

    public boolean getActivityStatus(){
        return this.isActive;
    }

    public void bankrupt(){
       this.isActive=false;
    }

    public boolean getJailStatus(){return this.isInJail;}

    public void setJailStatus(boolean status) {
        this.isInJail = status;
    }

    public int getJailRounds() {
        return jailRounds;
    }

    public void setJailRounds(int jailRounds) {
        this.jailRounds = jailRounds;
    }
}
