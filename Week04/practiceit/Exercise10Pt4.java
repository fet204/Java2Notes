package practiceit;

import java.util.ArrayList;

public class Exercise10Pt4 {
	public static void main(String [] args) {
		ArrayList<String> var1 = new ArrayList<String>();
		var1.add("how");
		var1.add("are");
		var1.add("you");

		doubleList(var1);
	}
	
	
	public static void doubleList(ArrayList<String> list) {
		for(int i = list.size(); i > 0; i--) {
			String hold = list.get(i-1);
			list.add(i-1, hold);
			
		}
		System.out.println(list);
	}

}
