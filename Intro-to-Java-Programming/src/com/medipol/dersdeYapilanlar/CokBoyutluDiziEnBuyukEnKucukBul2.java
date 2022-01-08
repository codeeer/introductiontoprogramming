package com.medipol.dersdeYapilanlar;

public class CokBoyutluDiziEnBuyukEnKucukBul2 {

	public static void main(String[] args) {
	    
	double[][] matris = new double[][]{
            {34, 11, -7, 53},
            {254, 8, -65, 4},
            {110, 64, 33, 26} };
    
    System.out.println(enBuyukElemaniBul(matris));
    
    System.out.println(enKucukElemaniBul(matris));
    System.out.println(satirdakiEnKucukDeger(matris, 2));

	}
	
	public static double satirdakiEnKucukDeger(double[][] arr,int satir) {
		
		double enKucukDeger = arr[satir][0];
		for (int i = 0; i < arr[satir].length; i++) {
			if(enKucukDeger > arr[satir][i])
			{
				enKucukDeger = arr[satir][i];
			}
		}
		return enKucukDeger;
	}
	
	public static double enKucukElemaniBul(double[][] arr) {
		double enKucukSayi = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(enKucukSayi > arr[i][j])
				{
					enKucukSayi = arr[i][j];
				}
			}
			
		}
		
		return enKucukSayi;
	}
	
	public static double enBuyukElemaniBul(double [][] deneme) {
		
		double enBuyukEleman = deneme[0][0];
		
		for (int i = 0; i < deneme.length; i++) {
			for (int j = 0; j < deneme[0].length; j++) {
				if(enBuyukEleman < deneme[i][j]) {
					enBuyukEleman = deneme[i][j];
				}
			}
		}
		return enBuyukEleman;
	}

}
