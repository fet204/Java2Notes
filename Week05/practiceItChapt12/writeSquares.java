package practiceItChapt12;
import java.math.*;

public class writeSquares {
	public static void main(String[] args) {
		writeSquares(5);
	}
	
	public static void writeSquares(int n) {
		int powVal;
		
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		
		else if ( n == 1) {
			System.out.print("1");
		}
		
		if (n % 2 != 0) {
			writeSquares(n -1);
			System.out.println(n * n);
		}
		
		else {
			writeSquares(n-1);
			System.out.println(n * n);
			
		}
		
	}

}
