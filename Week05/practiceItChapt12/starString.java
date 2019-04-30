package practiceItChapt12;

public class starString {
	public static String starString(int value){
		if (value == 0) {
			System.out.println("*");
		}
		
		else if(value <= 0) {
			starString(value - 1);
			System.out.println("*" * 2**value);
		}
		
		return
		
	}

}
