package com.medipol.loops;

import java.util.Scanner;

public class Faktoryel {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		int n, fakt;
		int i;

		System.out.println("Kacin faktoriyeli bulunacak? ");
		n = giris.nextInt();

		fakt = 1;

		for (i = 1; i <= n; i++) {
			fakt = fakt * i;
		}

		switch (n) {
		case 1:
			System.out.println("\n" + n + "=" + fakt);
			break;

		case 2:
			System.out.println("\n1*" + n + "=" + fakt);
			break;

		case 3:
			System.out.println("\n1*2*" + n + "=" + fakt);
			break;

		case 4:
			System.out.println("\n1*2*3*" + n + "=" + fakt);
			break;

		default:
			System.out.println("\n1*2*3*..*" + n + "=" + fakt);
		}
	}

}
