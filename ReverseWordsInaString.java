package string;

public class ReverseWordsInaString {

	public static void main(String[] args) {
		String s = "This is a blue sky";
		String t = reversewords(s);
		System.out.println(t);

	}

	private static String reversewords(String s) {
		String[] res = s.split("\\s");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<res.length;i++){
			sb.append(res[res.length - i -1] + " ") ;
		}
		return sb.toString();
	}

}
