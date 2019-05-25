package practiceItChapt12;

public class SelfCheck {
	public static void main(String[] args) {
		
		mystery(-12345678);
		
	}
	
	public static void mystery(int n) {
	    if (n < 0) {
	    	System.out.print("-");
	    	mystery(-n);
	    }
	    
	    else if(n < 10) {
	    	System.out.println(n);
	    }
	    
	    else {
	    	int two = n% 100;
	    	System.out.print(two / 10);
	    	System.out.print(two % 10);
	    	mystery(n / 100);
	    }
	}

}
