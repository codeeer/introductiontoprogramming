package com.medipol.dersdeYapilanlar;

public class CokBoyutluDizilerFaktoryel {

	public static void main(String[] args) {
		
		long[][] faktoryelDizisi = new long[3][3];
		int baslangicDegeri = 2;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				faktoryelDizisi[i][j] = faktoryelHesapla(baslangicDegeri);
				baslangicDegeri +=2;
				System.out.printf(faktoryelDizisi[i][j] + " ");
			}// j in oldugu for un kapanisi
			System.out.println();
		} // i nin forunun kapanisi
		
	} // main methodunun bitisi
	
	public static long faktoryelHesapla(long sayi) {
		long sonuc = 1;

		for (int i = 2; i <= sayi; i++) {
			sonuc *= i;
		}
		return sonuc;
	}

}
