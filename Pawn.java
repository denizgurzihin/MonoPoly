
public class Pawn {
    private String name;
    private Square location;
    private Board board;

    public Pawn(Board board){
        this.board = board;
        this.location = board.getSquare(0);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Square move(Square location, int totalDice){
        int newIndex = ( location.getIndex() + totalDice ) % Board.SIZE;
        return board.getSquare(newIndex);
    }

    public Square getLocation(){
        return location;
    }

    public void setLocation(Square location){
        this.location=location;
    }
}
