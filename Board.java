import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Board {
	public static final int SIZE=40;
	
	private List<Square> board;

	
	public Board(){
		
		board = new ArrayList<>(SIZE);

		//build board
		for(int i=0; i<SIZE; i++){
			Square square = new RegularSquare("Square "+i, i);
			board.add(square);
		}

		board.get(0).setName("Go");
		board.get(4).setName("Income Tax");
		board.get(38).setName("Super Tax");
		board.get(30).setName("Go to Jail");
		board.get(10).setName("Jail");
	}

	public Square getSquare(int index){
		return board.get(index);
	}

	
}
