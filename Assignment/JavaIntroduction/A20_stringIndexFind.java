package com.assigment;

import java.util.Scanner;
//W.A.J.P to find the second most frequent character in a given string. The given string is: successes The second most frequent char in the string is: c
public class A20_stringIndexFind {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String:");
	String s = sc.nextLine();
	System.out.println("The given string is:"+s);
	System.out.println("Enter index :");
	int a = sc.nextInt();
	System.out.println("The second most frequent char in the string is :"+s.charAt(a));
	
}
}
