package question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxDouble {
	
	public static void main(String[] args) {
		 Scanner scan;
		    File file = new File("C:\\Users\\ve00ym265\\Desktop\\data11.txt");
		    try {
		        scan = new Scanner(file);
		        double ans = Integer.MIN_VALUE;
		        
		        //for running loop while there exists a number in the file
		        while(scan.hasNextDouble())
		        {
		        	double number = scan.nextDouble();
		            if(number > ans)
		            	ans = number;
		        }
		        System.out.println(ans);

		    } catch (FileNotFoundException e1) {
		            e1.printStackTrace();
		    }
	}

}
