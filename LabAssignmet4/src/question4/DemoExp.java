package question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoExp {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try{
			
			System.out.println("Please enter a number or enter -1 if u wanna exit");
			
			int val = scanner.nextInt();
			if(val == -1) {
				System.exit(0);
			}else if(val %2 == 0) {
				System.out.println("You have enterede an even number");
			}else if(val % 2 != 0) {
				System.out.println("You have enterede an odd number");
			}
		}catch (InputMismatchException e) {
			System.out.println("You musty only enter a number");
		}
		
		scanner.close();
	}

}
