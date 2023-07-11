package com.assigment;
/*
 * Java program to Take three numbers from the user and print the greatest number.
 */
import java.util.Scanner;

public class A1_GreatestOfThreeNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter first number a :");
		int a = sc.nextInt();
		System.out.print("enter second number b :");
		int b = sc.nextInt();
		System.out.print("enter third number c :");
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("a :"+a+" is graeter");
		}
		else if (b>a && b>c) {
			System.out.println("b :"+b+" is graeter");
		}
		else {
			System.out.println("c :"+c+" is graeter");
		}
		}
		
	}


