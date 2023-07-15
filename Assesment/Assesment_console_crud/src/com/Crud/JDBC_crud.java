package com.Crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;

class Detail {
	int id;
	String fname, lname;
	long mobile;
	String subject1;
	double marks1;
	int fees1;
	String subject2;
	double marks2;
	int fees2;

	public Detail(int id, String fname, String lname, long mobile, String subject1, double marks1, int fees1,
			String subject2, double marks2, int fees2) {

		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.subject1 = subject1;
		this.marks1 = marks1;
		this.fees1 = fees1;
		this.subject2 = subject2;
		this.marks2 = marks2;
		this.fees2 = fees2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public double getMarks1() {
		return marks1;
	}

	public void setMarks1(double marks1) {
		this.marks1 = marks1;
	}

	public int getFees1() {
		return fees1;
	}

	public void setFees1(int fees1) {
		this.fees1 = fees1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public double getMarks2() {
		return marks2;
	}

	public void setMarks2(double marks2) {
		this.marks2 = marks2;
	}

	public int getFees2() {
		return fees2;
	}

	public void setFees2(int fees2) {
		this.fees2 = fees2;
	}

	@Override
	public String toString() {
		return "<Serial Number=" + id + ", First name=" + fname + ", Last name=" + lname + ", Contact number=" + mobile
				+ ", subject=" + subject1 + ", marks=" + marks1 + ", fees=" + fees1 + ", subject=" + subject2
				+ ", marks=" + marks2 + ", fees=" + fees2 + ">\n";
	}

}

public class JDBC_crud {

	public static void main(String[] args) {
		
        Detail d1 = new Detail(1, "Himesh", "Rana", 9737814176l, "Java", 90, 30000, "C/C++", 80, 25000); 
        Detail d2 = new Detail(2, "Radhika", "Patel", 8320120731l, "Cyber Security", 85, 40000, "Ethical Hacking", 80, 35000); 
		List<Detail> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		char ch;

		System.out.println("Welcome to school management system");
		System.out.println("press 1 for Counsellor");
		System.out.println("press 2 for Faculty");
		System.out.println("press 3 for Student");
		System.out.print("Enter your choice :");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			do {
				System.out.println("=====Welcome Counsellor=====");
				System.out.println("->Select From below\n 1.Add Student\n 2.Remove Student\n 3.View All Student\n 4.View Specific Student");
				System.out.print("Enter your choice :");
				int num1 = sc.nextInt();

				if (num1 == 1) {
					System.out.println("-------------------------");
					System.out.print("Enter Serial Number :");
					int numb = sc.nextInt();
					System.out.print("Enter first name :");
					String fname = sc1.next();
					System.out.print("Enter last name :");
					String lname = sc1.next();
					System.out.print("Enter contact number :");
					long mob = sc.nextLong();
					System.out.print("Enter subject :");
					String sub1 = sc1.next();
					System.out.print("Enter Marks :");
					int mark1 = sc.nextInt();
					System.out.print("Enter fees :");
					int fees1 = sc.nextInt();
					System.out.print("Enter subject :");
					String sub2 = sc1.next();
					System.out.print("Enter Marks :");
					int mark2 = sc.nextInt();
					System.out.print("Enter fees :");
					int fees2 = sc.nextInt();
					System.out.println("-------------------------");


					list.add(new Detail(numb, fname, lname, mob, sub1, mark1, fees1, sub2, mark2, fees2));
					System.out.println("Data succesfully inserted.");
				}
				
				else if (num1==2) {
					boolean found = false;
					System.out.println("Enter id student to serch :");
					int sid = sc.nextInt();
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					Iterator i= list.iterator();
					while (i.hasNext()) {
						Detail d = (Detail) i.next();
						if (d.getId()==sid) {
							found = true;
                            i.remove();
                            System.out.print(d);
						}
					}
                    if(!found) {
                    	System.out.println("Record not found");
                    }
                    else {
                    	System.out.println("Record deleted succesfully...!");
                    }
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

					
				}

				else if (num1 == 3) {
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					Iterator i = list.iterator();
					while(i.hasNext()) {
						Detail d = (Detail) i.next();
						System.out.print(d);
						
					}
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					
				}
				
				else if(num1==4) {
					boolean found = false;
					System.out.println("Enter id student to serch :");
					int sid = sc.nextInt();
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					Iterator i= list.iterator();
					while (i.hasNext()) {
						Detail d = (Detail) i.next();
						if (d.getId()==sid) {
							found = true;
							System.out.println(d);
						}
					}
                    if(!found) {
                    	System.out.println("Record not found");
                    }
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

				}
				
				else {
					System.out.println("Invalid input.");
				}

				System.out.print("Do you want do activity again? (y/n)...\n Enter Your choice :");
				
				ch = sc1.next().charAt(0);
			} while (ch == 'y');

			break;
		case 2:
			System.out.println("=====Welcome Counsellor=====");
			System.out.println("->Select From below\n 1.Add Marks to Student\n 2.View All Student");
			System.out.print("Enter your choice :");
			int num1 = sc.nextInt();
			
			if(num1==1) {
				boolean found = false;
				System.out.println("Enter id student to serch :");
				int sid = sc.nextInt();
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
				Iterator i= list.iterator();
				while (i.hasNext()) {
					Detail d = (Detail) i.next();
					if (d.getId()==sid) {
						found = true;
                        System.out.println("Enter new Marks of subject "+d.getMarks1() +":");
                        int mark1 = sc.nextInt();
                        d.setMarks1(mark1);
                       
                        System.out.println("Enter new Marks of subject "+d.getMarks2() +":");
                        int mark2 = sc.nextInt();
                        d.setMarks1(mark2);
                        
                        System.out.print(d);
					}
				}
                if(!found) {
                	System.out.println("Record not found");
                }
                else {
                	System.out.println("Record Update succesfully...!");
                }
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

			
				
			}
			
			else if(num1==2){
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
				Iterator i = list.iterator();
				while(i.hasNext()) {
					Detail d = (Detail) i.next();
					System.out.print(d);
					
				}
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			}
			
			else {
				System.out.println("Invalid input.");
			}

			break;

		case 3:
			System.out.println("Login not availble for student.");

			break;

		default:
			System.out.println("invalid input");
			break;
		}

	}
}
