package com.medipol.exercises.karisik;

import java.util.Arrays;
import java.util.Random;

public class Quiz7 {
/*
 * Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm
 *  elemanların ortalamasını alacak programı geliştirin.
 *  Programı yazarken aşağıdaki özelliklere uygun yazınız.
Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin. 
Sabit elemanlı bir dizi vermeyin!
Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın.
İçine diziyi girdi (input) olarak alsın.
Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. 
(return) etsin.
 */
	
	public static void main(String[] args) {
		int[] sayilar = new int[100];
		for (int i = 0; i < sayilar.length; i++) {
			Random rand = new Random();
			int sayi = rand.nextInt(100);
			sayilar[i] = sayi;
		}
		double ort = ortalama(sayilar);
		System.out.println("ortalama "+ort);
	}
	
	public static double ortalama(int [] dizi) {
		double toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		System.out.println(Arrays.toString(dizi));
		return toplam / dizi.length;
	}
}
