package practiceit;
import java.util.ArrayList;

public class Exercise10Pt2 {
	public static void main(String[] args) {
		/*
		ArrayList<String> var2 = new ArrayList<String>();
		var2.add("four");
		var2.add("score");
		var2.add("and");
		var2.add("seven");
		var2.add("years");
		var2.add("ago");
		
		ArrayList<String> var1 = new ArrayList<String>();
		var1.add("to");
		var1.add("be");
		var1.add("or");
		var1.add("not");
		var1.add("to");
		var1.add("be");
		var1.add("hamlet");
		

		swapPairs(var2);
		swapPairs(var1);
		*/
	}
	
	public static void swapPairs(ArrayList<String> list) {
		
		String oddhold = "";
		
		if (list.size() % 2 != 0) {
			String oddHold = list.get(list.size()-1);
			list.remove(list.size()-1);
			
			for(int i = 0; i < list.size(); i+=2) {
				String first = list.get(i);
				String second = list.get(i+1);
				
				list.set(i, second);
				list.set(i+1, first);
			}
			list.add(oddHold);
		}
		
		
		else { 
			for(int i = 0; i < list.size(); i+=2) {
				String first = list.get(i);
				String second = list.get(i+1);
				
				list.set(i, second);
				list.set(i+1, first);

			}
		}
		
		System.out.println(list);
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

