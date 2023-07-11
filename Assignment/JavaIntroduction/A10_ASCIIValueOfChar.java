package com.assigment;

import java.util.Scanner;

public class A10_ASCIIValueOfChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a character for its ASCII value :");
	char c = sc.next().charAt(0);
	
	int ascii = (int) c;
	
	System.out.println("The ASCII value of "+c+" given Character is :"+ascii);
}
}
