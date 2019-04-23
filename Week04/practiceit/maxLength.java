package practiceit;
import java.util.*;

public class maxLength {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
	}
	
	public static int maxLength(ArrayList<String> list) {
		//comment 
		int zero = 0;
		
		for (int i = 0; i < list.size(); i ++) {
			String var1 = list.get(i); 
		}
		
		if (var1.length() > zero ) {
			zero = var1.length();
		}
		
		return zero;
		
	}

}
