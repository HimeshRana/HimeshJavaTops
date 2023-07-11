package com.assigment;
//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

abstract class parent {
	abstract void method();
}

class firstSubClass extends parent {

	void method() {
		System.out.println("This is first subclass");
		
	}
	
}
class secondSubClass extends parent {

	void method() {
		System.out.println("This is second subclass");
		
	}
	
}
public class A29_abstractClass {
public static void main(String[] args) {
	firstSubClass obj = new firstSubClass();
	secondSubClass obj1 = new secondSubClass();
	
	obj.method();
	obj1.method();
}
}
