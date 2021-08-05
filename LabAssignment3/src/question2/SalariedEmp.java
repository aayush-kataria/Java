package question2;

public class SalariedEmp extends Employee{
	
	private double rates;
		
	public SalariedEmp(String empName, String EmpId, double rates) {
		super(empName, EmpId);
		this.rates = rates;
	}
	
	public void setRates(double newRates) {
		this.rates = newRates;
		System.out.println("Rate has been incremented");
	}
	
	@Override
	public double getSalary() {
		return rates*35;
	}

	
	@Override
	public void display() {
		System.out.println("-----Salary Employee-----");
		super.display();
	}
	
	@Override
	public double getPayment() {
		System.out.println("Payment");
		return getSalary();
	}
	
}
