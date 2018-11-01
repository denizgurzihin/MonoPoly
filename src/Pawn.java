public class Pawn {
    private String name;
    private Square location;

    public Pawn(Square location){
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Square move(Square location, int totalDice){
        int newIndex = ( location.getIndex() + totalDice ) % Board.SIZE;
        return squares.get(newIndex);
    }

    public Square getLocation(){
        return location;
    }

    public void setLocation(Square location){
        this.lcoation=location;
    }
}
