package question3;

import java.io.*;  

public class BankAccountSer {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("Hooman", "Hm1", 9999999.999);
		try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\ve00ym265\\Desktop\\demo.ser")));){
			
			oss.writeObject(account);
			System.out.println("serialization is successful");
			oss.close();
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		account = null;
	}
}
