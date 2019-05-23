package practiceItChapt12;

public class writeNums {
	public static void main(String[] args) {
		
		writeNums(5);
	}
	
	public static void writeNums(int n) {
		
		if(n < 1) {
			throw new IllegalArgumentException();
		}
		
		else if (n == 1) {
			System.out.print("1");
		}
		
		else {
			writeNums(n - 1);
			System.out.print(", " + n);
		}
		
		
	}
	
}
