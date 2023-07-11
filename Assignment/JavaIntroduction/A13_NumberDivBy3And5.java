package com.assigment;

public class A13_NumberDivBy3And5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " is divisible by 3 and 5 both.");
			}
		}System.out.println("--------------------------------");
		for (int j = 1; j <= 100; j++) {
			if (j % 3 == 0) {
				System.out.println(j + " is divisible by 3.");
			}
		}System.out.println("-------------------");
		for (int k = 1; k <= 100; k++) {
			if (k % 5 == 0) {
				System.out.println(k + " is divisible by 5.");
			}
		}
	}
}
