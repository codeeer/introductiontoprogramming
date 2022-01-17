package com.medipol.exercises.arrays;

public class SummaryArrays {

	
	public static void main(String[] args) {
		
		int j = 0;
	
		int[] ogrenciNotlari2 = {80,70,50,80,100,100};
		int ortalama = 0;
		System.out.println(ogrenciNotlari2.length);
		int degisken = ogrenciNotlari2[ogrenciNotlari2.length-1];
		
		ortalama = 0;
		while(j < ogrenciNotlari2.length) {
			ortalama += ogrenciNotlari2[j++];
		}
		ortalama = ortalama / ogrenciNotlari2.length;
		
		for (int i = 0; i < ogrenciNotlari2.length; i++) {
			if(ogrenciNotlari2[i] == 80) {
				ogrenciNotlari2[i] += 10;
			} // if in parantezi
		}//for un parantezi
		int methoddanGelenOrtalama = ortalamaBul(ogrenciNotlari2);
		System.out.println(methoddanGelenOrtalama);
		

	}// main methodunun kapandigi suslu parantez
	
	private static int ortalamaBul(int[] dizi) {
		int ortalama = 0;
		if(dizi.length < 1) {
			return 0;
		}
		for (int i = 0; i < dizi.length; i++) {
			ortalama += dizi[i];
		}
		ortalama = ortalama / dizi.length;
		return ortalama;
	}

}// class in parantezi


