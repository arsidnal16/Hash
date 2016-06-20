package Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSum {
	
	private static final int MAX = 10000;
	
	public static void main(String args[]){
		 int arr[] = {1, 4, 45, 6, -27, 10, 8};
	     int n = 18;
	     int[] result = new int[2];
	     result = twoSum(arr,n);
	     System.out.println("The array indices are as follows "+Arrays.toString(result));

	}

	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

}
