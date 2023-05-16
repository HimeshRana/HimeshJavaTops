package com._11april;

/*
 * Loop: It is a process where the single task gets repeated again and again 
 *       until the condition is not satisfied.
 *       
 *       e.g 	circle
 *       
 * There are 3 types of Loop
 * 
 * 1) while Loop
 * 
 * syntax:   
 * 			//initialization
 * 
 * 			 while(condition)
 * 			 {
 * 				//statement
 * 				updation
 * 
 * 			 }
 * 
 * - condition is a boolean value. true/false
 * 
 * - it is called as Entry Controlled Loop.
 * - Because the condition is checked first and then the body is executed.
 * - No semi-colon after the condition.
 * 
 * 
 * 
 * 2) do..while Loop
 * 
 * syntax :  
 * 			//intitialization
 * 
 * 			do
 * 			{
 * 				//statement
 * 				updation
 * 			}
 * 			while(condition);
 * 
 * - it is called as Exit Controlled Loop.			
 * - Because the condition is checked at last.
 * - it will execute the do block atleast once, even if the condition is false.
 * - Semicolon after condition.
 * 
 * 
 * 
 * 3) for loop
 * 
 * - all in one line
 * 
 * syntax :  for(initialization;condition;updation)
 * 			 {
 * 					//statement
 * 			 }
 * 
 * 
 * 
 */

public class LoopDemo {
	public static void main(String[] args) {
		
		int i=1;
		
//		while (i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		do {
			System.out.println(i);
			i--;
		}while(i<=1);
	}

}
