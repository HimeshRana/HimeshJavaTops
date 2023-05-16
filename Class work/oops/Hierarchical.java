package com.oops;

import java.util.Scanner;

class side {
	protected int l;
	Scanner sc = new Scanner(System.in);
	
	void getl(int l) {
		this.l=l;
//		System.out.println("enter value of l :");
//		l = sc.nextInt();
	}
}
class Square extends side {
	
	int sqr() {
		return l*l;
	}
}

class Cube extends side{
	int cube() {
		return (l*l*l);
	}
}

public class Hierarchical {
public static void main(String[] args) {
	
	
	Square s = new Square();
//	s.getl();
	s.getl(5);	
	System.out.println("Square is :"+s.sqr());
	
	Cube c = new Cube();
	
//	c.getl();
	c.getl(7);
	System.out.println("Cube is :"+c.cube());
}
}
