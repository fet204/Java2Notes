package practiceItChapt12;
import java.math.*;

public class starString {
	
	public static void main(String[] args) {
		starString(2);
	}
	
	public static String starString(int value){
		
		int base = 2;
		int totStar;
		
		if (value == 0) {
			System.out.println("*");
		}
		
		else if (value == 1) {
			System.out.println("**");
		}
		
		else {
			System.out.println("*");
			totStar = (int) Math.pow(base, value);
			starString(value - 1);
		}
		
		return "return";
	}

}
