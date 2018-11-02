

public class Player {
    private String name;
    private Pawn pawn;
    private Die[] dice;

    private int money;

    public Player(String name, Die[] dice, Board board){
        this.setName(name);
        this.dice = dice;
        this.pawn = new Pawn(board);
        this.money = 1500;
    }

    public void playTurn(){
        System.out.println(name + " playing his turn...");

        dice[0].rollDice();
        int value1=dice[0].getValue();
        System.out.println(" First die rolled: " + value1);
        dice[1].rollDice();
        int value2=dice[1].getValue();
        System.out.println(" Second die rolled:" + value2);

        Square oldLocation = getLocation();
        Square newLocation = pawn.move(oldLocation, value1+value2);
        this.pawn.setLocation(newLocation);
        System.out.println(" New location is: " + getLocation().getIndex());
        System.out.println(" "+getName()+" has "+ getMoney()+" amount of money \n");
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



    public int getMoney(){
        return this.money;
    }


    public int increaseMoney(int money){
        int newMoney = this.money + money;
        this.money = newMoney;
        return this.money;
    }

    /*public int decreaseMoney(int money){
        int dereasedMoney = this.getMoney()-money;
        this.getMoney() =
        return oldMoney-money;
    }*/

}
