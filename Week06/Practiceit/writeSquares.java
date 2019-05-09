package Practiceit;

public class writeSquares {
	public static void main(String[] args) {
		writeSquares(5);
	}
	
	public static void writeSquares(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		
		else if (n == 1) {
			System.out.println("1");
		}
		
		else {
			if (n % 2 != 0) {
				System.out.print(n * n);
			}
			else {
				System.out.print(n * n);
			}
		}
	}

}
