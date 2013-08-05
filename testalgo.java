import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class testalgo {

	public static void main(String args[]) throws IOException{
		
		Hashtable<Integer, ArrayList<String>> hash = new Hashtable<Integer, ArrayList<String>>();
		
		int temp;
		int rollingTotal = 0;
		
		for(int q = 0; q < 30; q++){
			ArrayList<String> list1 = new ArrayList<String>();
			Integer int1 = new Integer(q);
			hash.put(int1, list1);
		}
		try {
	   	
			String filename = "dictlist.txt";
			Scanner scanf = new Scanner(new File(filename));

	   
			while(scanf.hasNextLine()){	
				String s = scanf.nextLine();
		   
			
				for(int i = 0; i < s.length(); i++){
					temp = (int)s.charAt(i);
					rollingTotal += temp;
					Integer key = new Integer(rollingTotal % 30);
					ArrayList<String> tempo = hash.get(key);
					tempo.add(s);
				}
		   
			}
			Integer testint = new Integer(15);
			ArrayList<String> list2 = hash.get(testint);
			System.out.println(Arrays.toString(list2.toArray()));
			scanf.close();
	
			}
			catch (FileNotFoundException e){
				System.out.println(e);
			}
			catch (IOException e){
				System.out.println(e);
			}
	
		}
		
}
