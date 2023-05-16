package com._11april;

/*
 * Conditional Statements: 
 * 
 * 1) Simple if
 * 2) if/else
 * 3) nested if/else
 * 4) ladder if/else
 * 5) switch statement
 * 
 * 1) Simple if :
 * 
 * 	syntax : if(condition)
 * 			 {
 * 				//statement
 * 			 }
 * 
 * 		-condition is a boolean value i.e true/false
 * 
 * 	
 * 2) Nested if/else
 * 
 * syntax : if(condition)
 * 			{
 * 				if(condition)
 * 				{
 * 					//statement
 * 				}
 * 				else
 * 				{
 * 					//statement
 * 				}
 * 
 * 			}
 * 			else
 * 			{
 * 				if(condition)
 * 				{
 * 					//statement
 * 				}
 * 				else
 * 				{
 * 					//statement
 * 				}
 * 			}
 * 
 * 4) ladder if/else :
 * 
 * 	syntax :  if(condition)
 * 			  {
 * 					statement
 * 			  }
 * 			  else if(condition)
 * 			  {
 * 					statement
 * 			  }
 * 			  else if(condition)
 * 			  {
 * 					statement
 * 			  }
 * 			  else
 * 			  {
 * 					statement
 * 			  }
 * 
 * 
 */

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a :");
		int a = sc.nextInt();
		System.out.print("Enter b :");
		int b = sc.nextInt();
		System.out.print("Enter c :");
		int c = sc.nextInt();

		System.out.println("a = " + a + "; b = " + b + "; c = " + c);

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is Greater!!!");
			} else {
				System.out.println(c + " is Greater!!!");
			}
		} else {
			if (b > c) {
				System.out.println(b + " is Greater!!!");
			} else {
				System.out.println(c + " is Greater!!!");
			}
		}

	}
}
