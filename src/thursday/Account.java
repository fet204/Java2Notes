package thursday;

public class Account {
	
	private int id;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date datecreated;
	
	
	
	
	// making 2 constructors the first one is if they don't have an account created already. 
	public Account() { // making a constructor that creates the account with the specified id and initial balance
		datecreated = new java.util.Date(); //this is a default constructor. 
	}
	
	public Account(int id, double balance) { //another constructor that makes the account. this will take in the user stuff
		this.id = id;
		this.balance = balance;
		datecreated = new java.util.Date();
	}
	
	
	
	
	// making getters and setters because the variables we made earlier were private
	// making your getters. You will not need to accept inputs for getters
	public int getId() {
		// makes the getter and will not accept any imputs. just return the thing
		return id;
	}
	public double getBlance() {
		return balance;
	}
	public static double getAnnual() {
		return annualInterestRate;
	}
	
	// making the setters can't be private. Also will all be void
	public void setId(int newId) { //you need something when making setters. This is where you will get user input. making the parameter an int because thats what we started with 
	id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public static void setAnnual(double Annual) { //must keep the same initialization when you first started out with what it would be
		annualInterestRate = Annual;
	}
	
	
	// making the date for the account.
	public java.util.Date getDate() { //using the java.util.Date to keep track of the date. 
		
		
		
		return datecreated;
	}
	
	public void withdraw(double amount) { // just asks the user how much it wants to take out
		balance -= amount;
	}
	
	public void deposit(double amount) { // this just asks the user how much it wants to put into the balance.
		balance += amount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


