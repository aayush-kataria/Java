package question6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExpUse{
	
	public static void number(int num) throws InputException{
		if(num > 100)
			throw new InputException(100);
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
		}catch (InputException e) {
			System.out.println(e.getMessage());
		}
				
		scanner.close();
	}

}
