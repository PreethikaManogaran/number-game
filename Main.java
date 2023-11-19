package com.atm;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int option;
		boolean exitFlag = false;
		Scanner scan = new Scanner(System.in);
		AtmMachine atmMachine = new AtmMachine();
		UserAccount user = null;
		while(!exitFlag) {
			atmMachine.displayUI();
			option = scan.nextInt();
			switch(option) {
				case 1:
					user = new UserAccount();
					System.out.println("Enter your name : ");
					user.setUserName(scan.next());
					System.out.println("Enter your account number : ");
					user.setAccountNumber(scan.nextInt());
					System.out.println("Enter your balance : ");
					user.setBalance(scan.nextInt());
					System.out.println("Account creation success for "+user.getUserName()+"!");
					break;
				
				case 2:
					if (user!=null) {
						int balance = atmMachine.checkBalance(user);
						atmMachine.printStars();
						System.out.println("Your Current Account Balance : Rs. "+balance+"/-");
						atmMachine.printStars();
					} else {
						System.out.println("Please create a bank account to proceed with options 2, 3 and 4.");
					}
					break;
					
				case 3:
					if (user!=null) {
						int withdrawAmount;
						atmMachine.printStars();
						System.out.println("Enter amount to withdraw : ");
						withdrawAmount = scan.nextInt();
						atmMachine.withdraw(user, withdrawAmount);
						atmMachine.printStars();
					} else {
						System.out.println("Please create a bank account to proceed with options 2, 3 and 4.");
					}
					break;
				
				case 4:
					if (user!=null) {
						int depositAmount;
						atmMachine.printStars();
						System.out.println("Enter Amount for deposit : ");
						depositAmount = scan.nextInt();
						atmMachine.deposit(user, depositAmount);
						System.out.println("Amount deposit successful!");
						atmMachine.printStars();
					} else {
						System.out.println("Please create a bank account to proceed with options 2, 3 and 4.");
					}
					break;
				
				case 5:
					exitFlag=true;
					break;
					
				default:
					System.out.println("Invalid option");
			}	
		}
		System.out.println("TataByeeee!");
	}
	
	
	
	
}
