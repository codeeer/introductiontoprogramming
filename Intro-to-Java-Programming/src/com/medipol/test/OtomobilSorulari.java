package com.medipol.test;

public class OtomobilSorulari {

	public static void main(String[] args) {
		
		 int[][] satisTablosu = new int[][]{
             {700, 600, 650},
             {900, 800, 700},
             {300, 400, 350},
             {500, 450, 470},
             {600, 500, 480}
     };
     
     satirlarinToplaminiEkranaYaz(satisTablosu);
     sutunlarinToplaminiEkranaYaz(satisTablosu);
     elemanlarinToplaminiEkranaYaz(satisTablosu);
	}
	
	public static void sutunlarinToplaminiEkranaYaz(int [][] dizi) {
		
		int toplam = 0;
		for (int j = 0; j < dizi[0].length; j++) {
			
			for (int i = 0; i < dizi.length; i++) {
				toplam += dizi[i][j];
			}
			System.out.println("dizinin "+ j + ". ci sutunun toplami "+toplam);
			toplam = 0; 
		}
	}
	
	public static void satirlarinToplaminiEkranaYaz(int[][] dizi) {
		
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			
			for (int j = 0; j < dizi[0].length; j++) {
				toplam += dizi[i][j];
			}
			System.out.println("dizinin "+i+" . satiri toplami "+ toplam);
			toplam = 0;
		}
	}
	
	public static void elemanlarinToplaminiEkranaYaz(int[][] dizi) {
		
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				toplam += dizi[i][j];
			}
		}
		System.out.println(toplam);
	}
}
