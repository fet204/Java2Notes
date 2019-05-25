package practiceit;

import java.util.ArrayList;

public class Exercise10pt6 {
	
	public static void main(String[] args) {
		ArrayList<Integer> var1 = new ArrayList<Integer>();
		var1.add(3);
		var1.add(8);
		var1.add(92);
		var1.add(4);
		var1.add(2);
		var1.add(17);
		var1.add(9);

		minToFront(var1);
		
	}
	
	
	public static void minToFront(ArrayList<Integer> list) {
		int hold = list.get(0);
		int position;
		
		for(int i = 1; i < list.size(); i++) {
			if (list.get(i) < hold) {
				hold = list.get(i);
				position = i;

			}
			
		}
		
		list.remove(position);
		list.add(0, hold);
		System.out.println(list);
	}
	



}
