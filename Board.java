import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Board {
	public static final int SIZE=40;
	
	private List<Square> board;
	
	public Board(){
		
		board = new ArrayList<>(SIZE);
		Square square = new Square("GO ", 0);
		board.add(square);
		
		for(int i=1; i<SIZE; i++){	
			Square square2 = new Square("Square "+i, i);
			board.add(square2);		
		}
		
	}

	public Square getSquare(int index){
		return board.get(index);
	}

	
}
