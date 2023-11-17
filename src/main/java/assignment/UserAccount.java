package assignment;

import java.util.Scanner;

public class UserAccount{
	
	private String custname;
	private int custpin;
	private double bal;

		public UserAccount(String name, int pin) {
		this.custname=name;
		this.custpin=pin;
		if(this.custname=="Priyanka" && this.custpin==1111) {
			System.out.println("\n\t--Succesfully Logged in--!!");
			System.out.println("\nYour Current Balance is Rs "+getbal());
		}
		else {
			System.out.println("Invalid Login!!");
		}
		}
		
		public double getbal() {
			this.bal=700000;
			return bal;
		}	


	
	
	
}