package com.medipol.loops;

public class FaktoriyelliSeri {

	public static void main(String args[]) {
		double s, fakt;
		int i, j;
		s = 0;
		for (i = 2; i <= 10; i++) {
			fakt = 1;
			for (j = 1; j <= i; j++) {
				fakt = fakt * j;
			}
			s = s + 1 / fakt;
			System.out.println(s);
		}
		System.out.println("Seri toplami " + s);
	}
}
