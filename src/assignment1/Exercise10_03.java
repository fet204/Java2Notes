package assignment1;

public class Exercise10_03 {
	public static void main(String[] args) {
		MyInteger n1 = new MyInteger(5);
		System.out.println("n1 is even? " + n1.isEven());
		System.out.println("n1 is prime? " + n1.isPrime());
		System.out.println("n1 is odd? " + n1.isOdd());		
		
	}

}

class MyInteger {
	
	static int value; //the data field that is in the requirements.
	static boolean even = false;
	static boolean prime = false;
	static boolean odd = false;

	/*
	public MyInteger(int x) {
		this.value = value;
	}
	*/
	
	public int getX() {
		return value;
	}
	
	public static boolean isEven() {
		
		if (value % 2 == 0) {
			even = true;
		}
		
		return even;
	}
	
	public static boolean isOdd() {
		
		if (value % 2 != 0) {
			odd = true;
		}
			
		return odd;
	}
	
	public static boolean isPrime() {
		
		for (int i = 0; i > ((value / 2) + 1); i++) {
			if (value % i == 0) {
				prime = true;
			}
		}
		
		return prime;
	}
	
	
	
	
	
}