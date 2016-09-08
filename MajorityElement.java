package Array;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {11, 21, 1, 1 , 1, 2, 1 , 1 , 1 ,1};
		System.out.println(majorityElement(arr));

	}
	
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        int result = 0;
        int count =0;
        for(int i=0; i< n; i++){
        	if(count ==0){
        		result = nums[i];
        		count = 1;
        	}
        	else if(result == nums[i]){
        		count++;
        	}
        	else{
        		count--;
        	}
        	
        	System.out.println(count);
        	System.out.println(result);
        }
        return result;
     }

}
