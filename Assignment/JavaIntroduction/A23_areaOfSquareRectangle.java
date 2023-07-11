package com.assigment;
//Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.
class findArea{
	
	int area (int a) {
//		System.out.println("Area of Square:"+(a*a));
		return a*a;
	}
	
	void area (int l,int b) {
		System.out.println("Area of rectangle:"+(l*b));
	}
}
public class A23_areaOfSquareRectangle {
public static void main(String[] args) {
	findArea obj = new findArea();
	System.out.println("Area of Square :"+obj.area(5));
	obj.area(5, 2);
}	
}
