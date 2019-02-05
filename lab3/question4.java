/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
 
     int num; 
    
     
        
       
        num = s.nextInt();
            System.out.println("enter your score" +num);
     
       
        
if (num<40){
    System.out.println("you have failed ");
}
else if(num>=40){
    System.out.println("this is a pass");
    }
      else if (num>=75){
          System.out.println("distinction");

      }
      
     
          
    
       
	}
}
