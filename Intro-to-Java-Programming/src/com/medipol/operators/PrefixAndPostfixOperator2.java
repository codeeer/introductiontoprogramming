package com.medipol.operators;

public class PrefixAndPostfixOperator2 {

	public static void main(String[] args) {
		int m, n, p, q;

		m = 4;
		n = 2;
		p = 10;
		q = 8;

		m = -m++;
		n = n--;
		p = --p;
		q = -++q;
		System.out.println("m=" + m);
		System.out.println("n=" + n);
		System.out.println("p=" + p);
		System.out.println("q=" + q);

	}

}
