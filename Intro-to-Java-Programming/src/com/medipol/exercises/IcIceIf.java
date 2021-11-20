package com.medipol.exercises;

public class IcIceIf {

	public static void main(String[] args) {
		
		int a = 9, b = 9, c = 8;
		if (a > b) {
			System.out.println("a, b'den büyüktür.");
			if (a > c) {
				System.out.println("a, c'den de büyüktür.");
			} else {
				System.out.println("a, c'den büyük değildir.");
			}
		}
		if(a==b) {
			System.out.println("a, c'den büyük değildir.");
		}
		else {
			System.out.println("a, c'den büyük değildir.");
		}
	}

}
