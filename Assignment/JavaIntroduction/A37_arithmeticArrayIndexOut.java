package com.assigment;

import java.util.Scanner;

//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and another one is to handle ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;

public class A37_arithmeticArrayIndexOut {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A :");
		int a = sc.nextInt();
		System.out.println("Enter B :");
		int b = sc.nextInt();
		float div = a/b;
		System.out.println("Division :"+div);
		
		int array[]=new int[2];
		System.out.println(array[3]);
	} catch (ArithmeticException e) {
		System.out.println("Caught ArithmeticException: Cannot divide by zero.");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Caught ArrayIndexOutOfBoundsException: Array index is out of bounds.");
	}
}
}
