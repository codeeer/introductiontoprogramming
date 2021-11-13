package com.medipol.loops;

import java.util.Scanner;

public class BreakOrnek {

	public static void main(String args[]) {
		Scanner giris = new Scanner(System.in);
		double ort;
		int sayac, toplam, sayi;
		toplam = 0;
		sayac = 0;
		System.out.println("Alt alta pozitif sayilar gireceksiniz ve negatif sayi");
		System.out.println("girene kadar onlar toplanacak. Negatif girdiginizde");
		System.out.println("toplama isleminin sonucu size verilecektir.");

		while (true) {
			System.out.print("Sayi giriniz: ");
			sayi = giris.nextInt();

			if (sayi < 0) {
				break;
			}

			toplam += sayi;
			sayac++;
		}
		ort = toplam / sayac;

		System.out.println("Toplami " + toplam + " olan " + sayac + " tane sayi girdiniz.");
		System.out.println("Sayilarin ortalamasi da " + ort);
	}
}
