package com.assigment;

class intAndChar{
	void print(int a, char c) {
		System.out.println(a+" "+c);
	}
	void print(char c, int a) {
		System.out.println(c+" "+a);
	}
}
public class A22_diffParaSequence {
public static void main(String[] args) {
	intAndChar ic = new intAndChar();
	
	ic.print(27, 'h');
	ic.print('r', 9);
}
}
