package com.oops;

class First{
	int a,b,sum_no,sub_no;
	
	public void setData() {
		a=85;
		b=15;
	}
	public void sum() {
		sum_no = a+b;
	}
	public void sub() {
		sub_no=a-b;
	}
	public void show() {
		System.out.println("sum is ..."+sum_no);
		System.out.println("sub is ..."+sub_no);
		
	}
}
public class ClassDemo2 {
public static void main(String[] args) {
	
	First f1 = new First();
	
	f1.setData();
	f1.sum();
	f1.sub();
	f1.show();
	
}
}
