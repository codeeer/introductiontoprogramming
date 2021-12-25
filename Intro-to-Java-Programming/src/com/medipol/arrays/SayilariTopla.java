package com.medipol.arrays;

import java.util.Scanner;

public class SayilariTopla {

	public static void main(String[] args) {
//		dizisizTopla();
		
//		diziIleTopla();
		int[] diziDegiskeni = {2,3,4,5};
		
		diziTopla(diziDegiskeni);
		int sonuc = diziElemanlariniTopla(diziDegiskeni);
		System.out.println(sonuc);
	}

	public static void dizisizTopla() {
		Scanner giris = new Scanner(System.in);
		int girilenSayi, toplam, i;
		toplam = 0;
		girilenSayi = 0;
		for (i = 1; i <= 3; i++) {
			System.out.print("Bir sayi giriniz: ");
			girilenSayi = giris.nextInt();
			toplam = toplam + girilenSayi;
		}
		System.out.println(i - 1 + " tane sayi girdiniz.");
		System.out.println("Toplami " + toplam + " ediyor.");

	}

	public static void diziIleTopla() {

		Scanner giris = new Scanner(System.in);
		// int sayi[] = new int[6]; c de dizi tanimi
		int[] sayiDizisi = new int[3];
		int toplam, i;
		toplam = 0;
		for (i = 1; i <= 3; i++) {
			System.out.print("Bir sayi giriniz: ");
			sayiDizisi[i-1] = giris.nextInt();
			toplam = toplam + sayiDizisi[i-1];
		}
		
		System.out.println("Girdiniz sayilarin toplami: " + toplam);
		System.out.println("Sayi dizisinin ikinci elemani: " + sayiDizisi[2]);

	}
	
	public static void diziTopla(int[] x) {
		
		
		int toplam= 0;
		for (int i = 0; i < x.length; i++) {
			toplam = toplam + x[i];
			
		}
		System.out.println(toplam);
	}
	
	
	public static int diziElemanlariniTopla(int [] dizi) {
		
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam = toplam + dizi[i];
			toplam += dizi[i];
		}
		
		return toplam;
	}
}
