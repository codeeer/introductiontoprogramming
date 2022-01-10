package com.medipol.dersdeYapilanlar;

import java.util.Arrays;

public class CokBoyutluDiziEnBuyugunEnKucukElemaniBul {

	public static void main(String[] args) {
		   double[][] matris={
		            {56,23,678,231},
		            {234,21,78,23},
		            {654,33,22,67},
		            {189,35,56,89}
		    };
		System.out.println(sutundakiEnKucukSayiyiBul(matris,enBuyukElemaninOlduguSutunuDon(matris)));
		
		 int[][] matris2={
		            {56,23,678,231},
		            {234,21,78,26},
		            {654,33,32,67},
		            {189,35,56,89}
		    };
		System.out.println(enKucuk2Eleman(matris2));
		
		  int[][] matris3={
		            {56,23,678,231},
		            {234,21,78,26},
		            {654,33,32,67},
		            {189,35,56,89}
		    };
		
		int[] dizi = tekOlanSayilariDiziOlarakDon(matris3);
		
		System.out.println(Arrays.toString(dizi));
		
	}
	
	public static int[] tekOlanSayilariDiziOlarakDon(int[][] dizi)
	{
		int count = 0;
		int k = 0;
		int[] sonuc;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				if(dizi[i][j] %2 != 0 ) {
					count++;
				}
				
			}
		}
		sonuc = new int[count];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[i][j] %2 != 0 ) {
					sonuc[k] = dizi[i][j];
					k++;
				}
			}
		}
		
		return sonuc;
		
	}
	
	public static int enKucuk2Eleman(int[][] dizi) {
		int enKucukEleman = dizi[0][0];
		int satir=0,sutun=0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				if(enKucukEleman > dizi[i][j])
				{
					enKucukEleman = dizi[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
		dizi[satir][sutun] = 1000000;
		enKucukEleman = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				if(enKucukEleman > dizi[i][j])
				{
					enKucukEleman = dizi[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
		System.out.println(++satir + ". satirin "+ ++sutun + ". sutunundadir");
		return enKucukEleman;
		
	}
	
	public static int enBuyukElemaninOlduguSutunuDon(double[][] parametreDizi) {
		double enBuyukSayi = parametreDizi[0][0];
		int sutun = 0;
		for (int i = 0; i < parametreDizi.length; i++) {
			for (int j = 0; j < parametreDizi[0].length; j++) {
				if(enBuyukSayi < parametreDizi[i][j]) {
					enBuyukSayi = parametreDizi[i][j];
					sutun = j;
				}
			}
		}
		
		return sutun;
	}
	
	public static int sutundakiEnKucukSayiyiBul(double[][] parametreDizi,int sutun) {
		
		double enKucukSayi = parametreDizi[0][sutun];
		
		for (int i = 0; i < parametreDizi.length; i++) {
			if(enKucukSayi > parametreDizi[i][sutun])
			{
				enKucukSayi = parametreDizi[i][sutun];
			}
		}
		return (int) enKucukSayi;
	}

}
