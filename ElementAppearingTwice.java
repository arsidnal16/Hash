package src.interview;

import java.util.HashMap;
import java.util.Map.Entry;

public class ElementAppearingTwice {

	public static void main(String[] args) {
		int[] arr = {2,1, 5, 7, 22, 7};
		int res = elementsingle(arr);
		System.out.println(res);
	}

	private static int elementsingle(int[] arr) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< arr.length ;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
				return arr[i];
			}
			else{
				map.put(arr[i], 1);
			}
		}
	
	return	-1;
		
		
		/*int result =0;
		for (Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				System.out.println(entry.getKey());
				result = entry.getKey();
				break;
			}
			else{
				result = -1;
			}
		}
	return	result;
	}
	*/
	}
}
