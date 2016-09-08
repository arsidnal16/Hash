package HashMap;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		int[] arr = {0,3,2,1,5,6};
		int k = hIndex(arr);
		System.out.println(k);

	}
	public static int hIndex(int[] citations) {
        Arrays.sort(citations);
 
    int result = 0;    
    for(int i=0; i<citations.length; i++){
        int smaller = Math.min(citations[i], citations.length-i);
        result = Math.max(result, smaller);
    }
 
    return result;
    }

}
