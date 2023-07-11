package com.assigment;
//W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false

import java.util.Scanner;

public class A16_stringCompare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string : ");
	String s1 = sc.nextLine();
	System.out.println("Enter second string : ");
	String s2 = sc.nextLine();
	
	if (s1.equals(s2)) {
		System.out.println("String -"+s1+"- and -"+s2+"- are :true");
	}
	else {
		System.out.println("String -"+s1+"- and -"+s2+"- are :false");
	}
	
}
}
