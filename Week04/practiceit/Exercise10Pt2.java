package practiceit;
import java.util.ArrayList;

public class Exercise10Pt2 {
	public static void main(String[] args) {
		ArrayList<String> var1 = new ArrayList<String>();
		var1.add("to");
		var1.add("be");
		var1.add("or");
		var1.add("not");
		var1.add("to");
		var1.add("be");
		var1.add("hamlet");
		
		swapPairs(var1);
	}
	
	public static void swapPairs(ArrayList<String> list) {
		
		
		
		String oddhold = "";
		
		if (list.size() % 2 != 0) {
			String oddHold = list.get(list.size());
			list.remove(list.size()-1);
			
			System.out.println(list);
			
		}
		for(int i = 0; i < list.size(); i++) {
			String first = list.get(i);
			list.remove(i);
			String second = list.get(i);
			list.remove(i);
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

