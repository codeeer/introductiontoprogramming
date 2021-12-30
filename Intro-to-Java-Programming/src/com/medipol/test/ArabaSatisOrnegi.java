package com.medipol.test;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class ArabaSatisOrnegi {
	
	public static void main(String[] args) {
		int[][] arabaSatisTablosu = {
				{700,600,650},
				{900,800,700},
				{300,400,350},
				{500,450,470},
				{600,500,480}};
		
		int[][] kendiFonsiyonumdakiArabaSatisListesi= arabaSatisVerileriniKullanicidanAl();
		diziyiEkranaYazdir(kendiFonsiyonumdakiArabaSatisListesi);
				
	}
	
	
	static int diziyiTopla(int[][] dizi) {
		int toplam = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				toplam += dizi[i][j];
			}
		}
		return toplam;
	}
	
	public static void deneme() {
		int[][] arabaSatisTablosu = {
				{700,600,650},
				{900,800,700},
				{300,400,350},
				{500,450,470},
				{600,500,480}
		};
		
		int[][] arabaSatisTablosu2 = new int[5][3];
		
		int satirUzunluk = arabaSatisTablosu2.length;
		
		int sutunUzunluk = arabaSatisTablosu2[0].length;
		
		arabaSatisTablosu[satirUzunluk - 1][sutunUzunluk -1] = 480;
		
		arabaSatisTablosu2[1][1] = 800;
	}
	
	public static int[][] arabaSatisVerileriniKullanicidanAl() {
		int markaSayisi;
		int aySayisi;
		
		markaSayisi = kullaniciDanIntDegerAl("Araba marka sayisi belirtiniz");
		aySayisi = kullaniciDanIntDegerAl("Kac ayin degerleri girilecek");
		
		int[][] otomobilSatisListesi  = new int[markaSayisi][aySayisi];
		
		for (int i = 0; i < otomobilSatisListesi.length; i++) {
			for (int j = 0; j < otomobilSatisListesi[i].length; j++) {
				otomobilSatisListesi[i][j] = kullaniciDanIntDegerAl(i+1 +" . marka icin " + j+1 +". ay satis verisini "
						+ "giriniz ");
			}
		}
		
		return otomobilSatisListesi;
		
	}
	public static int kullaniciDanIntDegerAl(String message) {
		Scanner giris = new Scanner(System.in);
		System.out.println(message);

		return giris.nextInt();
	}

	
	static void diziyiEkranaYazdir(int[][] dizi) {
		
		for (int i = 0; i < dizi.length; i++) {
			
			for (int j = 0; j < dizi[0].length; j++) {
				System.out.printf(dizi[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int dizininUzunlugunuBul(int[] dizi) {
		int uzunluk = 0;
		while(true) {
			
			try {
				dizi[uzunluk] = 0;
				uzunluk++;
			}
			catch (Exception e) {
				uzunluk++;
				break;
			}
		}
		
		return uzunluk;
		
	}
}
