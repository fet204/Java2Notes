package thursday;

// This class is going to make the list nodes. info will be passed from linkedintlist
public class ListNode {
	
	// Making your fields that will hold the info passed from the linkedintlist
	int data; 
	ListNode next; 
	
	public ListNode(int data) {
		this.data = data; 
		next = null; 
		
	}
	
	public ListNode(int data, ListNode next) {
		this.data = data; 
		this.next = next;
		
	}

}
