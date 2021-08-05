package question7;

import java.io.IOException;

public class MoreException {

	
	
	public static void main(String[] args) {
		
		//to throw exception
		TwoException twoexpException = new TwoException();
		try {
			twoexpException.throwException(2);
		} catch (InputExp e) {
			System.out.println("input Exception occured");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception Occured");
			e.printStackTrace();
		}
		
	}
}

