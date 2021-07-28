package com.assigment1;

public class CopyArray {
	
	
		public static void main(String[] args) {
			int x[]  = {1, 2, 3, 4, 5};
			int y[]  = copyOf(x);
			for(int i=0; i<x.length; i++ )
				System.out.print(x + " ");
		}
		
		public static int[] copyOf(int[] x) {
			int y[] = new int[x.length];
			for(int i = 0; i < x.length; i++) {
				y[i] = x[i];
			}
			return y;
			
		}
}
