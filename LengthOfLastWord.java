package string;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s= "Hello This is Sid";
		System.out.println(lengthofWord(s));
				
	}

	private static int lengthofWord(String s) {
		if(s.length() == 0 || s == null){
			return 0;
		}
		//int result = 0;
		
		//int n = s.length();
		
		String[] arr = s.split("\\s");
		
		String res = arr[arr.length -1];
		
		return res.length();
		
	}

}
