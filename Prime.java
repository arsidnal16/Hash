package src.interview;

import java.util.ArrayList;

public class Prime {
	
	public static void main(String args[]){
		
		/*ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		for (int i=1;primeNumbers.size()<10001;i++){
			if (isPrime(i)){
				primeNumbers.add(i);
			}
			else{
				continue;
			}
		}
		
		System.out.println("The 10001st prime number is "+primeNumbers.get(10000));
	}
	static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}*/
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for(int i = 2; primeNumbers.size() < 10001; i++) {
		    boolean divisible = false;

		    for(int number : primeNumbers) {
		    	if(number > Math.sqrt(i)){
		    		break;
		    	}
		        if(i % number == 0) {
		            divisible = true;
		            break;
		        }
		    	
		    }

		    if(divisible == false) {
		        primeNumbers.add(i);
		        System.out.println(i+"");
		    }
		}
		
		//System.out.println("The 10001st prime number is "+primeNumbers.get(10000));
}
}