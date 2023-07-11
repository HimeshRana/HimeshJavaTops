package com.assigment;

import java.util.Scanner;

import com.keyword.thisdemo;

//Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.

class complex {
	double real;
	double imaginary;

	public complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public complex add(complex other) {
		double sumreal = this.real + other.real;
		double sumimaginary = this.imaginary + other.imaginary;
		return new complex(sumreal, sumimaginary);

	}

	public complex subtract(complex other) {
		double diffreal = this.real - other.real;
		double diffimaginary = this.imaginary - other.imaginary;
		return new complex(diffreal, diffimaginary);

	}

	public complex multiply(complex other) {
		double prodReal = (this.real * other.real) - (this.imaginary * other.imaginary);
		double prodImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
		return new complex(prodReal, prodImaginary);
	}
	
	public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class A28_printSumDiffPro {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        complex complex1 = new complex(real1, imaginary1);
        complex complex2 = new complex(real2, imaginary2);

        complex sum = complex1.add(complex2);
        complex difference = complex1.subtract(complex2);
        complex product = complex1.multiply(complex2);
        
        System.out.println("Sum of the two complex numbers: ");
        sum.display();

        System.out.println("Difference of the two complex numbers: ");
        difference.display();

        System.out.println("Product of the two complex numbers: ");
        product.display();
        

	}
}
