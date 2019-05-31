package LinkedListAssignment;

import java.util.NoSuchElementException;

/*
 * tip: 
 * - Every time you are using loops on a list, make a current that will hold the front value so you don't lose  the list
 * - Make sure you never change the front of the list without having some other field that is pointing to your list
 */

public class LinkedIntList {
	
	private ListNode front; 
	public LinkedIntList() {
		front = null;
	}
	
	public void add(int value) {
		// This detects if the front is nothing. If it is, it will make a new listnode that will pass a value
		if (front == null) {
			front = new ListNode(value);
		}
		
		// The else method takes care as the rest of the exceptions. 
		// This navigates the rest of the list and gets to the end so you can put the new value at the end of the list.
		else {
			ListNode current = front; 
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
		
		
		
	}
	
	public void print() {
		ListNode current = front; 
		while (current.next != null) {
			System.out.print(current.data + " ");
			current = current.next; // this is the incremental statement so that way the while loop actually moves through the loop and doesn't loop on forever
		}
		System.out.print(current.data); // prints the last value because the while loop stops right before the last value because it is detecting the null. 
	}
	

	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		}
		
		else {
			ListNode current = front;
			for (int i = 0; i < index -1; i ++) {
				current = current.next; 
			}
			
			current.next = current.next.next; 
		}
	}
	
	
	// Assignment min 
	public int min() {
	    if (front == null) {
	        throw new NoSuchElementException();
	    } else {
	        int min = front.data;
	        ListNode current = front.next;
	        
	        while (current != null) {
	            if (current.data < min) {
	                min = current.data;
	            }
	            current = current.next;
	        }
	        
	        return min;
	    }
	}
	
	// Assignment isSorted 
	public boolean isSorted() {
		boolean booler = true;
		
		if (front == null) {
			return booler; 
		}
		
		else {
			int holder = front.data;
			ListNode current = front.next;
			while (current != null ) {
				if (current.data < holder) {
					
				}
			}
			
		}
		return true; 
	}
	
	// Size method 
	public int size() {
		ListNode current = front;
		int counter = 0; 
		while (current != null) {
			counter++; 
			current = current.next;
		}
		return counter; 
	}
	
	// isEmpty method list 
	public boolean isEmpty() {
		ListNode current = front; 
		if(current != null) {
			return false;
		}
		else 
			return true;
	}
	
	// clear method 
	public void clear() {
		ListNode current = front; 
		current = null; 
	}
	
	// toString method 
	public String toString() {
		ListNode current = front; 
		String thing = "";
		while(current != null) {
			thing = thing + current.data + " ";
			current = current.next;
		}
		return thing;
	}
	
	//indexOf
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front; 
		while (current != null) {
			index++; 
			if (current.data == value) {
				return index; 
			}
			else 
				current = current.next;
		}
		
		return index; 
	}
	
	// contains method 
	public boolean contains(int value) {
		ListNode current = front;
		boolean caller = false; 
		while(current != null) {
			if (current.data == value) {
				return !caller;
			}
		}
		return caller; 
	}
	
	
}









