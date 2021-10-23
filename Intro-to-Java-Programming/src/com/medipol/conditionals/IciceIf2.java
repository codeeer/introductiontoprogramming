package com.medipol.conditionals;

public class IciceIf2 {

	public static void main(String[] args) {
		int a = -1;
		System.out.println("Denetimden önceki kod kesimi");
		if (a > 0) {
			System.out.println("a, 0'dan büyüktür.");
		} else if (a < 0) {
			System.out.println("a, 0'dan küçüktür.");
		} else {
			System.out.println("a'nın değeri 0'dır.");
		}
		System.out.println("Denetimden sonraki kod kesimi");

	}

}
