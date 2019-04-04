package inclass;

public class Client {
	public static void main(String[] args) {
		
		Point p1 = new Point(4,6); 
		//now that you have changed the Point so its not using the default constructor 
		//and now you can put in numbers to fix the error and you don't have to use p1.blah to assign variables 
		Point p2 = new Point(88,99);
		
		System.out.println(p1.getX() + " " + p2.getX());
		
	}//main()

}//Client
