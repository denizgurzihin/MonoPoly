import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Board {
	public static final int SIZE=40;
	private List<Square> board;

	public enum SquareNames {
		Go(0),
		MediterraneanAvenue(1),
		CommunityChest1(2),
		BalticAvenue(3),
		IncomeTax(4),
		ReadingRailroad(5),
		OrientalAvenue(6),
		Chance1(7),
		VermontAvenue(8),
		ConnecticutAvenue(9),
		Jail(10),
		StCharlesPlace(11),
		ElectricCompany(12),
		StatesAvenue(13),
		VirginiaAvenue(14),
		PennsylvaniaRailroad(15),
		StJamesPlace(16),
		CommunityChest2(17),
		TennesseeAvenue(18),
		NewYorkAvenue(19),
		FreeParking(20),
		KentuckyAvenue(21),
		Chance2(22),
		IndianaAvenue(23),
		IllnoisAvenue(24),
		BORailroad(25),
		AtlanticAvenue(26),
		VentnorAvenue(27),
		WaterWorks(28),
		MarvinGardens(29),
		GoToJail(30),
		PacificAvenue(31),
		NorthCarolinaAvenue(32),
		CommunityChest3(33),
		PennsylvaniaAvenue(34),
		ShortLineRailroad(35),
		Chance3(36),
		ParkPlace(37),
		LuxuryTax(38),
		Boardwalk(39);

		private final int SquareCode;
		private SquareNames(int SquareCode) {
			this.SquareCode = SquareCode;
		}
		public int getValue() {
			return SquareCode;
		}
	}

	
	public Board(CommunityChestDeck communityChestDeck, ChanceDeck chanceDeck){
		
		board = new ArrayList<>(SIZE);

		//build board
		for(SquareNames squareName : SquareNames.values()) {

			if (squareName == SquareNames.Go) {
				Square square = new GoSquare(squareName.toString(), squareName.getValue(), 200);
				board.add(squareName.getValue(), square);
			}
			else if (squareName == SquareNames.IncomeTax) {
				Square square = new TaxSquare(squareName.toString(), squareName.getValue(), 200);
				board.add(squareName.getValue(), square);
			}
			else if (squareName == SquareNames.LuxuryTax) {
				Square square = new TaxSquare(squareName.toString(), squareName.getValue(), 100);
				board.add(squareName.getValue(), square);
			}
			else if (squareName == SquareNames.Jail) {
				Square square = new JailSquare(squareName.toString(), squareName.getValue(), 100);
				board.add(squareName.getValue(), square);
			}
			//GoToJailSquare class needs Jail square to get initialized before
			else if (squareName == SquareNames.GoToJail){
				Square square = new GoToJailSquare(squareName.toString(), squareName.getValue(), board.get(10));
				board.add(squareName.getValue(), square);
			}

			else if (squareName == SquareNames.CommunityChest1 || squareName == SquareNames.CommunityChest2 || squareName == SquareNames.CommunityChest3){
				Square square = new DrawCardSquare(squareName.toString(), squareName.getValue(), communityChestDeck);
				board.add(squareName.getValue(), square);
			}

			else if (squareName == SquareNames.Chance1 || squareName == SquareNames.Chance2 || squareName == SquareNames.Chance3){
				Square square = new DrawCardSquare(squareName.toString(), squareName.getValue(), chanceDeck);
				board.add(squareName.getValue(), square);
			}
			else{
				Square square = new RegularSquare(squareName.toString(), squareName.getValue());
				board.add(squareName.getValue(), square);
			}
		}



	}

	public Square getSquare(int index){
		return board.get(index);
	}

	
}
