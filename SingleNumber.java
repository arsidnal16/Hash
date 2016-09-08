package HashMap;

public class SingleNumber {
	
	/*
	 * Given an array of integers, every element appears twice except for one. Find that single one.
	 */

	public static void main(String[] args) {
		int arr[] = {2,2,3,4,5,3,4,5,6,7,6,8,8};
		int k = singleNumber(arr);
		System.out.println(k);
	}
	
	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;     // XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0. 
		}
		return x;
	}

}
