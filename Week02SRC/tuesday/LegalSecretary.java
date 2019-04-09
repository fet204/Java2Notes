package tuesday;

public class LegalSecretary extends Secretary {
	public LegalSecretary(int years) {
		super(years);
	}
	
	public double getSalary() {
		return super.getSalary() + 5000;
		
	}
	

}
