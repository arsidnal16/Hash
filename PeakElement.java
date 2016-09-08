package Array;

public class PeakElement {

	public static void main(String[] args) {
		int[] arr = {1,4,3,56,34,23,72,24,234,2333,2344,54,29};
		int k = peakElement(arr);
		System.out.println(k);
	}

	private static int peakElement(int[] arr) {
		int max = arr[0];
		int index = 0;
		
		for(int i = 1; i< arr.length -2 ; i++){
			int pre = arr[i-1];
			int curr = arr[i];
			int next = arr[i+1];
			
			if(curr>pre && curr >next && curr >max){
				max = curr;
				index = i;
			}
			
		}
		
		
		return index;
	}

}
