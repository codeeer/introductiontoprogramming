package com.medipol.dersdeYapilanlar;

import java.util.Iterator;
import java.util.Scanner;

public class CokBoyutluDiziEnBuyukEnKucukBul {

	public static void main(String[] args) {
		double[][] tablo = new double[][] {
			{ 34, 11, -7, 53 },
			{ 254, 8, -65, 4 }, 
			{ 110, 64, 33, 26 } };
			
		double[][] tablo2 = new double[3][4];
		tablo2[0][0] = 34;
		tablo2[0][1] = 11;
		
		tablo2[2][2] = 33;
			
		System.out.println(enBuyukSayiyiBul(tablo));
		System.out.println(enKucukSayiyiBul(tablo));
		double enKucukDeger = satirdakiEnKucukEleman(tablo);
		System.out.println(enKucukDeger);
	}
	public static double satirdakiEnKucukEleman(double[][] parametreDizi) {
		double enKucukEleman= parametreDizi[0][0];
		Scanner giris = new Scanner(System.in);
		System.out.println("Kacinci sutunun satirlari arasinda ariyorsunuz");
		int sutun = giris.nextInt();
		for (int i = 0; i < parametreDizi.length; i++) {
			if(enKucukEleman > parametreDizi[i][sutun]) {
				enKucukEleman = parametreDizi[i][sutun];
			}
		}
		return enKucukEleman;
	}
	
	public static double enBuyukSayiyiBul(double[][] parametreDizi) {
		
		double enBuyukSayi = parametreDizi[0][0];
		
		for (int i = 0; i < parametreDizi.length; i++) {
		
			for (int j = 0; j < parametreDizi[i].length; j++) {
			
				if(enBuyukSayi < parametreDizi[i][j] ) {
					enBuyukSayi = parametreDizi[i][j];
				} // if in parantezi
			} //j li for un parantezi
			
		}// i li for un parantezi
		
		return enBuyukSayi;
		
	}
	
	static double enKucukSayiyiBul(double[][] parametreDizi) {
		double enKucukSayi = parametreDizi[0][0];
		
		for (int i = 0; i < parametreDizi.length; i++) {
			for (int j = 0; j < parametreDizi[i].length; j++) {
				if(enKucukSayi > parametreDizi[i][j]) {
					enKucukSayi = parametreDizi[i][j];
				}
			}
		}
		return enKucukSayi;
	}
	
}
