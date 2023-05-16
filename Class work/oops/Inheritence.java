package com.oops;

import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxExpr.ColumnIdentifier;

/*
 * OOP : Object Oriented Programming Language.
 * 
 * - It is a Software Development Programming Model.
 * 
 *  - It contains Four important pillars/features 
 *  
 *  1) Encapsulation
 *  
 *  - It is wrapping up of a data into the single unit like a Class is called Encapsulatoion.
 *  
 *  e.g Capsule
 *  
 *  2) Inheritance 
 *  3) Polymorphism
 *  4) Data Abstraction
 *  
 * Inheritance : It is acquiring the properties of base-class(parent-class) into the
 * 				 derived-class (child-class)
 * 
 * 				-it provides is-a relationship e.g Apple is-a fruit
 * 
 * 
 * simple and practical def: It is creating a new class from an already existing class
 *  						 is called inheritance.
 *  
 *  
 *  - In Inheritance, the object will always be created of Derived Class/child class.
 *  - It provides the feature of Code Reusability
 *  - To use inheritance we make use of extends keyword.
 * 
 * Types of Inheritance : 
 * 
 * 1) Single-level Inheritance
 * 2) Multi-level Inheritance
 * 3) Multiple -level Inheritance
 * 4) Hierarchical -level Inheritance
 * 5) Hybrid-level Inheritance
 * 
 * 
 * In Java, it supports only 3 Types of Inheritance
 * 
 * 1) Single-level Inheritance
 * 2) Multi-level Inheritance
 * 3) Hierarchical-level Inheritance
 * 
 * 
 * Java does not supports
 * 
 * 1) Multiple-level Inheritance
 * 2) Hybrid-level Inheritance
 *
 * 
 * 
 * 
 * 
 * 
 */
class A{
	int a;
	Scanner sc = new Scanner(System.in);
	
	void getA() {
		System.out.println("Enter the value of A :");
		a = sc.nextInt();
	}
	
	void showA() {
		System.out.println("A :"+a);
	}
}

class B extends A{
	int b;
	Scanner sc = new Scanner(System.in);
	
	void getB() {
		System.out.println("Enter the value of B :");
		b = sc.nextInt();
	}
	
	void showB() {
		System.out.println("B :"+b);
	}
}

class C extends B{
	int c;
	Scanner sc = new Scanner(System.in);
	
	void getC() {
		System.out.println("Enter the value of C :");
		c = sc.nextInt();
	}
	
	void showC() {
		System.out.println("C :"+c);
	}
}
public class Inheritence {
public static void main(String[] args) {
	C obj = new C();
	obj.getA();
	obj.getB();
	obj.getC();
	
	obj.showA();
	obj.showB();
	obj.showC();
}
}
