package com.medipol.conditionals;

import java.util.Scanner;

public class ScannerIleIfYapisi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		// String kullanicininYazdigi;
		int istanbulPlakaKodu = 34;
		int girilenPlakaKodu;
		// soruyu ekrana basalım
		System.out.println("Istanbul'un plaka kodu nedir?");
		// klavyeyle girilen değeri integer olarak alalım
		girilenPlakaKodu = giris.nextInt();
		if (girilenPlakaKodu == istanbulPlakaKodu) {
			System.out.println("Evet! Dogru yanit.");
		} else {
			System.out.println("Hayir, Istanbul'un plaka kodu 34'tur.");
		}

	}

}
