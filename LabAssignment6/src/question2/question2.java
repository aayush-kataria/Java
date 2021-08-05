package question2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class question2 {

	public static void main(String[] args) {
		
		
		try {
			String text = "THis will be the contentsof the file where the frequency of each word would be calculated";
			//to write contents to file
			BufferedWriter fWriter = new BufferedWriter(new FileWriter("C:\\Users\\ve00ym265\\Desktop\\Freq.txt"));
			fWriter.write(text);
			System.out.println("Contents written to the file sucessfully");
			
			//to read contents from file
			BufferedReader fReader = new BufferedReader(new FileReader("C:\\Users\\ve00ym265\\Desktop\\Freq.txt"));
			
			Map<String, Integer> map = new HashMap<>();
			
			
			String line;
			//to map each word read in the file to a value
			while((line = fReader.readLine())!=null) {
				String[] newLine = line.split(" ");
				
				for(int i=0; i<newLine.length; i++) {
					if(map.containsKey(newLine[i])) {       //if word already exists then increase the frequency by 1
						map.put(newLine[i], map.get(newLine[i] + 1));
					}
					else {
						map.put(newLine[i], 1); //add a new key value pair
					}
				}
			}
			
			//for displaying the frequency of each word
		     for (Map.Entry<String, Integer> mapElement : map.entrySet()) {
		    	 //getting key
		            String key = mapElement.getKey();
		  
		            // Finding the value
		            int value = mapElement.getValue();
		  
		            System.out.println(key + " : " + value);
	        }
		     
		     fWriter.close();
		     fReader.close();
		     
		}catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
		
