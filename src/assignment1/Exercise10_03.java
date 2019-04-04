package assignment1;

public class Exercise10_03 {
	public static void main(String[] args) {
		
		MyInteger n1 = new MyInteger(23);
		
		System.out.println("n1 is even? " + n1.isEven());
		System.out.println("n1 is prime? " + n1.isPrime());
		System.out.println("n1 is odd? " + n1.isOdd());		
		
	}

}

class MyInteger {
	
	int value; //the data field that is in the requirements.
	static boolean even = false;
	static boolean prime = true;
	static boolean odd = false;

	public MyInteger(int x) {
		this.value = x;
		System.out.println(value);
	}
	
	public int getVal() {
		return value;
	}
	
	// CONDITIONS TO DETERMINE IF ITS EVEN ODD OR PRIME
	public boolean isEven() {
		if (value % 2 == 0) {
			even = true;
		}
		return even;
	}
	
	public boolean isOdd() {
		if (value % 2 != 0) {
			odd = true;
		}
		return odd;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return prime = false;
			}
				
		}
		return prime = true;
	}
		
}




















