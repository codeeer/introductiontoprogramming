package com.medipol.conditionals;

import java.util.Scanner;

public class KarekokunuBul {

	/*
	 * Bilgisayara negatif olmayan bir sayı girildiğinde bu sayının karekökünü hesaplayan, 
	 * negatif bir sayı girildiğinde ise kullanıcıyı uyaran bir Java programı yazalım.
	 */
	
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		double sayi;
		System.out.println("Karekokunu bulmak icin bir sayi giriniz: ");
		sayi = giris.nextDouble();
		if (sayi < 0)
			System.out.println("Olmadi, pozitif sayi girmeliydiniz");
		else
			System.out.println(sayi + "'nin karekoku: " + Math.sqrt(sayi));

	}

}
