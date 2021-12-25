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
		
		int[][] arabaSatisTablosu2 = new int[5][3];
		
		arabaSatisTablosu2[0][0] = 700;
		arabaSatisTablosu2[0][1] = 600;
		arabaSatisTablosu2[0][2] = 650;
		
		
		
		arabaSatisTablosu2[4][2] = 480;
		arabaSatisTablosu2[arabaSatisTablosu2.length-1][arabaSatisTablosu2[0].length-1] = 480;
		

		System.out.println(arabaSatisTablosu2.length);
		System.out.println(arabaSatisTablosu2[0].length);
		
		int[][] dizi = new int[2][2];
		
		Scanner giris = new Scanner(System.in);
		System.out.println("lutgen 0 a 0 inci elemani giriniz ");
		dizi[0][0] = giris.nextInt();
		
		System.out.println("lutgen 0 a 1 inci elemani giriniz ");
		dizi[0][1] = giris.nextInt();
		
		System.out.println("lutgen 0 a 0 inci elemani giriniz ");
		dizi[1][0] = giris.nextInt();
		
		System.out.println("lutgen 0 a 1 inci elemani giriniz ");
		dizi[1][1] = giris.nextInt();
		
		System.out.println("girdiginiz matris: ");
		
		for(int i =0; i< dizi.length; i++) {
			
			for(int j = 0; j<dizi[0].length; j++) {
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
	int methodDanGelenToplam = diziyiTopla(dizi);
				
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
