package question1;

public class ComissionedEmp extends Employee{
	
	private double percentageOfSales;
	private double totalWeeklySales;
	
	public ComissionedEmp(String empName, String empId, double percentOfSales, double totalWeeklySales) {
		super(empName, empId);
		this.percentageOfSales = percentOfSales;
		this.totalWeeklySales = totalWeeklySales;		
	}
	
	//to calculate salary of commissioned employee
	public double getSalary() {
		return (percentageOfSales*totalWeeklySales)/100;
	}

	//overridden method from abstract class
	@Override
	public double salary() {
		return getSalary();
	}
	
	//to increment the percentage of sales
	public void increment(double percent) {
		this.percentageOfSales = this.percentageOfSales + percent;
	}
	
	//to display info about the commissioned employee
	public void display() {
		System.out.println("Comissioned Emnployee");
		super.display();
		System.out.println(" Comissioned Salary: " + salary());
	}


}
                                      