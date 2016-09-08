package Array;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,32,3,-40,4,67,3,-200,0,45,2,0};
		int k = maxProductSubArray(arr);
		System.out.println(k);

	}

	private static int maxProductSubArray(int[] arr) {
		int n = arr.length;
		
		int[] max = new int[n];
		int[] min = new int [n];
		
		max[0] = min[0] = arr[0];
		
		int result = arr[0];
		
		for(int i=1; i< n ;i++){
			if(arr[i] > 0){
				max[i] = Math.max(arr[i], max[i-1]*arr[i]);
				min[i] = Math.min(arr[i], min[i-1]*arr[i]);
			}
			else{
				max[i] = Math.max(arr[i], min[i-1]*arr[i]);
				min[i] = Math.min(arr[i], max[i-1]*arr[i]);
			}
			
			result = Math.max(result, max[i]);
		}
		
		
		
		
		return result;
	}

}
