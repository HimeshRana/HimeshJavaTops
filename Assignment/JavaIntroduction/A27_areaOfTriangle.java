package com.assigment;
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

class triangle {
	double side1;
	double side2;
	double side3;
	
	public triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}
	
	public void calculateArea() {
		//heron's formula
		double s = (side1+side2+side3)/2;
		double area =Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of triangle :"+area);
	}
	
	public void calculatePerimeter() {
		double perimeter = side1+side2+side3;
		System.out.println("Perimeter of triangle:"+perimeter);	
	}
}
public class A27_areaOfTriangle {
public static void main(String[] args) {
	triangle obj = new triangle();
	obj.calculateArea();
	obj.calculatePerimeter();
	
}
}
