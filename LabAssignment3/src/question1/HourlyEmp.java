package question1;

public class HourlyEmp extends Employee{
	
	private double hourlyRate;
	private int totalHours;
	
	public HourlyEmp(String empName, String empId, double hourlyRate, int totalHours) {
		super(empName, empId);
		this.hourlyRate = hourlyRate;
		this.totalHours = totalHours;
	}
	
	//to set the rates of employee
	public void setRate(double newRate) {
		this.hourlyRate = this.hourlyRate + newRate;
	}
	
	//overridden method from abstract class
	@Override
	public double salary(){
		return totalHours*hourlyRate;
	}

	//overridden method to display employee details 
	@Override
	public void display(){
		super.display();
		System.out.println();
	}
	
}
