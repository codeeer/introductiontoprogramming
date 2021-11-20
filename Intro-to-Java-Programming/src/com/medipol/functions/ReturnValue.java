package com.medipol.functions;

public class ReturnValue {

	public static void printSquare(double x) {
		System.out.println(x * x);
	}

	public static void main(String[] arguments) {
		printSquare(5);
		System.out.println(square(5));
	}

	public static double square (double x ){
		return x * x ;
	}
}

