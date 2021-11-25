package com.medipol.conditionals;

public class IfElseIf {

	public static void main(String[] args) {
		int a = -1;
		System.out.println("Denetimden onceki kod kesimi");
		if (a > 0) {
			System.out.println("a, 0'dan buyuktur.");
		} else if (a < 0) {
			System.out.println("a, 0'dan kucuktur.");
		} else if( a==0){
			System.out.println("a'nin degeri 0'dir.");
		}else
			System.out.println("Bilinmeyen bir sayi tipinde a degeri girilmis");
		
		System.out.println("Denetimden sonraki kod kesimi");
	}

}
