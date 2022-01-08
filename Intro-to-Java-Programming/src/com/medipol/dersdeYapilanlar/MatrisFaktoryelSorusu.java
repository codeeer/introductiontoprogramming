package com.medipol.dersdeYapilanlar;

import java.util.Arrays;

public class MatrisFaktoryelSorusu {

	public static void main(String[] args) {
		
		long[][] dizi = new long[3][3]; 
		
		int ilkDeger = 2;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				dizi[i][j] = faktoryelHesapla(ilkDeger);
				ilkDeger +=2;
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static long faktoryelHesapla(int sayi) {
		long sonuc = 1;
		for(int i=1; i <= sayi;i++) {
			sonuc *= i;
			
		}
		return sonuc;
	}

}
