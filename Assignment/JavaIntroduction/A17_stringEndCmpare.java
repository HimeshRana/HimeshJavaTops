package com.assigment;
//W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
public class A17_stringEndCmpare {
public static void main(String[] args) {
	String s1 ="Java Exercises";
	String s2 ="Java Exercise";
	
	String e ="se";
	Boolean ends1 = s1.endsWith(e);
	Boolean ends2 = s2.endsWith(e);
	System.out.println("'"+s1+"' ends with "+"'"+e+"'?"+ends1);
	System.out.println("'"+s2+"' ends with "+"'"+e+"'?"+ends2);
}
}
