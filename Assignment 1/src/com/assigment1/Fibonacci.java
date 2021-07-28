package com.assigment1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int x[] = new int[20];
		Scanner scanner =new Scanner(System.in);
		x[0]=1; x[1]=1;
		for(int i1=2; i1<x.length; i1++) {
			x[i1] = x[i1-1] + x[i1-2];
		}
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		scanner.close();
	}
	
}
