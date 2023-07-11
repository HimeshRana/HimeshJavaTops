package com.assigment;
//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.

abstract class marks{
	abstract float getPercentage();
}
class A extends marks{
	float mark1,mark2,mark3;
	
	public A(float mark1,float mark2,float mark3) {
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	float getPercentage() {
		
		return (((mark1+mark2+mark3)/300)*100);
	
	
}
}

class B extends marks{
	float mark1,mark2,mark3,mark4;
	
	public B(float mark1,float mark2,float mark3,float mark4) {
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
	}
	
	float getPercentage() {
		
		return (((mark1+mark2+mark3+mark4)/400)*100);
	
	
}
}
public class A31_abstractClassMarks {
public static void main(String[] args) {
	A obj = new A(79, 84, 91);
	System.out.println("Percentage of student A:"+obj.getPercentage());
	B obj1 = new B(58, 75, 60,45);
	System.out.println("Percentage of student B:"+obj1.getPercentage());
}
}
