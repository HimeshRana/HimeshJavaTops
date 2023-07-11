package com.assigment;
//W.A.J.P to check whether a given string starts with the contents of another string. Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False I3.
public class A18_stringStartCmpare {
public static void main(String[] args) {
	String s1 ="Red is favorite color.";
	String s2 ="Orange is also my favorite color.";
	
	String e ="Red";
	Boolean ends1 = s1.startsWith(e);
	Boolean ends2 = s2.startsWith(e);
	System.out.println("'"+s1+"' start with "+"'"+e+"'?"+ends1);
	System.out.println("'"+s2+"' start with "+"'"+e+"'?"+ends2);
}
}