package practiceit;

import java.util.ArrayList;

public class ArrayListMystery1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> var1 = new ArrayList<Integer>();
		var1.add(10);
		var1.add(20);
		var1.add(30);
		
		mystery2(var1);
	}
	
	
	public static void mystery2(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				list.add(list.get(i));
			}
			else {
				list.add(0, list.get(i));
			}

		}
		
		System.out.println(list);
	}
	
}