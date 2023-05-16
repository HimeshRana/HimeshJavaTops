package com.core_java;
/*
 * Array : It is a name at memory location, which stores multiple values of same type.
 * 
 * 
 */

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {

		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {

			System.out.println("[" + (i + 1) + "]");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Before Sorting Array");
		for (int i = 0; i < a.length; i++) {
			System.out.println("["+(i+1)+"] : "+a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int t = a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
					
			}
		}
		
		System.out.println("Array in Assending order");
		for (int i = 0; i < a.length; i++) {
			System.out.println("element ["+(i+1)+"] = "+a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Array in Desending order");
		for (int i = 0; i < a.length; i++) {
			System.out.println("element ["+(i+1)+"] = "+a[i]);
	}

}
}
