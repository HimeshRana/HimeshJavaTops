package com.assigment;

import java.util.Scanner;

/*
 * Write a program in java to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. *(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0
 */

class factorial {
	public int fact(int n) {
		int result=1;
		if (n==0 || n==1) {
			return 1;
		}else {
			for (int i = 2; i <=n; i++) {
				result = result*i;
			}
		}
		return result;
	}
}
public class A32_factorialNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the factorial number :");
	int num = sc.nextInt();
	factorial obj = new factorial();
	System.out.println("Factorial of "+num+"! is:"+obj.fact(num));
}
}
