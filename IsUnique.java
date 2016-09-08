package src.interview;

import java.util.Hashtable;
import java.util.Scanner;

public class IsUnique {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		//StringBuilder store = new StringBuilder();
		//int count = 0;
		
		System.out.println(IsUnique(st));
		
		
	}

	private static boolean IsUnique(String st) {
		if (st.length() > 128) return false;
		
		 boolean[] char_set = new boolean[128];
		 for(int i=0; i< st.length(); i++){
			 int val = st.charAt(i);
			 if (char_set[val]) {  // Already found this char in string
				 return false;
			 }
			 char_set[val] = true;
		 }
		return true;
	}
		
		
	

}
