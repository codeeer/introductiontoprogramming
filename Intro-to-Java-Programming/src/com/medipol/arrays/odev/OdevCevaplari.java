package com.medipol.arrays.odev;


import java.util.Arrays;
import java.util.Scanner;

public class OdevCevaplari {

	public static void main(String[] args) {
		 int[][] matris={
		            {56,23,678,231},
		            {234,21,78,26},
		            {654,33,32,67},
		            {189,35,56,89} };
		 
		 int [] tekSayilar = tekSayilariDiziOlarakDon(matris);
		 System.out.println(Arrays.toString(tekSayilar));
		 
		 int[] ciftSayilar = ciftSayilariDiziOlarakDon(matris);
		 System.out.println(Arrays.toString(ciftSayilar));
		 
		 System.out.println(Arrays.deepToString(matris));
		 System.out.println(matris);
		 
		 Scanner giris = new Scanner(System.in);
		 System.out.println("Lutfen bir sayi giriniz");
		 int deger = giris.nextInt();
		 if(disardanGelenDegeriKontrolEt(matris, deger)) {
			System.out.println("Matirs de olan bir degeri girdiniz"); 
		 }
		 else {
			 System.out.println("Matris de olmayan bir degeri girdiniz");
		 }
		 
	}
	
	public static int[] tekSayilariDiziOlarakDon(int [][] dizi) {
		int sayac = 0;
		int[] tekSayilar = new int[0];
		int index=0;

		try {
			for (int i = 0; i < dizi.length; i++) {
				for (int j = 0; j < dizi[i].length; j++) {
					if(dizi[i][j] % 2 != 0) {
						sayac++;
					}
				}
			}
	
			tekSayilar = new int[sayac];
			for (int i = 0; i < dizi.length; i++) {
				for (int j = 0; j < dizi[i].length; j++) {
					if(dizi[i][j] % 2 != 0) {
						tekSayilar[index++] = dizi[i][j];
					}
				}
			}
		}
		catch (Exception e) {
	
			System.out.println("Bilinmeyen hata olustu "+e.getMessage());
		}
		finally {
			System.out.println("her durumurunda calisir");
		}
		return tekSayilar;

	}
	
	public static int[] ciftSayilariDiziOlarakDon(int[][] dizi) {
		int sayac = 0;
		int[] ciftSayilar = new int[0];
		int index=0;

		try {
			for (int i = 0; i < dizi.length; i++) {
				for (int j = 0; j < dizi[i].length; j++) {
					if(dizi[i][j] % 2 != 0) {
						sayac++;
					}
				}
			}
			ciftSayilar = new int[sayac];
			for (int i = 0; i < dizi.length; i++) {
				for (int j = 0; j < dizi[i].length; j++) {
					if(dizi[i][j] % 2 != 0) {
						ciftSayilar[index++] = dizi[i][j];
					}
				}
			}
		}
		catch (Exception e) {
	
			System.out.println("Bilinmeyen hata olustu "+e.getMessage());
		}
		finally {
			System.out.println("her durumurunda calisir");
		}
		return ciftSayilar;
		
	}
	
	public static boolean disardanGelenDegeriKontrolEt(int[][] dizi,int deger) {
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				if(dizi[i][j] == deger) {
					return true;
				}
			}
		}
		return false;
		
	}

}
