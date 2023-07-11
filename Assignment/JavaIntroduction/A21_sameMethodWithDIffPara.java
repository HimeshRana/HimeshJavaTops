package com.assigment;
//Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type.

class PrintNumber{
	
	public int printn(int d) {
		System.out.println(d);
		return d;
	}
	public void printn(float y) {
		System.out.println(y);
	}
	public void printn(int a,float b,char c) {
		System.out.println(a+" "+b+" "+c);
	}
	public void printn(int x,float y,char c,double d) {
		System.out.println(x+" "+y+" "+c+" "+d);
	}
}
public class A21_sameMethodWithDIffPara {
public static void main(String[] args) {
	PrintNumber pn = new PrintNumber();
	pn.printn(5);
	pn.printn(2.5f);
	pn.printn(0, 2.5f, 'h');
	pn.printn(5, 2.5f, 'h', 2.556);
}
}
