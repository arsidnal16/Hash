package string;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
	


	/*

	Given a string, find the length of the longest substring without repeating characters.

	 For example, the longest substring without repeating letters for "abcabcbb" is "abc",

	  which the length is 3. For "bbbbb" the longest substring is "b", 

	  with the length of 1. 

	*/

		public static void main(String[] args){
			
			String s = "abcdadewsafdedas";

			System.out.println("longest " +lengthOfLongestSubstring(s));

		}

		public static int get_longest(String str){

		HashSet<Character> wordSet = new HashSet<Character>();

		int longest = 0;

			for(int i = 0; i < str.length(); i++){

				for(int j = i; j < str.length(); j++){

				

				if(!wordSet.contains(str.charAt(j))){

					wordSet.add(str.charAt(j));

				}

				else{

					if(wordSet.size()>longest){

						longest = wordSet.size();

					}

					wordSet.clear();

					break;

				}

			  }

			}

			return longest;

		}
		
		
		
		public static int lengthOfLongestSubstring(String s) {
	        if(s==null)
	            return 0;
	        char[] arr = s.toCharArray();
	        int pre = 0;
	 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	 
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			} else {
				pre = Math.max(pre, map.size());
				i = map.get(arr[i]);
				map.clear();
			}
		}
		
		//System.out.println(map.size());
	 
		return Math.max(pre, map.size());
	}

	}


