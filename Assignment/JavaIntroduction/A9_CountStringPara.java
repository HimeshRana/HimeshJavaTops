package com.assigment;

import java.util.Scanner;

public class A9_CountStringPara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String input = sc.nextLine();
		
		int letters=0,space=0,number=0,others=0;
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(Character.isLetter(c)) {
				letters++;
			}else if(Character.isDigit(c)){
				number++;
			}else if (Character.isWhitespace(c)) {
				space++;
			}else {
				others++;
			}
		}
		System.out.println("Letters :"+letters);
		System.out.println("Number :"+number);
		System.out.println("Space :"+space);
		System.out.println("Others :"+others);
	}

}
