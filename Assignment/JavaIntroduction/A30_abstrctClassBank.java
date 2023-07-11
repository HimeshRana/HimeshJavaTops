package com.assigment;
//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

abstract class bank{
	abstract int getBalance();
}

class bankA extends bank{
	private int balance;
	
	public bankA() {
		balance = 100;
	}

	@Override
	public int getBalance() {
		return balance;
		
	}
	
}

class bankB extends bank{
	
	private int balance;
	
	public bankB() {
		balance = 150;
	}

	
	int getBalance() {
		return balance;
	}
	
}

class bankC extends bank{
	private int balance;
	
	public bankC() {
		balance = 200;
	}

	
	int getBalance() {
		
		return balance;
	}
	
}
public class A30_abstrctClassBank {
	public static void main(String[] args) {
		
		bankA obj = new bankA();
		bankB obj1 = new bankB();
		bankC obj2 = new bankC();
		
		System.out.println("Bank A balance :$"+obj.getBalance());
		System.out.println("Bank B balance :$"+obj1.getBalance());
		System.out.println("Bank C balance :$"+obj2.getBalance());
		
	}

}
