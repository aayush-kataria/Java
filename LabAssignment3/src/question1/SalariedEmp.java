package question1;

public class SalariedEmp extends Employee {
	
	private double rates;
	
	
	public SalariedEmp(String empName, String EmpId, double rates) {
		super(empName, EmpId);
		this.rates = rates;
	}
	
	//to set rates of employee
	public void setRates(double newRates) {
		this.rates = newRates;
		System.out.println("Rate has been incremented");
	}
	
	//to get salary
	@Override
	public double salary() {
		return rates*35;
	}

	//overridden method to display employee details
	@Override
	public void display() {
		System.out.println("-----Salary Employee-----");
		super.display();
		System.out.println(" Weekly Salary: " + salary());
	}


}
