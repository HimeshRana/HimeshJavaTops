package com.assigment;
//Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class

class parentClass{
	void parentMethod(){
		System.out.println("This is a parent class");
	}
}

class childClass extends parentClass{
	void childMethod(){
		System.out.println("This is a child class");
	}
}
public class A24_parentChildClass {
public static void main(String[] args) {
	
	// Create an object of the parent class
	parentClass obj = new parentClass();
	// Call the method of the parent class by the object of the parent class
	obj.parentMethod();
	
	// Create an object of the child class
	childClass obj1 = new childClass();
	// Call the method of the child class by the object of the child class
	obj1.childMethod();
	
	// Create an object of the child class
		childClass obj2 = new childClass();
		// Call the method of the parent class by the object of the child class
		obj2.parentMethod();
}
}
