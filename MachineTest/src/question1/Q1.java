package question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


class SortByPrice implements Comparator<Merchandise>{

    @Override
    public int compare(Merchandise m1, Merchandise m2) {
        return Double.compare(m2.getUnitPrice(), m1.getUnitPrice());
    }
	
}

public class Q1 {
	public static void main(String[] args) {
		
		
		ArrayList<Merchandise> itemsList = new ArrayList<Merchandise>();
		
		try {
			BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\ve00ym265\\Desktop\\abc1.txt"));
			
			String lineString = null;
			while((lineString = bufReader.readLine())!=null) {
				String tokens[] = lineString.split(" ");
				itemsList.add(new Merchandise(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2])));	
			}
			
			bufReader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		Collections.sort(itemsList);
		
	}
}
