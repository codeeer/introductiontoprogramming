package com.medipol.exercises.arrays;

public class CokBoyutluArrays {

	final static int globalDegisken = 10;
	
	public static void main(String[] args) {
		
		int[][] cokBoyutluDizi= new int[2][3];
		cokBoyutluDizi[0][0] = 12;
		cokBoyutluDizi[0][1] = 13;
		cokBoyutluDizi[0][2] = 14;
		
		cokBoyutluDizi[1][0] = 15;
		cokBoyutluDizi[1][1] = 16;
		cokBoyutluDizi[1][2] = 17;
		
		int[][] cokBoyutluDizilerInitialize
					= {{12,13,14},{15,16,17}};
		
		for (int i = 0; i < cokBoyutluDizilerInitialize.length; i++) {
			
			for (int j = 0; j < cokBoyutluDizilerInitialize[0].length; j++) {
				System.out.print(cokBoyutluDizilerInitialize[i][j] + " ");
			}// sutunlarin for u
			System.out.println();
		}// satirlarin for u kapanisi
		
		int[][] dizi1 = dizileriEkranaYazdir(cokBoyutluDizilerInitialize);
		int toplam = 100;
		ekranaYazdir(5);
	

	} // main methodunun kapanisi
	
	public static int[][] dizileriEkranaYazdir(int[][] dizi){
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}// sutunlarin for u
			System.out.println();
		}// satirlarin for u kapanisi
		int [][] returnDeger = {{1,2,3}};
		returnDeger[0][2] = 5;
	
		return returnDeger;
		
	}// dizileriEkranaYazdir methodunun bitisi
	
	public static int ekranaYazdir(int deger) {
		
		return globalDegisken;
	}

} // class in kapandigi suslu parantez
