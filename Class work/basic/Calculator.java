package com._11april;

import java.util.Scanner;

/*
 * Datatypes : 
 * 
 * There are 2 Datatypes
 * 
 * 1) Primitive Datatype
 * 
 * data-type			size 			class
 * 
 * short
 * 
 * 2) Non-Primitive Datatype or Reference Types
 * 
 * 
 * Variable : It is a name at memory location, which stores value of different types.
 * 
 * Naming Convention for variable:
 * 
 * 1) First Charcter cannot be a digit.  e.g  illegal : int 1a; legal : int a1;
 * 
 * 2) No space between the variable name. e.g illegal : String first name; legal : String firstname
 * 
 * 3) No Special charcater is allowed.  except:  _ $
 * 
 * 4) Variable name is case sensitive.  
 * 
 *  - a is different and A is different.
 *  - Because it follows the ascii (American Standard Code for Information Interchange)  rule
 * 
 */

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a :");
		int a = sc.nextInt();
		System.out.print("Enter value of b :");
		int b = sc.nextInt();
		
		System.out.println("Addition of two number :"+(a+b));
		System.out.println("Substraction of two number :"+(a-b));
		System.out.println("Multiplication of two number :"+(a*b));
		System.out.println("Division of two number :"+((float)a/b));
	}

}
