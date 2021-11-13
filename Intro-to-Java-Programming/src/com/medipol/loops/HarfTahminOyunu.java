package com.medipol.loops;

import java.util.Random;
import java.util.Scanner;

public class HarfTahminOyunu {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);

		Random rastgele = new Random();
		int rast;

		rast = rastgele.nextInt(26) + 97; // 97den 122 ye kadar sayi uretiyor.

		int hak = 0;
		char harf = 0;
		System.out.println("Harfi bulmak icin 10 hakkiniz var.");
		System.out.println("Baslamak icin bir harf giriniz");
		System.out.println((char) rast);
		while (hak < 10) {
			harf = giris.next().charAt(0);
			if (harf == (char) rast) {
				System.out.println("tebrikler " + hak + ". hakkinizda sayiyi buldunuz: " + harf);
				hak = 11;
			} else {
				hak++;
				System.out.println("Bilemediniz tekrar deneyiniz. Kalan hak sayisi: " + (10 - hak));
			}

		}
		if (hak == 10) {
			System.out.println("Uzgunuz hakkiniz doldu.Harf " + harf + " idi.");
		}

	}

}
