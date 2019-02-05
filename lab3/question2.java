/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

	  int die1;  
        int die2;   
        int roll;  
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);
        if (die1>die2){
            System.out.println("die2 is greater than die2");
        }
        else if (die1<die2){
            System.out.println("die1  is less than  die2");
        }
       
	}
}
