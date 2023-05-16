package com.oops;

/*
 * Constructor : it is a special member, whose name is same as class name. * 
 * 				- It is use to initialize the members of the class.
 * 				- it does not have return type.
 
 		imp note: It is called automatically when the objects of the class are created.
 		
 		There are 3 types of Constructors.
 		
 		1) Default Constructor or Parameterless Constructor.
 		
 			syntax : class-name()
 					 {
 					 	//statement
 					 }
 		
 		2) Parameterized Constructor
 		
 			syntax : class-name(parm1,parm2..)
 					 {
 					 	//statement
 					 }
 		
 		3) Copy Constructor : here the object is pass as an argument
 		
 			syntax: class-name(class-name obj)
 					{
 						statement
 					}
 * 
 *  
 * 
 */


public class Box {
	double height,width,lenght;
	
	public Box() {//Default constructor
		System.out.println("Default constructor");
		width = 5;
		height = 4;
		lenght = 3;
	}
	
	Box(double w,double h, double l){
		System.out.println("Parameterized constructor");
		width = w;
		height = h;
		lenght = l;
	}
	
	Box(Box b){
		System.out.println("Copy constructor");
		width = b.width;
		height = b.height;
		lenght = b.lenght;
	}
	
	void volume() {
		System.out.println("Volume of cude "+(width*height*lenght));
	}
public static void main(String[] args) {
	Box b1 = new Box();
	b1.volume();
	
	Box b2 = new Box(5,3,10);
	b2.volume();
	
	Box b3 = new Box(b2);
	b3.volume();
	
	
}
}
