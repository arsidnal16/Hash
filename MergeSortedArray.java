package Array;

import java.util.Arrays;

public class MergeSortedArray {
	
	/*
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

	Note:
		You may assume that nums1 has enough space (size that is greater
 		or equal to m + n) to hold additional elements from nums2. 
 		The number of elements initialized in nums1 and nums2 are m and n respectively.
	 */

	public static void main(String[] args) {
		int[] arr1 = new int[14];
		int temp = 25;
		for(int i=0; i<7 ; i++){
			arr1[i] = temp;
			temp += 5;
		}
		int[] arr2 = {1,28,137,256};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		merge(arr1, 7,arr2, arr2.length);
		
		System.out.println(Arrays.toString(arr1));

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= 	m-1;
        int j = n-1;
        int k =	m+ n-1;
        
        
        while(i >=0 && j>=0){
        	if(nums1[i] > nums2 [j]){
        		nums1[k] = nums1[i];
        		i--;
        		k--;
        	}
        	else{
        		nums1[k] = nums2[j];
        		j--;
        		k--;
        	}
        }
        while(i>=0){
        	nums1[k] = nums1[i];
        	i--;
        	k--;
        }
        while(j>=0){
        	nums1[k] = nums2[j];
        	j--;
        	k--;
        }
        
	}

}
