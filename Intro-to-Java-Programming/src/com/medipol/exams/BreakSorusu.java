package com.medipol.exams;

public class BreakSorusu {

	public static void main(String[] args) {
		int x = 1;
		int n;
		for (n = 1; n <= 8; n++) {
			if (n == 4) {
				break;
			}
			x = x + n;
		}
		System.out.printf("n nin degeri %d  x in degeri %d  %n", n, x);
	}

}
