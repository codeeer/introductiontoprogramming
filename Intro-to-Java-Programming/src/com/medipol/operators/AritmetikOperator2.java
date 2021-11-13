package com.medipol.operators;

public class AritmetikOperator2 {

	public static void main(String[] args) {
		
		int x, y, sonuc;
		//int x;
		//int y;
		//int sonuc;
		float fsonuc;
		x = 7;
		y = 5;
		sonuc = x / y;
		System.out.println("x/y = " + sonuc);
		
		fsonuc = (float) x / y; // float tipine cast ediliyor.
		System.out.println("x/y =" + fsonuc);
		
		fsonuc = x / (float) y;
		System.out.println("x/y =" + fsonuc);
		
		fsonuc = (float) x / (float) y;
		System.out.println("x/y =" + fsonuc);
		
		fsonuc = (float) (x / y);// (x/y) sonucu int
		System.out.println("x/y =" + fsonuc);

	}

}
