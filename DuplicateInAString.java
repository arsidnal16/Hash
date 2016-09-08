package src.interview;



import java.util.HashMap;

public class DuplicateInAString {
	
	public static void main(String args[]){
		int[] arr = {1, 2, 3, 67, 89, 54, 32, 76, 78, 75, 4, 5,89};
		System.out.println(containsDuplicate(arr));
		
	}
	
public static boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
            	return true;
            }
            else{
            	map.put(nums[i], i);
            }
            
        }
        return false;
        
    }

}
