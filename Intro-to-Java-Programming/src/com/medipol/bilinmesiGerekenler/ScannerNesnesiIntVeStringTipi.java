package com.medipol.bilinmesiGerekenler;

import java.util.Scanner;

public class ScannerNesnesiIntVeStringTipi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		
		System.out.println("Lutfen ilk tamsayi giriniz : ");
		int n = giris.nextInt();
		
		System.out.println("Lutfen ikinci tamsayi giriniz : ");
		int m = giris.nextInt();

		giris.nextLine();// Bunun nedeni, nextInt() yürütmesini bitirdikten sonra, nextLine() yöntemi
							// çağrıldığında, nextInt()'den sonra mevcut olan yeni satır karakterini tarar.
		// Eklemeniz gereken yukaridaki satir (\n karakterini tüketir)
		System.out.println("Lutfen adinizi giriniz : ");
		String ad = giris.nextLine();
		
		
		System.out.println("Lutfen 3 tamsayi giriniz : ");
		int z = giris.nextInt();
		
		int toplam = n + m+z;
		
		System.out.print("Toplami yapan kisinin adi: " + ad + " sonucu: " +toplam);
	}

}
