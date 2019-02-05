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
     int count = 0 ;
     
        
       
        num = s.nextInt();
            System.out.println("write an integer " +num);
     
       
        
if (num<0){
    System.out.println("this is negative ");
}
else if(num==0){
    System.out.println("this is zero");
    }
      else if (num==100){
          System.out.println("this is positve");
          
}
if (num<0){
    System.out.println("this is negative ");
}
else if(num==0){
    System.out.println("this is zero");
    }
    
      
       else if (num<0){
          System.out.println(" small");
      }
       else if(num>=1000000){
          System.out.println(" large");
      }
       while(num!=0){
         num = num/10;
         count++;
       }
      System.out.println("Number of digits in the entered integer are :: "+count);
  
          
    
       
	}
}
