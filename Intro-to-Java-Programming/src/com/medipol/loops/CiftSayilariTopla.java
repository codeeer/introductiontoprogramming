package com.medipol.loops;

import java.util.Scanner;

public class CiftSayilariTopla {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int toplam = 0;
		System.out.println("Kaca kadar olan cift sayilarin toplamini istiyorsunuz: ");
		int deger = scan.nextInt();
		int i = 0;
		while (i < deger) {
			if (i % 2 == 0) {
				toplam += i;
			}
			i++;
		}
		System.out.printf("%d e kadar olan cift sayilar toplami: %d", deger, toplam);
	}

	/*
	 * 
	 * do{ if(i%2==0){ toplam=toplam+i; } i++; } while(i<=13);
	 * System.out.println("13'e kadar olan çift sayıların toplamı "+ toplam +
	 * "'dir.");
	 */

}
