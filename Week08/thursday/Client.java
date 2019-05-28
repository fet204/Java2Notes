package thursday;

public class Client {
	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(5);
		list.add(6);
		list.print();
		
		list.removeLast(5);
		
		System.out.println(list);
		
	}

}
