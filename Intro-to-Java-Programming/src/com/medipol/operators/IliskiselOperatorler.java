package com.medipol.operators;

public class IliskiselOperatorler {

	public static void main(String[] args) {

		int x = 10;
		int y = 4;
		boolean sonuc;
		sonuc = (x > y); // x buyuk y mi
		System.out.println(x+" > " +y + " = " + sonuc);
		sonuc = (x < y); // x kuu=cuk y mi
		System.out.println("x < y  = " + sonuc);
		sonuc = (x <= y); // x kucuk esit y mi 
		System.out.println("x <= y = " + sonuc);
		sonuc = (x >= y); // x buyut esit y mi
		System.out.println("x >= y = " + sonuc);
		sonuc = (x == y); // x esit y mi
		System.out.println("x == y = " + sonuc);
		sonuc = (x != y); // x esit degil mi y
		System.out.println("x != y = " + sonuc);
	}

}
