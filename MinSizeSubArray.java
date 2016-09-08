package Array;

import java.util.Arrays;

public class MinSizeSubArray {

	public static void main(String[] args) {
		int[] numbers = {2,3,1,2,4,3};
		int target = 8;
		int res = minSubArrayLen(numbers, target);
		System.out.println(res);
	}

	public static int minSubArrayLen( int[] nums, int s) {
	    if(nums==null || nums.length==1)
	        return 0;
	 
	    int result = nums.length;
	 
	    int start=0;
	    int sum=0;
	    int i=0;
	    boolean exists = false;
	 
	    while(i<=nums.length){
	        if(sum>=s){
	            exists=true; //mark if there exists such a subarray 
	            if(start==i-1){
	                return 1;
	            }
	 
	            result = Math.min(result, i-start);
	            sum=sum-nums[start];
	            start++;
	 
	        }else{
	            if(i==nums.length)
	                break;
	            sum = sum+nums[i];
	            i++;    
	        }
	    }
	 
	    if(exists)
	        return result;
	    else
	        return 0;
	}

}
