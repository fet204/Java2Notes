package thursday;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(palindro("asdfjfdsa"));
	}
	
	public static boolean palindro(String s) {
		if (s.length() < 2 ) {
			return true;
		}
		
		else {
			char first = s.charAt(0);
			char last = s.charAt(s.length() -1);
		
			if (first != last) {
				return false;
			}
			
			else {
				String m = s.substring(1, s.length() -1);
				return palindro(m);
			}
		
		}
		
		
	}

}
