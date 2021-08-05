package question2;

abstract class Employee implements Payable{
	
	private	String empName;
	private String empId;
	
	public Employee(String empName, String empId) {
		this.empName = empName;
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public abstract double getSalary();
	
	
	public void display() {
		System.out.println("Employee name : " + empName + " Emp Id : " + empId);
	}

}
