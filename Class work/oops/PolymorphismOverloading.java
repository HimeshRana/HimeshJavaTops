package com.oops;

import javax.swing.plaf.multi.MultiButtonUI;

import com.assignment.A10_ASCIIValueOfChar;
import com.mysql.cj.sasl.ScramSha1SaslClient;

/*
 * Polymorphism : poly -> Many
 * 				  morphism -> Forms
 * 
 *  - it is a combination of Many Forms.
 *  
 *  There are 2 types of Polymorphism
 *  
 *  1) Compile Time Polymorphism or Static Polymorphism or Early Binding Polymorphism.
 *  
 *  	e.g Method Overloading
 *  
 *  2) Run Time Polymorphism or Dynamic Polymorphism or Late Binding Polymorphism.
 *  
 *  	e.g Method Overriding.
 *   * 
 *
 * 
 * Method Overloading : 
 * 
 * -Same Method name
 * -Different Parameters/arguments
 * - Different return type.
 * 
 * 
 */
class methodOvr{
	void common()
	{
		int a=5,b=10;
		System.out.println("SUm is :"+(a+b));
	}
	void common(String name) 
	{
		System.out.println("Name :"+name);
	}
	int common(int a, int b)
	{
		return a*b;
	}
	void common(int v)
	{
		if (v%2==0) 
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}

public class PolymorphismOverloading {
	public static void main(String[] args) {
		methodOvr a = new methodOvr();
		a.common();
		a.common(5);
		a.common("Himesh");
		int val = a.common(4, 5);
		System.out.println("Multi :"+val);
		System.out.println("multiplication :"+a.common(5, 10)); 
	}
	

}
