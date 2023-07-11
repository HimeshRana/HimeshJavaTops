package com.assigment;

import java.util.Scanner;

//W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument and perform the division operation and handle Arithmetic O/P- Exception in thread main java. Lang. Arithmetic Exception:/ by zero
public class A39_arithmaticDivision {
public static void main(String[] args) {
	try {
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = num1 / num2;
        System.out.println("Division result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Caught ArithmeticException: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.out.println("Invalid number format: " + e.getMessage());
    }
}
}
