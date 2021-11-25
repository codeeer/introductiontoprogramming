package com.medipol.exam2;

public class DoWhile2 {

	public static void main(String[] args) {

		int k = 1;

		do {

			int i = k++ % 2;

			if (i == 1) {

				System.out.printf(k + "");

			}

			else

			{

				System.out.printf(",");

			}

		} while (k < 7);

	}

}
