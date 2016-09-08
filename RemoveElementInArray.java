package Array;

import java.util.Arrays;

public class RemoveElementInArray {
	

	    public static int removeElement(int[] nums, int val) {
	    	
	    	int n = nums.length ;
	    	
	    int i=0;
	    int j =0;
	   
	    // using 2 pointers
	    while(j < n ){
	    	if(nums[j] != val){
	    		nums[i] = nums[j];
	    		i++;
	    	}
	    	j++;
	    }
	    return i;
	        
	    }
	    
	    public static void main(String args[]){
	    	int[] arr = {3,2,3,2,2,3};
	    	System.out.println(removeElement(arr, 3));
	    	System.out.println(Arrays.toString(arr));
	    }

}
