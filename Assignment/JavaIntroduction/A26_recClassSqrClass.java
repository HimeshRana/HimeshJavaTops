package com.assigment;

import com.assigment.rectangle.square;

//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

class rectangle{
	int length,breadth;
	
	public rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void calculateArea() {
		int area = length*breadth;
		System.out.println("Area of Rectangle :"+area);
	}
	public void calculatePerimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle :"+perimeter);
	}
	
class square extends rectangle{
	
	
	public square(int s) {
		super(s, s);
	}
}
}
public class A26_recClassSqrClass {
public static void main(String[] args) {
	// Create a rectangle object
	rectangle obj = new rectangle(5, 10);
	obj.calculateArea();
	obj.calculatePerimeter();
	// Create a Square object
	square obj1 = obj.new square(5);
	obj1.calculateArea();
	obj1.calculatePerimeter();
}
}
