package question5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpWrapNRethrow {
	
	//function for catching and re-throwing exception
	public static void number(int num) throws Exception{
		if(num > 100)
			throw new Exception("Number Can'ty be greater than 100");
	}
	
	public static void main(String[] args) {
		
		//to throw exception
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int num = scanner.nextInt();
			number(num);	
		}catch (InputMismatchException e) {
			System.out.println("You are only allowed to enter number");
		}catch (Exception e) {
			//to display message thrown by the exception
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}

}
