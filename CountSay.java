package string;

public class CountSay {

	public static void main(String[] args) {
		int n = 12211;
		System.out.println(countAndSay(n));

	}

	public static String countAndSay(int n) {
		if(n<0) return "";

		int i = 1;

		String in = String.valueOf(n);

		int cnt = 1;

		StringBuilder builder = new StringBuilder();

			while(i < in.length()) {
				
				if(in.charAt(i) == in.charAt(i-1)) {

					cnt++;

				} else {

					builder.append(cnt);

					builder.append(in.charAt(i-1));

					cnt = 1;

				}

				i++;

			}
			
		builder.append(cnt);

		builder.append(in.charAt(i-1));

		return builder.toString();

		}

}
