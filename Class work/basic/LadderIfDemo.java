package com._11april;

import java.util.Scanner;

public class LadderIfDemo {
	public static void main(String[] args) {
		
		int rollno,phy,chem,math,total;
		float per;
		String name;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Roll number :");
		rollno = sc.nextInt();
		System.out.print("Enter Name :");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter physics marks :");
		phy = sc.nextInt();
		
		System.out.print("Enter Chemistry marks :");
		chem = sc.nextInt();
		
		System.out.print("Enter Maths marks :");
		math = sc.nextInt();
		
		total = phy+chem+math;
		per = (float)total/3;
		
		System.out.println("Roll number :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Total Marks Obtained :"+total+"/300");
		System.out.println("Percentage Gained :"+per);
		System.out.print("Grade : ");
		if(per>=75)
		{
			System.out.print("Distinction");
		}
		else if(per>=60){
			System.out.print("First Class");
		}
		else if (per>=50) {
			System.out.print("Second Class");
		}
		else if (per>=40) {
			System.out.print("Pass Class");
		}
		else {
			System.out.print("Fail!!!");
		}
	}

}
