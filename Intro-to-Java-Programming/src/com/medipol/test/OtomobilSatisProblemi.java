package com.medipol.test;

import java.util.Scanner;

public class OtomobilSatisProblemi {

	public static void main(String[] args) {
		
		int [][] satisListesi = { 
				{700, 600, 650},
				{900, 800, 700},
				{300, 400, 350},
	            {500, 450, 470},
	            {600, 500, 480}
				
		};
		
		int[][] satisListesi2 = new int[5][3];
		
		satisListesi2[3][1] = 450;
		int satirSonElemanIndex = satisListesi2.length - 1;
		int sutunSonElemanIndex = satisListesi2[0].length - 1;
		satisListesi2[satirSonElemanIndex][sutunSonElemanIndex] = 480;
		
		int[][] aracSatisListesiDonenDeger = satisListesiniOlustur();
		
		ekranaDiziyiYazdir(aracSatisListesiDonenDeger);

		
	}

	
	public static int[][] satisListesiniOlustur() {
		
		int aracMarkaSayisi = kullanicidanSayiAl("Lutfen marka sayisini giriniz");

		int aySayisi = kullanicidanSayiAl("lutfen satis sayilarini kac ay icin gireceginizi soyleyiniz");
		
		int [][] aracSatisListesi = new int[aracMarkaSayisi][aySayisi];
		
		for (int i = 0; i < aracSatisListesi.length; i++) {
			for (int j = 0; j < aracSatisListesi[i].length; j++) {
				aracSatisListesi[i][j] = kullanicidanSayiAl("Lutfen "+ (i+1) +" . arac markasi icin "+ (j+1) 
						+ " . ay satis verisini giriniz");
			}
		}
		
		return aracSatisListesi;
		
	}
	
	
	public static int kullanicidanSayiAl(String message) {
		Scanner giris = new Scanner(System.in);
		System.out.println(message);
		return giris.nextInt();
	}
	
	public static void ekranaDiziyiYazdir(int [][] dizi) {
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
