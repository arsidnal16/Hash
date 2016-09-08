package src.interview;

import java.io.*;
import java.util.Scanner;
public class NameSearch
{
	
	public static String names[]={"harry","michael","will","tom","jackie"};    
        public static String surnames[]={"potter","jackson","smith","cruise","chan"}; 
         static String a1;
         static String name; 
public static void main(String a[]) throws Exception
	{
        Scanner sc=new Scanner(System.in);
        //String name;   
        
      
         System.out.println("Enter the name:");
          name=sc.next();
    for(int i = 0; i< names.length;i++){
        
        
       if (name.equals(names[i])){
          // System.out.println("hi");
           a1 = names[i] + " "+ surnames[i];
       }
    }
       
          
          
System.out.println("Full name of the celebraty is:" );
	/*write down your logic*/
	  System.out.println(a1);
        }//main 







	 
}  