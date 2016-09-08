package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String args[]){
		
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
		
		
	}
	
	public static boolean isAnagram1(String s, String t){	
	char[] word1 = s.toCharArray();
	char[] word2 = t.toCharArray();

	HashMap<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

	for (char c : word1) {
	    int count = 1;
	    if (lettersInWord1.containsKey(c)) {
	        count = lettersInWord1.get(c) + 1;
	    }
	    lettersInWord1.put(c, count);
	}

	for (char c : word2) {
	    int count = -1;
	    if (lettersInWord1.containsKey(c)) {
	        count = lettersInWord1.get(c) - 1;
	    }
	    lettersInWord1.put(c, count);
	}

	for (char c : lettersInWord1.keySet()) {
	    if (lettersInWord1.get(c) != 0) {
	        return false;
	    }
	}

	return true;
	
	
}
	public static boolean isAnagram(String s, String t){
		int m = s.length();
		int n = t.length();
		
		if(m != n){
			return false;
		}
		
		int[] table = new int[26];
		for(int i=0; i<m;i++){
			table[s.charAt(i) - 'a']++;
			table[t.charAt(i) - 'a']--;
		}
		
		for(int tab: table){
			if (tab !=0){
				return false;
			}
		}
		
		return true;
	}

}
