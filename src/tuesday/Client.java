package tuesday;

public class Client {
	public static void main(String[] args) {
		Account john = new Account(1122, 20000);
		Account.setAnnual(4.5); //normally should follow the document but we have it named as something different 
		
		john.withdraw(2500); // using johns account to make the changes. Using the account class and the methods we created in there. they can use here in the client. 
		System.out.println("Balance is: " + john.getBlance());
		
		john.deposit(3000);
		System.out.println("Balance is: " + john.getBlance());

		System.out.println("Date created: " + john.getDate());

		
	}

}
