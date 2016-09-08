package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] arr = {2,4,-2,6,-4,-2,-6,6,8};
		int k = 8;
		List<List<Integer>> result = FourSum(arr,k);
		
		for(List l : result){
			
				System.out.println(l);
		
		}
		
		
		
	}
				
	public static List<List<Integer>> FourSum(int[] arr, int target){
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int n = arr.length;
		if(n<4){
			return result;
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i< n-3 ; i++){
			if(i!=0 && arr[i] == arr[i+1]){
				continue;
			}
			for(int j = i+1; j< n-2; j++){
				if(j!=i+1 && arr[j]  == arr[j+1] ){
					continue;
				}
				int k = j+1;
				int l = n-1;
				
				while(k<l){
					if(arr[i] + arr[j] + arr[k] + arr[l] < target){
						k++;
					}
					else if(arr[i] + arr[j] + arr[k] + arr[l] > target){
						l--;
					}
					else{
						List <Integer> res = new ArrayList<>();
						res.add(arr[i]);
						res.add(arr[j]);
						res.add(arr[k]);
						res.add(arr[l]);
						if(!result.contains(res)){
							result.add(res);
						}
						k++;
						l--;
					}
					while(k< l ){
						l--;
					}
					
					while(k< l && arr[k] == arr[k-1]){
						k++;
					}
					
				}
			}
		}
		return result;
		
	}
	
	
}
