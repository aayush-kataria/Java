package question2;

public class HourlyEmp extends Employee{
	
	private double hourlyRate;
	private int totalHours;
	
	public HourlyEmp(String empName, String empId, double hourlyRate, int totalHours) {
		super(empName, empId);
		this.hourlyRate = hourlyRate;
		this.totalHours = totalHours;
	}
	
	public void setRate(double newRate) {
		this.hourlyRate = this.hourlyRate + newRate;
	}
	
	
	@Override
	public double getSalary(){
		return totalHours*hourlyRate;
	}

	@Override
	public void display(){
		super.display();
		System.out.println();
	}
	
	@Override
	public double getPayment() {
		return getSalary();
	}
}
