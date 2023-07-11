package com.assigment;

import java.util.Scanner;

//W.A.J. P to demonstrate try catch block, Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0 Exception in thread main java.lang.ArithmeticException:/ by zero

class arithmetic {
	public void div() {
		double division;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		division = (a/b);
		System.out.println("Two number division :"+division);
	}
}

public class A36_tryCatchArithmethic {
public static void main(String[] args) {
	arithmetic obj = new arithmetic();
	try {
		obj.div();
	} catch (ArithmeticException
			e) {
	   System.out.println("Caught ArithmeticException: Cannot divide by zero.");
	}
	
}
}
