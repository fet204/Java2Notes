package practiceit;

import java.util.ArrayList;

public class Exercise10pt7 {
	
	public static void main(String[] args) {
		ArrayList<String> var1 = new ArrayList<String>();
		var1.add("be");
		var1.add("be");
		var1.add("is");
		var1.add("not");
		var1.add("or");
		var1.add("question");
		var1.add("that");
		var1.add("the");
		var1.add("to");
		var1.add("to");
		
		removeDuplicates(var1);
		
	}
	public static void removeDuplicates(ArrayList<String> list) {

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
			System.out.println("i: " + list.get(i));
			
			for (int j = 1; j < list.size(); j++) {
				System.out.println("j: " + list.get(j));
				
				if(list.get(i) == list.get(i+1)) {
					list.remove(i);
					System.out.println("removed i");

				}
				System.out.println();
			}
		}
	}

}
