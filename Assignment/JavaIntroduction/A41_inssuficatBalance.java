package com.assigment;

import java.util.Scanner;

import com.keyword.thisdemo;

//W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500 Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.

class insufficientFunds extends Exception{
	
	double amount;
	
	public insufficientFunds(double amount) {
		this.amount = amount;
	}
	
	double getAmount() {
		return this.amount;
	}	
}
	
class checkingAccount{
	long accono;
	double balance;
	
	public checkingAccount(long accono) {
		this.accono = accono;
		System.out.println("Account number :"+accono);
	}
	
	void deposite (double amt) {
		
		this.balance = this.balance+amt;
	}
	
	void withdraw (double amt) throws insufficientFunds {
		
		if(amt<= this.balance) {
			this.balance = this.balance-amt;
		}
		else {
			double needs = amt-this.balance;
			throw new insufficientFunds(needs);
		}
	}
	void checkBalance()
	{
		System.out.println("Current Balance : "+this.balance);
	}
}
public class A41_inssuficatBalance {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter account no :");
	long accono = sc.nextLong();
	checkingAccount ca = new checkingAccount(accono);
	ca.checkBalance();
	
	//deposite
	
	System.out.println("Enter amount for deposite :");
	double amt = sc.nextDouble();
	ca.deposite(amt);
	ca.checkBalance();
	
	//withdraw
	
	try {
		System.out.println("Enter the withdraw amout :");
		amt = sc.nextDouble();
		ca.withdraw(amt);
		ca.checkBalance();
		System.out.println("Withdraw succesfully");
		
	} catch (insufficientFunds e) {
		System.out.println("Sorry, insufficient balance, you need more "+e.getAmount()+" Rs. To perform this transaction");
		
	}
	
			
}
}
