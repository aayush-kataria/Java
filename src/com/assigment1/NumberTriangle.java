package com.assigment1;

import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		
		int x[][] = new int[n][n];
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<=i; j++) {
				x[i][j] = j+1;
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
