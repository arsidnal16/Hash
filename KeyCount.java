package src.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class KeyCount {
	
	public static void main(String args[]){
		printKeyAndValues();
	}

	
	public static HashMap<String, Integer> map = new HashMap<String, Integer>();
	private static Scanner fileScanner;
	
	public static void printKeyAndValues(){
		String line =  null;
		
		try {
			fileScanner = new Scanner(new File("/Users/siddharthasingh/Desktop/keyCount.txt"));
			while (fileScanner.hasNextLine()){
				line = fileScanner.next();
				calculateScore(line); // function to calculate the string occurrences.
			}
			for(String k: map.keySet()){
				System.out.println("The total for "+k+" is "+map.get(k));  
			}
			
		} 
		catch (IOException e) {   // Catching the IO Exception here
				System.out.println("Please check the address/name of the text file");
				e.printStackTrace();  
			}
		
		
		
	}
	
	public static void calculateScore(String line) {
		String[] sb;
		if(line.trim().length() > 0){
			sb = line.split(",");   // Splitting the string on comma
			if(sb != null && sb.length > 0  && sb.length == 2){
				String key = sb[0];
				int value = Integer.valueOf(sb[1]);
		
				if(map.containsKey(key)){
					map.put(key, map.get(key) + value);  // If the key already exists, increment its value
				}
				else{
					map.put(key, value);  // If it is the first time this key is encountered, Insert the key and its value into the map
				}
			}
		}	
	}
	
}
