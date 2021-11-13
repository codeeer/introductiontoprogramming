package com.medipol.conditionals;

import java.util.Scanner;

public class SoruIsaretiIfKullanimi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		String sonuc;
		double not;
		System.out.println("Sinav notunu (0-100) giriniz: ");
		not = giris.nextDouble();
		
		sonuc = not >= 50 ? "Basarili" : "Basarisiz";
		
		if(not >= 50) {
			sonuc = "Bsarili";
		}
		else {
			sonuc = "Basarisiz";
		}
		System.out.println("Sonuc: " + sonuc);

	}

}
