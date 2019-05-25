package tuesday;

public class Client {
	public static void main(String[] args) {
		ListNode list = new ListNode();
		list.data = 5;
		
		
		list.next = new ListNode();
		list.next.data = 6;
		
		list.next = new ListNode();
		list.next.next.data = 7;
		
		list.next.next.next = null;
		
		System.out.println(list.next.data);
		
		
		
		
		
		
		
		
		
		
		
	}

}
