package question2;

public class ComissionedEmp extends Employee{
	
	private double percentageOfSales;
	private double totalWeeklySales;
	
	public ComissionedEmp(String empName, String empId, double percentOfSales, double totalWeeklySales) {
		super(empName, empId);
		this.percentageOfSales = percentOfSales;
		this.totalWeeklySales = totalWeeklySales;		
	}
	
	public double salary() {
		return (percentageOfSales*totalWeeklySales)/100;
	}

	@Override
	public double getSalary() {
		return salary();
	}
	
	public void increment(double percent) {
		this.percentageOfSales = this.percentageOfSales + percent;
	}
	
	public void display() {
		System.out.println("Comissioned Emnployee");
		super.display();
		System.out.println(" Comissioned Salary: " + salary());
	}

	@Override
	public double getPayment() {
		return getSalary();
	}

}
                