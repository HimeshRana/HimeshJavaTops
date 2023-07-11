package com.assigment;
/*
 * Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 */
import java.util.Scanner;

public class A2_vowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the character :");
		String input = sc.nextLine();

		if (input.length() != 1) {
			System.out.println("Please enter a single character");
		} else {
			char ch = input.charAt(0);
			if (!Character.isLetter(ch)) {
				System.out.println("Please enter a letter");
			} else {
				switch (ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("vowels....!!");

					break;

				default:
					System.out.println("consonant...!!");
					break;
				}
			}
		}

	}
}