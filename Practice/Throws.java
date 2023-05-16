package com.exception;

import java.util.Scanner;

/*
 * throws : it is a keyword, which is used under Checked Exception.
 * 
 * - throws works with the method signature.
 * 
 * e.g void show() throws Exception
 * 	  {
 * 			//statement
 * 	  }
 * 
 * - throws is an alternative of try/catch
 * 
 * - where there is throws you cannot use try/catch block inside that method.
 * 
 * 
 */
public class Throws {
	
	public static void demo () throws Exception {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X :");
		x = sc.nextInt();
		
		
		
			if(x>0)
			{
				System.out.println("Square of X :"+(x*x));
			
			}
			else {
				throw new Exception("Please enter +ve value.");
			}
	}
public static void main(String[] args) {
	boolean f = false;
	
	while (!f) {
	try {
		demo();
		f = true;
		}
	 catch (Exception e) {
		System.out.println(e);
	}
	
	}
}
}
