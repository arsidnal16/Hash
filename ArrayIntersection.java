package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersection {

	
	public static void main(String args[]){
		
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};
		
		int[] res = intersection(arr1, arr2);
		System.out.println(Arrays.toString(res));
		
	}
	
	 public static int[] intersection(int[] nums1, int[] nums2) {
	        HashSet<Integer> set1 = new HashSet<Integer>();
	        
	         int[] EMPTY= {};
	        
	        HashSet<Integer> result = new HashSet<Integer>();
	        
	        if(nums1.length == 0 || nums2.length == 0){
	            return EMPTY;
	        }
	        
	        for(int i=0; i< nums1.length; i++){
	           
	            set1.add(nums1[i]);
	            
	        }
	       
	       for (int i = 0; i < nums2.length; i++) {

	            if(set1.contains(nums2[i])){
	                   result.add(nums2[i]);
	            }

	       }
	    int[] resArr= new int[result.size()];
	    int i = 0;
	    for (Integer val : result) resArr[i++] = val;
	  
	    return resArr;
	    }
}
