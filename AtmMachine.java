package com.atm;

public class AtmMachine {
	public void withdraw(UserAccount userAccount, int withdrawAmount) {
		int currentBalance;
		if (userAccount.getBalance()<withdrawAmount) {
			System.out.println("Your account balance is very low, hence withdrawel not possible!");
		} else {
			currentBalance = userAccount.getBalance();
			userAccount.setBalance(currentBalance-withdrawAmount);
			System.out.println("Amount withdrawal successful");
		}
	}
	
	public void deposit(UserAccount userAccount, int depositAmount) {
		int currentBalance;
		currentBalance = userAccount.getBalance();
		userAccount.setBalance(currentBalance+depositAmount);
	}
	
	public int checkBalance(UserAccount userAccount) {
		return userAccount.getBalance();
	}

	
	public void displayUI() {
		this.printStars();
		System.out.println("ATM MACHINE");
		this.printStars();
		System.out.println("1.\tCreate Account\n2.\tCheck Balance\n3.\tWithdraw Amount\n4.\tDeposit Amount\n5.\tExit Console");
		this.printStars();
		System.out.println("\nEnter Your Option:");
	}
	public void printStars() {
		System.out.println("************************************");
	}
}
