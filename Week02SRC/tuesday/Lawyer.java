package tuesday;

public class Lawyer extends Employee {
	//private int years;
	
	public Lawyer(int years) {
		super(years);
		//this.years = years;
	}
	
	public double getSalary() {
		return super.getSalary() + 5000 * super.getYears();
	}
	
	public int getVacatioDays() {
		
		return super.getVacationDays() + 5;
	}
	
	public String getVacationForm() {
		return "pink";
	}
	
	public void Unique() {
		System.out.println("I know how to sue");
	}

}
