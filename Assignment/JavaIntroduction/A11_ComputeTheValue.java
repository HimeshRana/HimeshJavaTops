package com.assigment;

import java.util.Scanner;

//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5
public class A11_ComputeTheValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number :");
	String n = sc.nextLine();
	
	if(n.matches("[0-9]+")) {
		System.out.println(n+"+"+n+n+"+"+n+n+n);
	}else {
		System.out.println("Invalid input");
	}
}
}
