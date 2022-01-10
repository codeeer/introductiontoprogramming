package com.medipol.exercises.karisik;

public class Quiz3 {

	public static void main(String[] args) {

		// Declare and allocate array
		double array[] = new double[5];
		// Initialize array
		for (int index = 0; index < array.length; index++)
			array[index] = (index * 3.0) + 0.5;
		// Print array information 
		System.out.printf("%.2f%n", (double)(array.length - 2));
		System.out.printf("%.2f%n", array[2]);
		System.out.printf("%.2f%n", array[3] * 2.0);
		System.out.printf("%.2f%n", array[4] + 0.54);
		System.out.printf("%.2f%n", array[5]);
	}
}
