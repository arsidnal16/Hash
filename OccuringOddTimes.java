package src.interview;
// this one is using hashmap.. we can rather use bit xor


import java.util.HashMap;

public class OccuringOddTimes {
	public static int oddTimes(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < arr.length; i++){
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else{
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
		}
		for(int i = 0;i < arr.length; i++){
			if(map.containsKey(arr[i]) && map.get(arr[i])%2!=0){
				return arr[i];
			}
		}
		return -1; //-1 is returned only when input given is not according to the given condition
	} 
	
	
	public static void main(String[] args) {
			int[] arr = {1,2,3,2,3,1,3};
			System.out.println(oddTimes(arr));

	}

}