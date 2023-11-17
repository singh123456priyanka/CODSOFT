package assignment;

import java.util.Random;
import java.util.Scanner;
/*
 * 
 TASK 1
1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
   is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.

6. Add the option for multiple rounds, allowing the user to play again.

7. Display the user's score, which can be based on the number of attempts taken or rounds won.
 * 
 */
public class GenetrateRandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		
		int low = 1;
		int high = 100;
		int ran = r.nextInt(high-low) + low;
		//System.out.println("Random Number => "+ran);
		int ch=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n\t>>Welcome To Guessing Right Number Game <<");
		System.out.println("::You have got 5 chances to guess the right number::\n");
		System.out.println("Enter you guess for the random right number ");
		int round=0;
		char choice='y';
		int scr= 0,newran=0,l=100-ran,ri=0;
		
		while(choice=='y'||choice=='Y') 
		{
			round++;
			System.out.println("All the best!!");

		while(ch!=5) {
			ch++;
		System.out.println("Chance no "+ch+" :");	
		int in = sc.nextInt();
		ri=100-in;
		if(ran==in) {
			System.out.println("\n>>You Win!!<<");
			System.out.println(">>Congratulations!!You Have Guessed Right Number <<"+ran);
			scr++;
			break;
		}
		else if(ran<in){
			System.out.println("Wrong Guess !!");
			if(ran<(in-10)) {
			System.out.println("Guessed Number is too High");
			}
			else if(ri-l<=5){
				System.out.println("Too close");
				System.out.println("HINT::Below of "+in+" in range of 5 numbers::");
			}
			
		}
		else if(ran>in) {
			System.out.println("Wrong Guess!!");
			if(ran>(in+10)) {
			System.out.println("Guessed Number is too Low");
			}
			else if(ri-l<=5){
				System.out.println("Too close ");
				System.out.println("HINT::Above of "+in+" in range of 5 numbers::");
			}

		}
		System.out.println();
	}
		System.out.println("Computer Generated Random number was: "+ran);
		System.out.println("\n\tRound: "+round+" Score: "+scr+"\n");
		newran = r.nextInt(high-low) + low;
		
		if(ch==5&&scr==0) {
			System.out.println("\nYou Loose !!");
			
		}
		ch=0;
		System.out.println("\nDo you want to play more? :");
		choice=sc.next().charAt(0);
		ran=newran;
		System.out.println();
		//System.out.println(ran);

}	
	System.out.println("----------------------------------------------");
	System.out.println("Thankyou for playing!!");	
	System.out.println("Total Round Played: "+round+"  ,Total Score: "+scr);
	System.out.println("----------------------------------------------");
	
	}

}
