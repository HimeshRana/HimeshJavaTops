package com.assigment;

import java.util.Scanner;

public class A8_NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		int count=0;
		if(num >0) {
		while(num >0) {
			num=num/10;
			count++;
		}
		System.out.println("The number of digit in integer is  : "+count);
		}else {
			System.out.println("Please enter positive number.");
		}
		}
	}

