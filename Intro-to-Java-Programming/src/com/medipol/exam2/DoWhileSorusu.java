package com.medipol.exam2;

import java.util.Scanner;

public class DoWhileSorusu {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		int x, y, z;

		System.out.println("x..:");

		x = giris.nextInt();

		y = 6;

		z = 4;

		do {

			y = y * z;

			z += 2;

		} while (z < x);

		System.out.println(y + "," + z);

	}

}
