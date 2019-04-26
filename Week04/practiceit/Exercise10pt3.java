package practiceit;

import java.util.ArrayList;

public class Exercise10pt3 {
	
	public static void removeEvenLength(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			
			String word = list.get(i);
			int wordLen = word.length();
			
			if (wordLen % 2 == 0) {
				list.remove(i);
				i--;
				
			}
		}
	}

}
