package com.assigment;

import java.util.Iterator;
import java.util.Scanner;

public class A4_5NumberSumAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =5;
		float num,sum=0;
		for (int i = 1; i <=n ; i++) {
			System.out.print("enter number :");
			num = sc.nextFloat();
		    sum = sum+num;
		}
		float avg = (sum)/n;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
	}
}
