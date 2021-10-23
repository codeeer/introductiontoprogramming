package com.medipol.operators;

public class AritmetikOperator2 {

	public static void main(String[] args) {
		
		int x, y, sonuç;
		float fsonuç;
		x = 7;
		y = 5;
		sonuç = x / y;
		System.out.println("x/y = " + sonuç);
		fsonuç = (float) x / y;
		System.out.println("x/y =" + fsonuç);
		fsonuç = x / (float) y;
		System.out.println("x/y =" + fsonuç);
		fsonuç = (float) x / (float) y;
		System.out.println("x/y =" + fsonuç);
		fsonuç = (float) (x / y);
		System.out.println("x/y =" + fsonuç);

	}

}
