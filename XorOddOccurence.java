package src.interview;

public class XorOddOccurence {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,3,1,3};
		System.out.println(oddTimes(arr));

		}

	private static int oddTimes(int[] arr) {
		
		int res = 0;
		for(int i =0; i<arr.length;i++){
			res = res^arr[i];
			
		}
		return res;
		// TODO Auto-generated method stub
		
	}

}
