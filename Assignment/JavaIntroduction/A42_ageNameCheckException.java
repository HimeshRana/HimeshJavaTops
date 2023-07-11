package com.assigment;

import java.util.Scanner;

//W.A.J.P to create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor. If age of student is not in between 15 and 21 then generate user defined exception "AgeNotWithinRangeException". If name contains numbers or special symbols raise exception "NameNotValidException". Define the two exception classes.
class AgeNotWithinRangeException extends Exception {

	@Override
	public String toString() {
		return ("Age is not between 15 and 21. please ReEnter the Age");
	}
}

class NameNotValidException extends Exception {
	public String toString() {
		return ("Name is not Valid..Please ReEnter the Name");
	}
}

class student {
	int roll_no, age;
	String name, course;

	public student(int roll_no, int age, String name, String course) {

		this.roll_no = roll_no;
		this.course = course;

		int temp = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch;
			ch = name.charAt(i);
			if (ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z') {
				temp = 1;
			}
		}
		try {
			if (temp == 1) {
				throw new NameNotValidException();
			} else {
				this.name = name;
			}
		} 
		catch (NameNotValidException e) {
			e.printStackTrace();

		}
		
		try {
			if(age>=15 && age<=21) {
				
				this.age = age;
			}else {
				throw new AgeNotWithinRangeException();
			}
		} catch (AgeNotWithinRangeException e) {
			e.printStackTrace();
		}

	}
	
	void display() {
		System.out.println("Roll_no = "+roll_no+", Age ="+age+", Name ="+name+", Course ="+course+".");
	}

}

public class A42_ageNameCheckException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter roll number :");
		int roll_no = sc.nextInt();
		System.out.print("Enter age :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name :");
		String name= sc.nextLine();
		System.out.print("Enter course :");
		String course = sc.nextLine();
		student st = new student(roll_no, age, name, course);
		st.display();

	}
}
