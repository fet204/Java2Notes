package practiceItChapt12;

public class SelfCheck {
	public static void main(String[] args) {
		
		mystery4(6,13);
		
	}
	
	public static int mystery4(int x, int y) {
	    if (x < y) {
	        return x;
	    } else {
	        return mystery4(x - y, y);
	    }
	}

}
