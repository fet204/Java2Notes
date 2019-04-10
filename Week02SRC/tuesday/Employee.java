package tuesday;

public class Employee {
	// making fields to save years for the new constructor 
	private int years;
	
	/*create constructors at the top and this is for changing from using the default 
	 *constructor. also child classes don't have access to the parent custom 
	 *constructor (they have access to the default constructor though) */
	 
	public Employee(int years) {
		this.years = years; //this stores what is passed from the client into the private int years in the Employee class. 
	}
	
	public int getHours() {
		return 40;
	}
	
	public int getYears() {// this lets the child access the years variable in the employee parent class
		return years;
	}
	
	public double getSalary() {
		return 50000;
	}
	
	public int getVacationDays() {
		return 10 + 2 * years;
	}
	
	public String getVacationForm() {
		return "Yellow";
	}
	
	 
	
	
}
