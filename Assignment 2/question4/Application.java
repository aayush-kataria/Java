package com.question4;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		String id, name;
		double grade;
		int year;
		 
		Scanner sc = new Scanner(System.in);
			System.out.println("To create student object follow the instructions");
			System.out.println("Enter name of the student");
			name = sc.nextLine();
			System.out.println("Enter id of the student");
			id = sc.nextLine();
			System.out.println("Enter grade of the student");
			grade = sc.nextDouble();
			System.out.println("Enter year of the student");
			year = sc.nextInt();
			Student student = new Student(id, name, grade);
			student.dsiplay();
			student.display(year);
				
			sc.close();
		
	}
}
