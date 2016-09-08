package string;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aac";
		String Magazine = "aabc";
		
		System.out.println(canConstruct(ransomNote, Magazine));

	}

	private static boolean canConstruct(String ransomNote, String magazine) {
		int ranlen = ransomNote.length();
		int maglen = magazine.length();
		
		int[] arr = new int[26];
		
		for(int i = 0; i< maglen ; i++){
			arr[magazine.charAt(i) - 'a']++;
		}
		
		for(int i=0; i< ranlen; i++){
			if(--arr[ransomNote.charAt(i) - 'a'] <0){
				return false;
			}
		}
		return true;
		
		
	}

}
