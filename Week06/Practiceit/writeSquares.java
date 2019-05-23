package practiceit;

public class writeSquares {
	
	public static void main(String[] args) {
		writeSquares(8);
	}
	
	public static void writeSquares(int n) {
		if (n < 1)  {
			throw new IllegalArgumentException();
		}
		
		if (n == 1) {
			System.out.print("1");
		}
		
		else {
			if (n % 2 != 0) {
				System.out.print(n * n + ", ");
				writeSquares(n - 2);
				System.out.print(", " + (n - 1) * (n - 1));
				//System.out.print();
			}
			else {
				System.out.print((n - 1) * (n - 1) + ", ");
				writeSquares(n - 2);
				System.out.print(", " + n * n);
				//System.out.print(", ");
			}
		}
		
	}

}
