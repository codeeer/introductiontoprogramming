package com.medipol.functions;

import java.util.Iterator;
import java.util.Scanner;

public class RecursiveMethod {

	public static int topla(int a) {
		if (0 <= a)// kosulumuzu belirttik.
		{
			return (a + topla(a - 1));// geriye d�nd�rme islemimizi yaptik
		} else {
			return 0;
		}
	}
	
	public static int recursiveTopla(int deger) {
		if(deger <= 0) {
			return 0;
		}
		else {
			return (deger + recursiveTopla(deger -1));
		}
	}
	public static int normalTopla(int deger) {
		int toplam = 0;
		while(deger > 0)
		{
			toplam += deger;
			deger--;
		}
		return toplam;
	}

	public static int topla2(int a) {
		if(a == 1) {
			return 1;
		}
		else {
			return (a+ topla2(a - 1) );
		}

	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Klavyeden sayi giriniz");
		int n = scanner.nextInt();// klavyeden sayi istedik.
		//int sonuc = sayilariTopla(n);
		int sonuc = toplama(n);
		System.out.println("Girilen sayidan 1'e kadar olan sayilar toplami = " + sonuc);
	}
	
	public static int toplama(int a) {
		
		if( a == 1)
		{
			return 1;
		}
		else{
			return (a +topla (a-1));
		}
	}
	public static int ozyinlemesiz(int a) {
		
		int toplam = 0;
		for (int i = 1; i <= a; i++) {
			toplam += i;
		}
		return toplam;
	}
	
	public static int sayilariTopla(int n) {
		
		if(n == 1) {
			return 1;
		}
		else {
			return n + sayilariTopla(n-1);
		}
	}

	public static int sayilariDonguIleTopla(int n) {
		
		int toplam = 0;
		for (int i = 1; i < n; i++) {
			toplam += i;
		}
		return toplam;
	}
	
	
	
	
	
	
}
