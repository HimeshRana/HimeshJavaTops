package com.assigment;

import java.util.Scanner;

//W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! The character at position 0 is T, The character at position 10 is o

public class A14_stringPosition {
public static void main(String[] args) {
	String s1 = new String("Tops Technologies!");
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter required index value :");
	int a = sc.nextInt();
	System.out.println("String charAt():"+s1.charAt(a));
}
}
