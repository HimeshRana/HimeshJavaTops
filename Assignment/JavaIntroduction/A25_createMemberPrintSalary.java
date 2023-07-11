package com.assigment;

import com.keyword.thisdemo;

/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.
*/

class Member{
	String name;
	int age;
	long phonenumber;
	String address;
	int salary;
	
	public Member(String name,int age, long phonenumber,String address,int salary) {
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
	}
	
	public void printSalary() {
		System.out.println("Salary of "+this.name+" is: "+this.salary);
	}
}
public class A25_createMemberPrintSalary {
public static void main(String[] args) {
	Member obj = new Member("Himesh", 27, 9737814176l, "Valsad", 25000);
	obj.printSalary();
}
}
