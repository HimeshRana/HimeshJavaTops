package com.oops;

/*
 * Constructor Chaining : it is the inheritance of Constructor
 * 
 * Method Overriding : 
 * 
 * - it is an example of Run-Time Polymorphism.
 * - Same Method Name.
 * - Same Return Type.
 * - Same Parameters.
 * 
 * - the whole method signature is same.
 * =================================================
 * - Java provides 4 powerful keywords
 * 
 * 1) super
 * 2) final
 * 3) this
 * 4) static
 * 
 */
class A1 {

	A1() {
		System.out.println("A1's Constructor called");
	}

	void show() {
		System.out.println("A1's Method called");
	}
}

class B1 extends A1 {
	B1() {
		System.out.println("B1's Constructor called");
	}

	void show() {
		super.show();
		System.out.println("B1's Method called");
	}
}

class C1 extends B1 {
	C1() {
		System.out.println("C1's Constructor called");
	}

	void show() {
		super.show();
		System.out.println("C1's Method called");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		C1 c = new C1();
		c.show();
	}
}
