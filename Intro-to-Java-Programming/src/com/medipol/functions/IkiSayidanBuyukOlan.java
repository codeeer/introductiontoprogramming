package com.medipol.functions;

import java.util.Scanner;

public class IkiSayidanBuyukOlan {
	
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("Büyük Olan Sayıyı Bulma;");
		System.out.print("Sayı 1: ");
		double sayi1 = girdi.nextInt();
		System.out.print("Sayı 2: ");
		double sayi2 = girdi.nextInt();
		System.out.println(sayi1+" ve "+sayi2+" içerisinden büyük olan: "+Buyuk(sayi1, sayi2));
	}

	public static double Buyuk(double a, double b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}

}
