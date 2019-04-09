package tuesday;

public class Marketer extends Employee {
	public Marketer(int years) {
		super(years);
	}
	
	public double getSalary() {
		return super.getSalary() + 10000; //instead of just returning the value you want each one, reference the employee base pay and use super to call the getSalary from the employee class.
		
	}
	

}
