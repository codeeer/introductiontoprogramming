package com.medipol.operators;

public class PrefixAndPostfixOperator {

	public static void main(String[] args) {
		int n = 35;
		float x = 12.7f;
		System.out.format("n = %d iken --n = %d ve n= %d olur.  %n", n, --n, n);
		System.out.format("n = %d iken ++n = %d ve n= %d olur.  %n", n, ++n, n);
		System.out.format("n = %d iken n-- = %d ve n= %d olur.  %n", n, n--, n);
		System.out.format("n = %d iken n++ = %d ve n= %d olur.  %n", n, n++, n);
		System.out.println();
		System.out.format("x = %f iken --x = %f ve x= %f olur.  %n", x, --x, x);
		System.out.format("x = %f iken ++x = %f ve x= %f olur.  %n", x, ++x, x);
		System.out.format("x = %f iken x-- = %f ve x= %f olur.  %n", x, x--, x);
		System.out.format("x = %f iken x++ = %f ve x= %f olur.  %n", x, x++, x);

	}

}
