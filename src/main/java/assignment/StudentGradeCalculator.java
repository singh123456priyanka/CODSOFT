package assignment;

import java.util.Scanner;

/*
 * 
Task-2

1-Input: Take marks obtained (out of 100) in each subject.

2-Calculate Total Marks: Sum up the marks obtained in all subjects.

3-Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
  average percentage.
  
4-Grade Calculation: Assign grades based on the average percentage achieved.

5-Display Results: Show the total marks, average percentage, and the corresponding grade to the user
 * 
 */

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		float sum=0;
		System.out.println("\n\t>>Welcome to Student Grade Calculator<<");
		
		
		System.out.println("Enter Student Name : ");
		String nam = sc.next();
		System.out.println("\n::Total subject are 6::");
		String[] sub= {"English","Maths","Hindi","Science","History", "Kannada"};
		float[] scr= new float[6];
		System.out.println("\nEnter the marks obtained in subjects out of 100:: ");
		
		for(int i=0;i<6;i++) {
			System.out.println(sub[i]+":");
			scr[i]=sc.nextFloat();
			if(scr[i]>100||scr[i]<0) {
				System.out.println("Invalid Number!! Check and Enter the number Again\n");
				i--;
				continue;
			}
			sum=sum+scr[i];
			System.out.println();
		}
		float avgper= sum/6;
		char gr='\0';
		String com="";
		
		 if(avgper>=70) {
			 gr='A';
			 com="Excellent Work!!Keep it up!!";}
		 else if(avgper<70 && avgper>=60) {
			 gr='B';
			 com="Good work!You can do much better,just put little bit more hard work.";
		 	}
		 else if(avgper<60 && avgper>=50) {
			 gr='C';
			 com="Work harder Next Time!!Need to Improve.";}
		 else {
			 gr='F';
			 com="Work Hard!!You need to focus on your studies. ";}

		
		
		System.out.println();
		System.out.println("===========================================");
		System.out.println("Name: "+nam);
		System.out.println("Class: IV ");
		System.out.println();
		System.out.println("Marks Obtained: ");
		for(int i=0;i<6;i++) {
			System.out.println(sub[i]+"  "+scr[i]);
		}
		System.out.println("\nTotal Sum: "+sum+"	,Out of Total Marks: 600 ");
		System.out.println("Percentage: "+avgper+"% 	,Grade: "+gr);
		
		System.out.println("\n\nComment: "+com);


		System.out.println("===========================================");

		
	}

}
