package com.medipol.exams;

import java.util.Scanner;

public class ScannerNesnesi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in); 
		int x, y, z; 
		System.out.println("x..:"); 
		x = giris.nextInt(); 
		y = 1; 
		z = 2; 
		do { 
		y = y * z; 
		z += 2; 
		} while (z < x); 
		System.out.println(y + "," + z); 

	}

}
