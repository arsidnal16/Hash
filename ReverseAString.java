package string;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "abcde";
		
		System.out.println(revrseString(s));

	}

	private static char[] revrseString(String s) {
		
		StringBuilder sb = new StringBuilder();
		int n = s.length();
		
		for(int i  =0 ; i < n; i++){
			sb.append(s.charAt(n-i-1));
		}
		
		return sb.toString().toCharArray();
	}

}
