import java.util.Arrays;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Set;

public class testIO {

	public static void main(String args[]){
		
		Hashtable<Integer, ArrayList<String>> hash = new Hashtable<Integer, ArrayList<String>>();
		
		int temp;
		int rollingTotal = 0;
		
		Scanner scan = new Scanner(System.in);
		
		String next = scan.nextLine();
		
		for(int i = 0; i < next.length(); i++){
			temp = (int)next.charAt(i);
			rollingTotal+= temp;
		}
		System.out.println(rollingTotal % 30);
		
		/*
		for(int i = 0; i < 30; i++){
			ArrayList<String> list1 = new ArrayList<String>();
			Integer int1 = new Integer(i);
			hash.put(int1, list1);
		}
		
		
		for(int i = 0; i < next.length(); i++){
			temp = (int)next.charAt(i);
			rollingTotal += temp;
			Integer key = new Integer(rollingTotal % 30);
			ArrayList<String> tempo = hash.get(key);
			tempo.add(next);
		}
		Integer ii = new Integer(9);
		ArrayList<String> wordHolder = hash.get(ii);
		System.out.println(Arrays.toString(wordHolder.toArray()));
		*/
		}

}
