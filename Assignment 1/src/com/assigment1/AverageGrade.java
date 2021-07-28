package com.assigment1;

import java.util.Scanner;

public class AverageGrade {
public static void main(String[] args) {
		
		int n;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the number of students");
		n=scanner.nextInt();
		int arr[]=new int[n];
		double sum = 0;
		for(int i=0; i<n; i++) {
			int j = i+1;
			System.out.println("Enter the grde of student " + j);
			arr[i]=scanner.nextInt();
			if(arr[i]>100) {
				System.out.println("Invalid grade, try again...");
				continue;
			} else {
				sum = sum+arr[i];
			}
		}
		
		System.out.println(sum/n);
		scanner.close();
	}

}
