package HashMap;

import java.util.HashMap;

public class ContainsDuplicate2 {
	
	/*
	 * 
	 * Given an array of integers and an integer k,
	 *  find out whether there are two distinct indices i and j in the array
	 *   such that nums[i] = nums[j] 
	 * and the difference between i and j is at most k.
	 */

	public static void main(String[] args) {
		int[] arr = {4,5, 7, 9,14,15,16,343,122,34,56,67,76};
		int k = 5;
		System.out.println(containsDuplicate2(arr,k));

	}

	private static boolean containsDuplicate2(int[] arr, int k) {
		int n = arr.length;
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			
			if(map.containsKey(arr[i]) && i - map.get(arr[i]) <= k){
				return true;
				
			}
			else{
				map.put(arr[i], i);
			}
			
		}
		return false;
	}

}
