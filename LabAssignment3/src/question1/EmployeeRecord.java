package question1;

import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeRecord {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter ID");
		String id = scanner.next();
			System.out.println("Enter 1 to add employee");
			System.out.println("Enter 2 to increment employee");
			System.out.println("Enter 3 to view employee rates");
			
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter 1 to add Salaried employee");
			System.out.println("Enter 2 to add Houyrly employee");
			System.out.println("Enter 3 to add Comisioned employee");
				int type = scanner.nextInt();
				switch (type) {
				// to create object of different types of employee as per the needs
				case 1:
					System.out.println("Enter rates");
					double rate = scanner.nextDouble();
					SalariedEmp sEmp = new SalariedEmp(name, id, rate);
					employees.add(sEmp);
					break;
					
				case 2:
					System.out.println("Enter total hours");
					int totalhours = scanner.nextInt();
					System.out.println("Enter hourly rate");
					double hourlyrate = scanner.nextDouble();
					HourlyEmp hEmp = new HourlyEmp(name, id, hourlyrate, totalhours);
					employees.add(hEmp);
					break;
					
				case 3:
					System.out.println("Enter total weekly sales");
					double totalweeklysales = scanner.nextDouble();
					System.out.println("Enter percent of sales");
					double perofsales = scanner.nextDouble();
					ComissionedEmp cEmp = new ComissionedEmp(name, id, perofsales, totalweeklysales);
					employees.add(cEmp);
					break;
					
				default:
					System.out.println("Invalid type");
					break;
				}
			
			break;
			// to increment salary
		case 2: 
			System.out.println("Enter 1 to increment Salaried employee");
			System.out.println("Enter 2 to increment Houyrly employee");
			System.out.println("Enter 3 to increment Comisioned employee");
			
			int type1 = scanner.nextInt();
			System.out.println("Enter new rates");
			double newrate = scanner.nextDouble();
			
			for(Employee employee : employees) {
				if(type1 == 1) {
					if(employee instanceof SalariedEmp) {
						((SalariedEmp) employee).setRates(newrate);
					}
				}else if(type1 == 2) {
					if(employee instanceof HourlyEmp) {
						((HourlyEmp) employee).setRate(newrate);
					}
				}else if(type1 == 3) {
					if(employee instanceof ComissionedEmp) {
						((ComissionedEmp) employee).increment(newrate);
					}
				}
				else {
					System.out.println("Wrong Choice");
					break;
				}
			}
			
			break;
		
			//to display employee information
		case 3:
			for(Employee employee : employees) {
				employee.display();
			}
			break;
			
			// to exit the system
		case 4:
			System.out.println("Exiting System");
			System.exit(0);
			
		default:
			System.out.println("Invalid option");
			break;
		}
		
			scanner.close();
			
	}
}
