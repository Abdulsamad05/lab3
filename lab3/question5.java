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
 
     int c;  
        int f;   
       
       
            System.out.println("pick a number for c: " +c);
         System.out.println("pick a number for f: " +f);
          c = s.nextInt();
         f= s.nextInt();
if ('c'<=0){
    System.out.println("this is frozen");
}
else if('c'<=99){
    System.out.println("this is liquid");
    }
      else if ('c'==100){
          System.out.println("this is gas");
          
}
else {
System.out.println("this is an error");
}
if ('f'<=32){
    System.out.println("this is frozen");
}
else if('f'<=125){
    System.out.println("this is liquid");
    }
      else if ('f'==200){
          System.out.println("this is gas");
          
}
else {
System.out.println("this is an error");
}
       
       
	}
}
