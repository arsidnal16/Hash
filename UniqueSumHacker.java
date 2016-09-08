package src.interview;

import java.util.Arrays;
import java.util.HashMap;

public class UniqueSumHacker {
	
	public static void main(String args[]){
		int[] arr = {4,2,2,4,5};
		System.out.println(getMinimumUniqueSum(arr));
	}
	
	
	static int getMinimumUniqueSum(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		boolean duplicate = false;
		int sum =0;
		
		
		for(int i=1; i< arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
				duplicate = true;
			}
			else{
				map.put(arr[i],1);
				
			}
		}
		
		if (duplicate == false){
			for(int i=0;i<arr.length;i++){
				sum += arr[i];
			}
			return sum;
		}
		else{
			int[] resultArray = new int[arr.length-1];
			int l=1;
			for(int k=0;k<resultArray.length;k++){
			resultArray[k] = arr[l];
				l++;
			}
			System.out.println(Arrays.toString(resultArray));
			Arrays.sort(resultArray);
			System.out.println(Arrays.toString(resultArray));
			for(int i=1;i<resultArray.length;i++){
				if(resultArray[i] == resultArray[i-1]){
					resultArray[i]= resultArray[i]+1;
					
			}
			}
			System.out.println(Arrays.toString(resultArray));
				for(int j =0;j< resultArray.length;j++){
					sum += resultArray[j];
				}
				return sum;
		}
			

    
	}
}
