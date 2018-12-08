
public class Square {
	
	private String name;
	private int index;
	
	public Square(String name, int location){
		this.name = name;
		this.index = location;
	}
	
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public int getIndex(){
		return this.index;
	}
}
