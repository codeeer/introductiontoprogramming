package com.medipol.loops;

public class FaktoriyelliSeri2 {

	public static void main(String args[]) {
		double s, fakt;
		int i;
		s = 0;
		fakt = 1;
		for (i = 2; i <= 10; i++) {
			fakt = fakt * i;
			s = s + 1 / fakt;
			System.out.println(s);
		}
		System.out.println("Seri toplami: " + s);
	}
}
