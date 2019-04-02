package inclass;

public class Point {
	
	private int x; 
	private int y;
	
	public Point(int x, int y) { //the name of the constructor must be the name of the class. 
		this.x = x;
		this.y = y; //the word this is used to access the fields 
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}//Point
