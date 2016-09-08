package src.interview;

import java.util.Arrays;
import java.util.Scanner;

public class PermString {
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String st = sc.nextLine();
		System.out.println("Enter 2nd String");
		String tt = sc.nextLine();
		System.out.println(permutation(st,tt));
		
		
		
 
   }

	private static String sort(String st) {
		
		char[] content = st.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	private static boolean permutation(String s, String t) {
		if(s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
}