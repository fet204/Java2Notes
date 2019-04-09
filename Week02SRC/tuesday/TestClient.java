package tuesday;

public class TestClient {
	public static void main(String[] args) {
		Employee emp = new Employee(2);
		Lawyer lisa = new Lawyer(5);
		System.out.println(lisa.getHours());
		System.out.println(lisa.getVacationForm());
		Marketer John = new Marketer(10);
		System.out.println(John.getSalary());
		System.out.println(emp.getSalary());
		System.out.println(emp.getVacationDays());
		System.out.println(John.getVacationDays());
		
		System.out.println(lisa.getSalary());
		
	}

}
