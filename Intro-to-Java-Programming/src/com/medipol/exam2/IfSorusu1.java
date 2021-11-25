package com.medipol.exam2;

public class IfSorusu1 {

	public static void main(String[] args) {
		int a = 11;
		int b = 9;
		int c = 0;
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
		System.out.println(b + "," + a);

	}

}
