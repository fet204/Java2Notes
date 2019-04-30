package practiceit;

import java.util.ArrayList;

public class Exercise10pt10 {
	
	public static void main(String[] args) {
		ArrayList<Integer> var1 = new ArrayList<Integer>();
		var1.add(0); 
		var1.add(0);
		var1.add(2);
		var1.add(0);
		var1.add(4);
		var1.add(0);
		var1.add(6);
		var1.add(0);
		var1.add(8);
		var1.add(0);
		var1.add(10);
		var1.add(0);
		var1.add(12);
		var1.add(0);
		var1.add(14);
		var1.add(0);
		var1.add(16);
		
		removeInRange(var1, 0, 5, 13);

		
	}
	
	public static void removeInRange(ArrayList<Integer> list, int element, int startIndex, int endIndex) {
		
		int realEnd = endIndex;
		
		for (int i = 5; i < realEnd; i++) {
			if(list.get(i) == element) {
				System.out.println(i);
				list.remove(i);
				realEnd -= 1;
			}
			
			
			System.out.println(list);

		}
		
	}

}
