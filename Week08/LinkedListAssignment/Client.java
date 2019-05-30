package LinkedListAssignment;

public class Client {
	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		LinkedIntList list2 = new LinkedIntList();
		list.add(5);
		list.add(-1);
		list.add(6);
		list.add(7);
		list.print();
		
		System.out.println(list.min());
		System.out.println(list.isEmpty());
		System.out.println(list2.isEmpty());
		list.clear();
		System.out.println(list);


	}

}
