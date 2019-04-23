package thursday;
import java.io.*; //using io to read files
import java.util.*; //needs util because we are using scanner to read through the file.

import javax.print.attribute.standard.NumberUpSupported;
public class inclassactivity {

	public static void main(String[] args) throws FileNotFoundException { //here is the throws for the error. 
		Scanner file = new Scanner(new File("myfile.txt")); //theres an error here because file is not found error. so we are going to use a throws for the error
		ArrayList<String> words = new ArrayList<String>(); //use angle brackets with arraylist. we won't know how many things we are going to put inside the list.
		
		/*
		 * use has methods when working with textfiles. has methods only returns booleans. Thay are:
		 * hasNext()
		 * hasNextInt()
		 * hasNextDouble
		 * 
		 * note: in files, each word in the file is known as a token. 
		 * 
		 * after using the has methods, move the cursor by using next, next int and nextdouble.
		 * 
		 * to make the new file, you need to need to create a new untilted text file in your project.
		 * Write stuff and then save it. 
		 */
		
		while(file.hasNext()) {
			String value = file.next(); //retrived the word
			words.add(value); //uses the .add method to take the word we saved to add to the array named words.
			
		}
		
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i)); //there is no [] to call position. you have to use the get method when working with arraylist
			
			
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		
		/*
		 * So when making arraylist, you can't just write int/double/Char/boolean. Those are primative 
		 * datatypes. You have to use the class that java has for the type of thing you need. Use:
		 * Inteer, Double, Character, and Boolean
		 */
		
		numbers.add(4);
		numbers.add(55);
		numbers.add(78);
		numbers.add(33);
		System.out.println(numbers.toString());
		
		
		
		
	}

}
