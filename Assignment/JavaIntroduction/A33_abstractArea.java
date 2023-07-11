package com.assigment;

import java.util.Scanner;

//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.

abstract class shape{
	abstract double rectangleArea(double lenght, double breadth);
	abstract double squareArea(double side);
	abstract double circleArea(double radius);
}

class area extends shape {

	double rectangleArea(double lenght, double breadth) {
		return lenght*breadth;	
	}

	double squareArea(double side) {
		return side*side;
		
	}

	double circleArea(double radius) {
		return Math.PI*radius*radius;
	}
	
}
public class A33_abstractArea {
public static void main(String[] args) {
	area obj =new area();
	
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter lenght of Rectanagle:");
	double l =sc.nextDouble();
	System.out.println("Enter breath of Rectanagle:");
	double b =sc.nextDouble();
	System.out.println("Enter side of Square:");
	double s =sc.nextDouble();
	System.out.println("Enter radius of Circle:");
	double c =sc.nextDouble();
	System.out.println("Area of Rectanagle is:"+obj.rectangleArea(l, b));
	System.out.println("Area of Square is:"+obj.squareArea(s));
	System.out.println("Area of Circle is:"+obj.circleArea(c));
}
}
