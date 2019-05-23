package practiceit;

public class writeChars {
	public static void main(String[] args) {
		writeChars(1);
	}
	
	public static void writeChars(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		
		else if (n == 1) {
			System.out.println("*");
		}
		
		else if (n == 2) {
			System.out.println("**");
		}
		else {
			
		}
	}

}
