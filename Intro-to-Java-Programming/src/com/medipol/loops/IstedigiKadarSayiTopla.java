package com.medipol.loops;

import java.util.Scanner;

public class IstedigiKadarSayiTopla {

	public static void main(String[] args) {

		Scanner kullanici = new Scanner(System.in);
		double toplam = 0;
		double girdi = -1;
		int adet = 1;
		System.out.print("Toplanacak Sayıları Girin (Çıkmak için 0 girin)\n\n");
		while (girdi != 0) {
			System.out.print(adet + ". Sayı: ");
			girdi = kullanici.nextDouble();
			toplam = toplam + girdi;
			adet++;
		}
		System.out.println("\n\nToplam: " + toplam);

	}

}
