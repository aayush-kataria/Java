package question1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadWriteCmd {
	
	public static void main(String[] args) {
		try {
			Path path = Paths.get("C:\\Users\\ve00ym265\\Desktop\\abc1.txt");
            byte[] fileData = Files.readAllBytes(path);
            
            String string = new String(fileData,StandardCharsets.UTF_8);
            
            System.out.println("To print to the console in Formatted Output");
        	System.out.println(string);
        	
        	System.out.println("To print the contents of the file in Byte Format");
        	System.out.println(Arrays.toString(fileData));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
