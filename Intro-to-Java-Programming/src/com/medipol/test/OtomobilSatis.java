package com.medipol.test;

import java.util.Iterator;

public class OtomobilSatis {

	public static void main(String[] args) {
		int [][] satisListesi = { 
				{700, 600, 650},
				{900, 800, 700},
				{300, 400, 350},
	            {500, 450, 470},
	            {600, 500, 480}
				
		};
		/*
         * Her marka için 3 aylık satış toplamlarını
         * yani dizinin satır toplamlarını yazdıralım
         * */

		dizininSatirToplamlariniYazdir(satisListesi);
		
		/*
         * Her ay için 5 markanın satış toplamlarını
         * yani tablodaki sütunların toplamlarını
         * gösterelim
         * */
		dizininSutunToplamlariniYazdir(satisListesi);
		
		dizininTumElemanlariniTopla(satisListesi);
	
	}
	
	public static void dizininSatirToplamlariniYazdir(int[][] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			
			for (int j = 0; j < dizi[i].length; j++) {
				toplam += dizi[i][j];
			}
			System.out.println("Satirlarin toplami: "+toplam);
			toplam = 0;
		}
		
	}
	
	public static void dizininSutunToplamlariniYazdir(int [][] dizi) {
		int toplam = 0;
		
		for (int i = 0; i < dizi[0].length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				toplam += dizi[j][i];
			}
			System.out.println(i+ ". sutun toplami "+toplam);
			toplam = 0;
		}
		
	}
	
	public static void dizininTumElemanlariniTopla(int [][] dizi) {
		
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				toplam += dizi[i][j];
			}
		}
		System.out.println("Toplam "+toplam);
	}
	
	

}
