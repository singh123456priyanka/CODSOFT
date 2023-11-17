package assignment;

import java.util.Scanner;

public class ATMmachine implements ATM1    {
	public static double bal;
	double money;

	public static void main(String[] args) {
		ATMmachine atm=new ATMmachine();

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter correct pin: ");
		int pin = sc.nextInt();
		
		if(name.equalsIgnoreCase("Priyanka") && pin==1111) {		
			UserAccount acc=new UserAccount("Priyanka",1111);
			bal=acc.getbal();			
			Scanner sca=new Scanner(System.in);	
			while(true) {
				System.out.println("=====================================");
				System.out.println();
				atm.menu();	
				System.out.println("=====================================");

				System.out.println("Enter your choice to choose option:");
				int ch = sc.nextInt();
				atm.transaction(ch);
				System.out.println("\nDo you want to continue transaction? ");
				char want = sca.next().charAt(0);
				if(want=='y'||want=='Y') {
					continue;
					
				}
				else {
					System.out.println("Thankyou!! See You Again.");
					break;
					}

				}
			System.out.println();

			}
			
		
		else {
			System.out.println("Not Valid Account!!");
		}
	}
		

		
	public void menu() {		
		Scanner sc=new Scanner(System.in);
		System.out.println();		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check balance");
		System.out.println("4. Exit");

		System.out.println();		
		}
	
	public void transaction(int choice) {
			Scanner sc= new Scanner(System.in);
			switch(choice) {
			case 1: System.out.println("---Deposit---");
			System.out.println("Enter the amount: ");
			money = sc.nextDouble();
			deposit(money);
			break;
			
			case 2: System.out.println("---Withdraw---");
			System.out.println("Enter the amount: ");
			money = sc.nextDouble();
			withdraw(money);break;
			
			case 3: System.out.println("---Check balance---");
			checkBalance();
			break;
			
			case 4:	System.out.println("---Exit---");
			exit();
			break;
			
			default: System.out.println("---Invalid Choice---");
			break;
			 }
			

	}

	@Override
	public void withdraw(double amount) {
		if(bal>amount)
		{
			bal=bal-amount;
		System.out.println("Your new balance is Rs "+bal);}
		else {
			System.out.println("Sorry !!Transaction is not possible, You dont have enough balance.");
		}

	}

	@Override
	public void deposit(double amount) {
		
		bal=bal+amount;
		System.out.println("Your new balance is Rs "+bal);
	}

	@Override
	public void checkBalance() {
		System.out.println("Your balance is Rs "+bal);
	
	}
	public void exit() {
		System.out.println("--You have Successfully logged out!!--");
		

	}


}
