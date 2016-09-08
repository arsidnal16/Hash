package bitmanipulation;

import java.util.*;
public class DecimalBinaryStack
{
  public static void main(String[] args) 
  { 
    // Create Stack object
    //Stack<Integer> stack = new Stack<Integer>();
 
    // User input 
    System.out.println("Enter decimal number: ");
    int num = new Scanner(System.in).nextInt();
    String s = "";
    
    
    while (num != 0)
    {
      int d = num % 2;
    // stack.push(d);
      
      s = d + s;
      num /= 2;
    } 
 
    System.out.print("\nBinary representation is:" +s);
 //   while (!(stack.isEmpty() ))
   // {
     // System.out.print(stack.pop());
   // }
    System.out.println();
  }
}