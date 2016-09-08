package string;

import java.util.ArrayList;

public class ReverseVowels {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(revrseVowels(s));
	}

	private static String revrseVowels(String s) {
		
		ArrayList<Character> vowList = new ArrayList<Character>();
	    vowList.add('a');
	    vowList.add('e');
	    vowList.add('i');
	    vowList.add('o');
	    vowList.add('u');
	    vowList.add('A');
	    vowList.add('E');
	    vowList.add('I');
	    vowList.add('O');
	    vowList.add('U');
	 
	    char[] arr = s.toCharArray();
	 
	    int i=0; 
	    int j=s.length()-1;
	 
	    while(i<j){
	        if(!vowList.contains(arr[i])){
	            i++;
	            continue;
	        }
	 
	        if(!vowList.contains(arr[j])){
	            j--;
	            continue;
	        }
	 
	        char t = arr[i];
	        arr[i]=arr[j];
	        arr[j]=t;
	 
	        i++;
	        j--; 
	    }
	 
	    return new String(arr);
	}

}
