package Array;

import java.util.Arrays;

public class MoveZeroes {
	
	public static void main(String args[]){
		int[] arr = {1, 0, 13,5, 0 ,4,0,7,0};
		System.out.println(Arrays.toString(movezero(arr)));
	}

	private static int[] movezero(int[] arr) {
		int n = arr.length;
		
		int i =0;
		
		
		for(int k =0; k<n ; k++){
			if(arr[k] == 0){
				continue;
			}
			else{
				arr[i] = arr[k];
				i++;
				
				
			}
		}
		
		while(i< n){
			arr[i] =0;
			i++;
		}
		return arr;
	}

}
