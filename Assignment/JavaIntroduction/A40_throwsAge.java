package com.assigment;
//W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18, then throw an Arithmetic Exception otherwise print a message welcome to vote. O/P- Enter your age: 16 Exception in thread main java. Lang. Arithmetic Exception: not valid

class votingDemo{
	public void validate(int age) {
		try {
			if(age<18) {
				throw new Exception("not valid");
			}
			else {
				System.out.println("Welcome to vote!");
			}
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());
			
		}
		
	}
}
public class A40_throwsAge {
public static void main(String[] args) {
	votingDemo obj = new votingDemo();
	obj.validate(16);
}
}
