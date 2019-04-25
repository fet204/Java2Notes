package thursday;

public class ArrayIntList {
	// declaring your fields 
	int[] elementData;
	int size;
	
	//creating the constructor
	public ArrayIntList() {
		size = 0; 
		elementData = new int[20];
	}
	
	//methods
	public void add(int value) {
		
		//saving the value to the very first spot in the simple array.
		elementData[size] = value; 
		size++;
	}
	
	public void add(int index, int value) {
		for(int i = size; i > index; i--) {
			elementData[i] = elementData[i-1];
		}
		elementData[index] = value;
		size++;
	}
	
	public int get(int index) {
		return elementData[index];
	}
	
	public void set(int index, int value) {
		elementData[index] = value;
	}
	
	public String toString() {
		String result = "[";
		if(size > 0) {
			result += elementData[0];
			for(int i = 1; i < size; i++) {
				result += "," + elementData[i];
			}
			result += "]"; 
		}
		return result;
	}
	
	

}
