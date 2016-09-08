package src.interview;

import java.util.ArrayList;
import java.util.Calendar;

public class LabatonSucharow {
	
	public static void main(String args[]){
		
		Calendar start = Calendar.getInstance(); 
		calculatesum();
		Calendar end = Calendar.getInstance(); 
		System.out.println("Time taken to solve: "+(end.getTimeInMillis() - start.getTimeInMillis()) +" ms");
	}

	private static void calculatesum() {
		
		ArrayList<Integer> list = new ArrayList<>();
		int result =0;
		int pen;
		for(int x=1; x<1_000_000;x++){
			if(x % 117 == 0 && x%42 == 0){
				
					//System.out.println(x);
					if(x%10==2 || x% 10==8){
						//System.out.println("Stage 2 "+x);
						
							 pen = x/10;
							if(pen % 10 ==3 || pen %10 ==5 || pen% 10 ==9){
					        System.out.println(x);
					        result = result+ x;
							}
					
				}
			}
			continue;
		}
		System.out.println("Result "+result);
		
	}

}
