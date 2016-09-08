package HashMap;

import java.util.HashMap;

public class BullsAndCows {

	public static void main(String[] args) {
		String s = "1123";
		String g = "0111";
		
		String res = bullsAndCows(s,g);
		System.out.println(res);
	}

	private static String bullsAndCows(String secret, String guess) {
		 int countBull=0;
		    int countCow=0;
		 
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 
		    //check bull
		    for(int i=0; i<secret.length(); i++){
		        char c1 = secret.charAt(i);
		        char c2 = guess.charAt(i);
		 
		        if(c1==c2){
		            countBull++;
		        }else{
		            if(map.containsKey(c1)){
		               
		                map.put(c1,map.get(c1)+1);
		            }else{
		                map.put(c1, 1);
		            }
		        }
		 
		        if(c1!=c2){
		            if(map.containsKey(c2)){
		                countCow++;
		                if(map.get(c2)==1){
		                    map.remove(c2);
		                }else{
		                    int freq = map.get(c2);
		                    freq--;
		                    map.put(c2, freq);
		                }
		            }
		        } 
		    }
		 
		    return countBull+"A"+countCow+"B";
	}

}
