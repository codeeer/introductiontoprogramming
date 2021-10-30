package com.medipol.loops;

public class ForDikUcgen {

	public static void main(String[] args) {

		int i, k;// Değişkenlerimizi tanımladık.
		int sembol = 1;// Yıldızımızın program başlangıçında, kaç tane yıldız yazdıracağını belirtiriz.

		for (k = 0; k < 9; k++) {// Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
			for (i = 0; i < sembol; i++) {// Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
				System.out.print("*");// Sembolümüzü belirttik.
			}
			System.out.println("");// Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
			sembol++;// Yıldızımızın birer birer artmasını sağlarız.
		}
	}

}
