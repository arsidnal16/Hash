package Array;


public class SharePrices {

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3, 6, 4};
		int k = maxProfit(arr);
		System.out.println("The max profit is "+k);

	}

	private static int maxProfit(int[] arr) {
		int n = arr.length;
		 if(n ==0 || arr.length <=1){
			 return 0;
		 }
		 
		 int min = arr[0];
		 int result = 0;
		 
		 for(int i =0 ; i <n ; i++){
			 min = Math.min(min, arr[i]);
			 result = Math.max(result, arr[i] - min);
			
		 }
		return result;
	}

}
