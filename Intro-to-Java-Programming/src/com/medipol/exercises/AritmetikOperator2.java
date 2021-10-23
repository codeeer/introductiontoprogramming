package com.medipol.exercises;

public class AritmetikOperator2 {

	public static void main(String[] args) {

		int toplam = 0, fark = 0, çarpım = 0, modulo = 0;
		float bölüm = 0; // bölümün sonucu
		int sayı1 = 10, sayı2 = 2; // işleme giren sayılar
		toplam = sayı1 + sayı2;
		fark = sayı1 - sayı2;
		çarpım = sayı1 * sayı2;
		bölüm = sayı1 / sayı2;
		modulo = 3 % sayı2; // 3/2 nin kalanı
		System.out.format("sayı1 = %d , sayı2 = %d ", sayı1, sayı2);
		System.out.println();
		System.out.format("%d + %d = %d %n", sayı1, sayı2, toplam);
		System.out.format("%d - %d = %d %n", sayı1, sayı2, fark);
		System.out.format("%d * %d = %d %n", sayı1, sayı2, çarpım);
		System.out.format("%d / %d = %f %n", sayı1, sayı2, bölüm);
		System.out.println();
		System.out.format("3 sayısı %d ile bölününce  %d  kalır ", sayı2, modulo);
	}

}
