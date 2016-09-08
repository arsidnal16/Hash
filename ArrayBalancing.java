package Array;



public class ArrayBalancing {

	public static int BalancedArray(int A[], int len)
	{
	int bigSum = 0;	
	int smallSum = 0; 
	int i;
	
	for (i = 1; i < len+1; ++i)
			bigSum += A[i];

	for( i = 1; i < len+1; ++i)
		{
			bigSum -= A[i]; 
			if(smallSum == bigSum){
				return i;
			}
			smallSum += A[i];
		}
		
	return -1;  // If no index is found
	}

	public static void  main(String args[])
	{
	int arr[] = {6,1,2,2,2,2,3};
	int arrLen = arr[0];
	int arr1[] = {4,1,2,3,3};
	int arrLen1 = arr1[0];
	System.out.println("First balanced index is " + BalancedArray(arr, arrLen));
	System.out.println("First balanced index is " + BalancedArray(arr1, arrLen1));

	}

}
