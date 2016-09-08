package Array;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,32,3,-40,4,67,3,-200,0,45,2,0};
		int k = maxSumSubArray(arr);
		System.out.println(k);
	}

	private static int maxSumSubArray(int[] arr) {
		int n = arr.length;
		int max = arr[0];
		int sum = arr[0];
		
		for(int i=0 ;i<n;i++){
			sum  = Math.max(sum+arr[i], arr[i]);
			max = Math.max(max, sum);
			
		}
		
		return max;
	}

}
