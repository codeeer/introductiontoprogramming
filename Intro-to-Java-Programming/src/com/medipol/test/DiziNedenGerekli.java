package com.medipol.test;

import java.util.Scanner;

import com.medipol.functions.RecursiveSayininKuvveti;

public class DiziNedenGerekli {

	static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] a = {2,3,4,5};
		
		int[] b = new int[4];
		b[0] = 2;
		b[1] = 3;
		b[2] = 4;
		b[3] = 5;
		int sonuc = diziElemanToplami(a);
		System.out.println(sonuc);
		


	}

	
	
	public static int diziElemanToplami(int [] a) {
		
		int toplam = 0;
		
		for (int i = 0; i < a.length; i++) {
			toplam += a[i];
		}
		return toplam;
	}
	
	
	public static void dizisizTopla() {

		int sayi;
		int toplam = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Lutfen bir sayi giriniz");
			sayi = giris.nextInt();
			toplam = toplam + sayi;
		}
		System.out.println(toplam);
	}

	public static void diziIleTopla() {

		int[] sayiDizisi = new int[3];
		int toplam = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Lutfen bir sayi giriniz");
			sayiDizisi[i] = giris.nextInt();
			toplam += sayiDizisi[i];
		}
		System.out.println(toplam);
	}
	
	
	
	
	
	
	

}
