package com.medipol.conditionals;

import java.util.Scanner;

public class EnKucukSayiyiBul {

	/*
	 * Bu örnekte kullanıcıdan 3 tane sayı girmesini istiyoruz ve bu 3 sayıdan en
	 * küçüğünü bulup ekrana basıyoruz.
	 */

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int a, b, c; // sayılar, bu değişkenlere
		int enKucukSayi; // en küçüğü bir yerde tutalım
		System.out.println("Birinci sayiyi giriniz: ");
		a = giris.nextInt();
		System.out.println("Ikinci sayiyi giriniz: ");
		b = giris.nextInt();
		System.out.println("Ucuncu sayiyi giriniz: ");
		c = giris.nextInt();
		if (a < b) {
			if (a < c) {
				enKucukSayi = a;
			} else {
				enKucukSayi = c;
			}
		} else if (b < c) {
			enKucukSayi = b;
		} else {
			enKucukSayi = c;
		}
		System.out.println("En kucuk sayi: " + enKucukSayi);

	}

}
