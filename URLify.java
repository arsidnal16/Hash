package src.interview;

import java.util.Scanner;

public class URLify {
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		char[] str = st.toCharArray();
		int len = 13;
		replaceSpaces(str, len);
		System.out.println(str);
   }

	

	private static int countSpaces(char[] str, int length) {
	    int numSpaces = 0;
	    for (int i = 0; i < length; i++) {
	      if (str[i] == ' ') {
	        numSpaces++;
	      }
	    }
	    return numSpaces;
	  }
	
	private static char[] replaceSpaces(char[] str, int len) {
	
		int numSpaces = countSpaces(str, len);
	    int endPtr = len - 1 + numSpaces * 2;
	    for (int i = len - 1; i >= 0; i--) {
	      if (str[i] == ' ') {
	        str[endPtr] = '0';
	        str[endPtr - 1] = '2';
	        str[endPtr - 2] = '%';
	        endPtr -= 3;
	      } else {
	        str[endPtr] = str[i];
	        endPtr--;
	      }
	    }
	    return str;
	  }

		
	}
	
	
