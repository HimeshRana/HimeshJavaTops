package com.assigment;
//Create a class named 'Shape' with a method to print "This is this is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

class shape1 {
	public void display() {
		System.out.println("This is shape");
	}
}

class rectangle1 extends shape1{
	public void display() {
		super.display();
		System.out.println("This is the Rectangle");
	}
}

class circle extends shape1{
	public void display() {
		System.out.println("This is the circle");
	}
}

class square extends rectangle1{

	public void display() {
		super.display();
		System.out.println("Square is a Rectangle");
	}
}
public class A35_inheritanceOfShape {
public static void main(String[] args) {
	square obj = new square();
	obj.display();
	
}
}
