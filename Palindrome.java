package Array;

public class Palindrome {
	public static void main(String args[]){
		String s = "anamana";
		System.out.println(isPalindrome1(s));
				
	}

	private static boolean isPalindrome(String s) {
			char[] res = s.toCharArray();
			int n = res.length;
			
			for(int i=0; i< n/2;i++){
				if(res[i] != res[n-i-1]){
					return false;
				}
			}
		return true;
	}
	
	
	private static boolean isPalindrome1(String s){
		int length = s.length();
		String reverse ="";
		for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + s.charAt(i);
	
	if((s.equals(reverse))){
		return true;
	}
	else{
		return false;
	}
		
	}

}
