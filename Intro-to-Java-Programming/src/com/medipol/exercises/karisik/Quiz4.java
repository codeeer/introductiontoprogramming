package com.medipol.exercises.karisik;

public class Quiz4 {

	static double values[] = { 0.0, 1.5, 3.0, 4.5, 6.0 };

	static double variable = 5.0;

	public static void main(String[] args) {

		System.out.println(tripleNumber(10));
		System.out.println(tripleNumber(variable));
		System.out.println(tripleNumber(values[2]));
		System.out.println(values[2]);
		doubleArray(values);
		System.out.println(values[2]);
	}

	public static double tripleNumber(double param) {
		return param + param + param;
	}

	public static void doubleArray(double array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= 2.0;
		}
	}

}
