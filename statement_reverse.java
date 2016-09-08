package src.interview;

import java.io.*;
import java.util.Scanner;
public class statement_reverse
{
	public static void main(String a[]) throws Exception
	{
	   
        String st;      //contains user input statement 
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Statement:"); 
         st=br.readLine();


      
 
		// split to words by space
		String[] arr = st.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		
   /*write down your logic here*/ 
            System.out.println("The reverse is:"+ sb);
 	 
        } 
	 
}  
   
