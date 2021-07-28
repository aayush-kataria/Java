package com.assigment1;

public class Table1to9 {
	public static void main(String[] args) {
		
		int x[][] = new int[9][9];
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=0; j<x[i].length; j++) {
				x[i][j] = (i+1)*(j+1);
				System.out.print(x[i][j] + " "); 
			}
			System.out.println();
		}
	}

}
