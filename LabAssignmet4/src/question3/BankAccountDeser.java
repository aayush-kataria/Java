package question3;

import java.io.*;

public class BankAccountDeser {
	
	public static void main(String[] args) {
		
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\ve00ym265\\Desktop\\demo.ser")));) {

			BankAccount account1 = (BankAccount) ois.readObject();
			account1.display();
			ois.close();
			
			System.out.println("Deserialisation is done");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
	