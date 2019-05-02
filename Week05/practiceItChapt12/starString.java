package practiceItChapt12;
import java.math.*;

public class starString {

	public static void main(String[] ars) {
		starString(0);
		System.out.println();
		
		/*
		starStrng(1);
		System.out.println();
		starStrng(2);
		System.out.println();
		starStrng(3);
		System.out.println();
		starStrng(4);

		 * 2^0 *                  x01
		 * 2^1 **                 x02
		 * 2^2 ****               x04
		 * 2^3 ********           x08
		 * 2^4 ****************   x16
		 * 
		 * shlotskys
		 */

	}

	public static void starString(int value){
		int totStar = (int) Math.pow(2, value);

		int i = 0;
		
		if(value == totStar) { 
			System.out.println("if breaker");
		}
		
		
		else if (value < 0) throw new IllegalArgumentException(); {
			System.out.println("Throw argument");
			
		}
		
		
		else {
			System.out.println("*");
			
		}
		

			
	}

}
