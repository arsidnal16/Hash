package HashMap;

import java.util.Arrays;

public class CountPrimes {

	public static void main(String[] args) {
		int k =100;
		int n = countPrimes(k);
		System.out.println(n);

	}

	private static int countPrimes(int k) {
		
		boolean[] primes = new boolean[k];
		
		for(int i= 2; i<k; i++){
			primes[i] = true;
		}
			for(int i=2;i<= Math.sqrt(k-1); i++){
				if(primes[i]){ //Checking so we dont do the same work again on the number.
					for(int j = i+i ; j< k ; j+=i){
						primes[j]= false;
					}
				}
			}
		int count =0;
		
		for(int i=0; i< primes.length;i++){
			System.out.println(primes[i]);
			if(primes[i] ==  true)
				count++;
		}
		return count;
	}

}
