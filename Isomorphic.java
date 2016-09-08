package HashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class Isomorphic{

	public boolean isIsomorphic(String s1, String s2) {

			if (s1.length() != s2.length())
				return false;

			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();

			HashMap<Character, Integer> s1map = new HashMap<Character, Integer> ();

			HashMap<Character, Integer> s2map = new HashMap<Character, Integer>();

			for (int i = 0; i < s1.length(); i++) {

				if (!s1map.containsKey(s1.charAt(i)))

					s1map.put(s1.charAt(i), i);

				if (!s2map.containsKey(s2.charAt(i)))

					s2map.put(s2.charAt(i), i);

			}

			//System.out.println(s1map);
			//System.out.println(s2map);
			
			
			for (int i = 0; i < s1.length(); i++){
				//System.out.print(s1map.get(s1.charAt(i) + "   "));
				System.out.println(s2map.get(s2.charAt(i)));
				if(s1map.get(s1.charAt(i))!= s2map.get(s2.charAt(i)))
					return false;
			}
			

		return true;

}

	public static void main(String[] args){

		Isomorphic obj=new Isomorphic();

		String string1= "eggsin";

		String string2= "abbtsd";

		System.out.print(obj.isIsomorphic(string1, string2));

	}

}
