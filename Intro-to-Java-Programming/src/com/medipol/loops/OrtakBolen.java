package com.medipol.loops;

import java.util.Scanner;

public class OrtakBolen {

	public static void main(String[] args) {
		int N; // Kullanici tarafindan girilen pozitif bir tam sayi.
		// Bu sayinin bolenleri sayilacak.
		int testDivisor; // 1 ile N arasinda bir sayi
		// N'nin olasi boleni
		int divisorCount; // N'nin bulunan bolenlerinin sayisi.
		int numberTested; // Kaç tane olasi bolen saymak icin kullanilir
		// of N test edildi. numara ne zaman
		// 1000000'e ulasir, bir nokta verilir ve
		// numberTested değeri sifirlanir.
		
		/* Kullanicidan pozitif bir tamsayi alin. */
		Scanner giris = new Scanner(System.in);
		while (true) {
			System.out.println("Pozitif bir tamsayi giriniz: ");
			N = giris.nextInt();
			if (N > 0)
				break;
			System.out.println("Bu sayi pozitif degil. Lutfen tekrar deneyiniz.");
		}
		/* Bir "." yazdirarak bolenleri sayin. her 1000000 testten sonra. */
		divisorCount = 0;
		numberTested = 0;
		for (testDivisor = 1; testDivisor <= N; testDivisor++) {
			if (N % testDivisor == 0) {
				divisorCount++;
			}
			numberTested++;
			if (numberTested == 1000000) {
				System.out.println(".");
				numberTested = 0;
			}
		}
		/* Sonucu goster. */
		System.out.println("Bolen sayisi " + N + " in toplam " + divisorCount +" boleni vardir");
	} // main()'i sonlandir
} // son sinif OrtakBolen
