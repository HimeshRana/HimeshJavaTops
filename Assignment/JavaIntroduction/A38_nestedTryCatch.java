package com.assigment;
/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}
}
*/

import java.util.Scanner;

public class A38_nestedTryCatch {
	public static void main(String[] args) {
		try {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter A :");
				int a = sc.nextInt();
				System.out.println("Enter B :");
				int b = sc.nextInt();
				float div = a / b;
				System.out.println("Division :" + div);
			} catch (ArithmeticException e) {
				System.out.println("Caught ArithmeticException: Cannot divide by zero.");
			}
			try {
				int array[]=new int[2];
				System.out.println(array[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught ArrayIndexOutOfBoundsException: Array index is out of bounds.");
			}
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
