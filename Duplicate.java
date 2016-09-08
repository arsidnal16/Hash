package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
	public static void main(String args[]){
		int[] arr = {1,2,2,3};
		System.out.println(isDuplicate(arr));
		System.out.println(Arrays.toString(arr));
	}

	private static boolean isDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			if(set.contains(arr[i])){
				return false;
			}
			else{
				set.add(arr[i]);
			}
		}
		
		return true;
	}

}
