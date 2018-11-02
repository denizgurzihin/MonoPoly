
public class Die {
	private int value;
	
	
	public void rollDice(){
		this.value = (int) ((Math.random()*6)+1);
	}
	
	public int getValue(){
		return value;
	}
	
}
