package com.medipol.operators;

public class AtamaOperatorleri {

	public static void main(String[] args) {

		int x = 5;
		int y = 5;
		System.out.format("x =  %d  ve y = %d %n", x, y);
		x = 5;
		System.out.format("x = x + y ise x =  %d  %n", x + y);
		x = 5;
		System.out.format("x += y ise x =  %d  %n", x += y);
		System.out.println("**********");
		x = 5;
		System.out.format("x = x - y ise x =  %d  %n", x - y);
		x = 5;
		System.out.format("x -= y  ise x =  %d  %n", x -= y);
		System.out.println("**********");
		x = 5;
		System.out.format("x = x * y ise  x =  %d  %n", x * y);
		x = 5;
		System.out.format("x *= y ise x =  %d  %n", x *= y);
		System.out.println("**********");
		x = 5;
		System.out.format("x = x / y ise x =  %d  %n", x / y);
		x = 5;
		System.out.format("x /= y  ise x =  %d  %n", x /= y);
		System.out.println("**********");
		x = 5;
		System.out.format("x = x mod y ise x =  %d  %n", x % y);
		x = 5;
		System.out.format("x mod= y  ise  x =  %d  %n", x %= y);
	}

}
