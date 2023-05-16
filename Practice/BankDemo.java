package com.exception;

import java.util.Scanner;

/*
 * Custom Exceptions : To create a user-defined exception, you need to extends the Exception class.
 * 
 * 
 */

class InsufficientFunds extends Exception{
	double amount;

	public InsufficientFunds(double amount) {
		this.amount = amount;
	}
	
	double getAmount() {
		return this.amount;
	}
}
class checkingAccount {
	
	long accno;
	double balance=5000;

	public checkingAccount(long accno) {
		this.accno = accno;
		System.out.println("Account number :"+this.accno);
	}
	
	void deposite(double amt) {
		this.balance = this.balance+amt;
	}
	
	void withdraw(double amt) throws InsufficientFunds{
		
		if(amt<=this.balance)
		{
			this.balance = this.balance-amt;
		}
		else {
			double needs = amt - this.balance;
			throw new InsufficientFunds(needs);
		}
		
	}
	
	void checkBalance() {
		System.out.println("Current balance :"+this.balance);
	}
	
}
	

public class BankDemo {
public static void main(String[] args) {
	
    final String USER_NAME = "Himesh";
	final String USER_PASSWORD = "123456";
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter user name :");
	String user_name = sc.next();
	System.out.print("Enter password:");
	String user_password = sc.next();
	
	if(user_name.equals(USER_NAME) && user_password.equals(USER_PASSWORD)) 
	{
		
	System.out.println("1.Check balance\n2.Deposite\n3.withdraw");
	System.out.println("Enter your choice :");
	int choice = sc.nextInt();
	checkingAccount ca = new checkingAccount(113355779900l);
	 switch (choice) {
	case 1:
		ca.checkBalance();
		break;
	case 2:
		System.out.print("Enter deposite amount :");
		double amt = sc.nextDouble();
		ca.deposite(amt);
		ca.checkBalance();
		break;
		
	case 3:
		try {
			System.out.print("Enter WithDraw amount :");
			amt = sc.nextDouble();
			ca.withdraw(amt);
			ca.checkBalance();
			System.out.println("Your withdraw is sucssefully done");
		} catch (InsufficientFunds e) {
			System.out.println("Sorry you need rs. "+e.getAmount()+" to withdraw");
		}
		break;

	default:
		System.out.println("Invalid input");
		break;
	}
	}
	else {
		System.out.println("Username or Password are incorrect. Try again!!");
	}
	
}
}
