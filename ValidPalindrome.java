package string;
	
public class ValidPalindrome {
	public static boolean isPalindrome(String s){
			if(s==null||s.length()==0) return false;
				s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  // Regular expression to remove all the non-alphanumerics and converting all to lowercase.
				int n = s.length();
				for (int i = 0; i < n/2; ++i) {        // The middle element is common
					if (s.charAt(i) != s.charAt(n-i-1)){
						return false;
					}
				}
			return true;
		}
	 
		public static void main(String[] args) {
			String str = "Ah, Satan sees Natasha";
			String str1 = "A man, a plan, a canal: Panama";
			String str2 = "";
			String str3 = "Sid";
	 
			System.out.println(isPalindrome(str));
			System.out.println(isPalindrome(str1));
			System.out.println(isPalindrome(str2));
			System.out.println(isPalindrome(str3));
		}
	}

