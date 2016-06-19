package Hash;

public class PairSum {
	
	private static final int MAX = 10000;
	
	public static void main(String args[]){
		 int arr[] = {1, 4, 45, 6, 10, 8};
	     int n = 18;
	     pairsWithSum(arr,n);

	}

	private static void pairsWithSum(int[] arr, int n) {
		boolean[] map = new boolean[MAX];
		
		for (int i =0; i< arr.length; i++){
			int temp = n - arr[i];
			System.out.println(temp);
			if(temp>= 0 && map[temp]){
				System.out.println("The two numbers are " + temp +" "+ arr[i]);
			}
			map[arr[i]]= true;
		}
		
		
	}

}
