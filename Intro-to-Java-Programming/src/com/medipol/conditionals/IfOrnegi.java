package com.medipol.conditionals;

public class IfOrnegi {

	public static void main(String[] args) {
		
		int a = 3, b = 5;

		System.out.println("Denetimden onceki kod kesimi");
		
		if (a < b) 
			System.out.println("a, b'den buyuktur.");
		
		else {
			System.out.println("a b den kucuktur");
			System.out.println("a ve b sonucu");
		}
		System.out.println("Denetimden sonraki kod kesimi");

	}

}
