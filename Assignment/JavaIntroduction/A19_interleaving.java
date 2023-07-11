package com.assigment;
/*W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
*/
import java.util.Set;

public class A19_interleaving {

public static void allInterLeavings(String res,String P,String Q, Set<String> out) {
	if (P.length()==0 && Q.length()==0) {
		out.add(res);
	}
	
	if (P.length() > 0) {
		allInterLeavings(res + P.charAt(0), P.substring(1), Q, out);
	}
	
	if (Q.length() > 0) {
		allInterLeavings(res + Q.charAt(0), P, Q.substring(1), out);
	}
}

public static void main(String[] args, Set<String> out) {
	String P = "WX";
	String Q = "YZ";
	System.out.println("The given string are:"+ P + " " + Q);
	System.out.println("The interleaving string are :");
	allInterLeavings("",P,Q,out);
	out.stream().forEach(System.out::println);
}
}
