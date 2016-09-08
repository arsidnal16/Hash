package src.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KeyCounterHacker {
	
	
	public static void main(String args[]){
		String[] elements = { "10",
				"10",
				
				"Alex",
				"Michael",
				"Harry",
				"Dave",
				"Michael",
				"Victor",
				"Harry",
				"Alex",
				"Mary",
				"Mary" };  
		
		HashMap<String, Integer> map = new HashMap();
		for (String s: elements) { 
			if(map.containsKey(s)){
		        map.put(s, map.get(s)+1);
			}else{
				 map.put(s, 1);
			}
		    }
		
		String res[] = new String[elements.length];
 		
		int max = (Collections.max(map.values()));
		int i=0;
		
		//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (String key : map.keySet()) {
		    Integer value = map.get(key);
		    if(value ==max){
		    	res[i]= key;
		    	i++;
		    }
		}
		
		
		String[] result = new String[i];
		
		for(int j = 0;j<result.length;j++){
			result[j] = res[j];
		}
		
		System.out.println(Arrays.toString(result));
		
		Arrays.sort(result);
		
		System.out.println(Arrays.toString(result));
		System.out.println(result[result.length-1]);
	}

}
