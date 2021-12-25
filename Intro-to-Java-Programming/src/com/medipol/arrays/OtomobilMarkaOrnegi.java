package com.medipol.arrays;

public class OtomobilMarkaOrnegi {
	
	public static void main(String[] args) {
		int[][] satisTablosu = new int[][] { { 700, 600, 650 }, { 900, 800, 700 }, { 300, 400, 350 }, { 500, 450, 470 },
				{ 600, 500, 480 } };
		int i, j, toplamSatis, toplamOtomobilSayisi = 0;

		/*
		 * bellekteki satisTablosu dizisinin elemanlarının ekrana yazdırılması
		 */
		dizininElemanlariniYazdir(satisTablosu);

		/*
		 * Her marka için 3 aylık satış toplamlarını yani dizinin satır toplamlarını
		 * yazdıralım
		 */
		dizininSatirToplamlariniYazdir(satisTablosu);

		/*
		 * Her ay için 5 markanın satış toplamlarını yani tablodaki sütunların
		 * toplamlarını gösterelim
		 */
	
		System.out.println();
		dizininSutunToplamlariniYazdir(satisTablosu);

		/* 3 AY ICIN TOPLAM OTOMOBIL SATISI-GENEL TOPLAM */
		System.out.println("3 aylik toplam otomobil satisi" + dizininElemanlariniTopla(satisTablosu));
	}

	/*
	 * bellekteki satisTablosu dizisinin elemanlarının ekrana yazdırılması
	 */
	public static void dizininElemanlariniYazdir(int[][] dizi) {

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	 * Her marka için 3 aylık satış toplamlarını yani dizinin satır toplamlarını
	 * yazdıralım
	 */

	private static void dizininSatirToplamlariniYazdir(int[][] dizi) {
		int toplamSatis = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplamSatis = 0;
			for (int j = 0; j < dizi[0].length; j++) {
				toplamSatis = toplamSatis + dizi[i][j];
			}
			System.out.println(i + 1 + ". markanin toplam satisi: " + toplamSatis);
		}
	}

	static void dizininSutunToplamlariniYazdir(int[][] dizi) {
		int toplamOtomobilSayisi = 0;
		int toplamSatis = 0;
		for (int j = 0; j < dizi[0].length; j++) {
			toplamSatis = 0;
			for (int i = 0; i < dizi.length; i++) {
				toplamSatis = toplamSatis + dizi[i][j];
				toplamOtomobilSayisi = toplamOtomobilSayisi + dizi[i][j];
			}
			System.out.println(j + 1 + ". ayda 5 marka icin toplam satis miktari: " + toplamSatis);
		}
	}
	
	public static int dizininElemanlariniTopla(int[][] dizi) {
		int toplam = 0;
		
		for(int i = 0; i< dizi.length;i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				toplam += dizi[i][j];
			}

		}
		return toplam;
	}

}
