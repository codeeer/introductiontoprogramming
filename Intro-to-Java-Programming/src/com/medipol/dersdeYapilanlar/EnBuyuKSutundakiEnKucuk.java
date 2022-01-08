package com.medipol.dersdeYapilanlar;

public class EnBuyuKSutundakiEnKucuk {

	public static void main(String[] args) {
		double[][] matris = { { 56, 23, 678, 231 }, 
				{ 234, 21, 78, 23 }, 
				{ 654, 33, 22, 67 }, 
				{ 189, 35, 56, 89 } 
				};
	
		int i, j, enBuyuElemaninOlduguSutun;
		enBuyuElemaninOlduguSutun = 0;
		double enBuyuk, enKucuk;
		enBuyuk = matris[0][0];
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (matris[i][j] > enBuyuk) {
					enBuyuk = matris[i][j];
					enBuyuElemaninOlduguSutun = j;
				}

				System.out.print("[" + i + "][" + j + "]=" + matris[i][j] + "\t");
			}
			System.out.println();
		}
		enKucuk = matris[0][enBuyuElemaninOlduguSutun];
		for (i = 0; i <= 3; i++) {
			if (matris[i][enBuyuElemaninOlduguSutun] < enKucuk) {
				enKucuk = matris[i][enBuyuElemaninOlduguSutun];
			}
		}
		System.out.println("En buyuk elemanin bulundugu sutundaki en kucuk sayi " + enKucuk);

	}

}
