package com.medipol.dersdeYapilanlar;

public class CokBoyutluDiziEnKucukEnBuyukElemaniniBul {

	public static void main(String[] args) {
		
	double[][] dizi = new double[][]{
            {34, 11, -7, 53},
            {254, 8, -65, 4},
            {110, 64, 33, 26}
    };

    
    System.out.println("En kucuk elemani "+ enKucukElemaniBul(dizi));
    System.out.println("En buyu elemani "+ enBuyukElemaniBul(dizi));
	
	}
	
	public static double enKucukElemaniBul(double[][] parametreDizi) {
		 
		double enKucukEleman = parametreDizi[0][0];
		for(int i = 0; i < parametreDizi.length; i++) {
			for(int j = 0; j< parametreDizi[i].length;j++) {
				if(enKucukEleman > parametreDizi[i][j]) {
					enKucukEleman = parametreDizi[i][j];
				
				} // if in kapanis blogu
			
			}// j de ki forun kapanis blogu
		
		}	// i de ki for un kapanis blogu	
		return enKucukEleman;
		
	}
	
	public static double enBuyukElemaniBul(double[][] parametreDizi) {
		double enBuyukEleman = parametreDizi[0][0];
		for(int i = 0; i < parametreDizi.length; i++) {
			for(int j = 0; j< parametreDizi[i].length;j++) {
				if(enBuyukEleman < parametreDizi[i][j]) {
					enBuyukEleman = parametreDizi[i][j];
				
				} // if in kapanis blogu
			
			}// j de ki forun kapanis blogu
		
		}	// i de ki for un kapanis blogu	
		return enBuyukEleman;
		
	}
	
	
	

}
