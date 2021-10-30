package com.medipol.loops;

public class SayininTamBolenleri {

	public static void main(String[] args) {

		int deger = 60;
		int bolen = 1;
		int tamBolenlerToplami = 0;
		while (bolen <= deger) {
			if (deger % bolen == 0) {
				System.out.println(deger + " sayısı " + bolen + " sayısına tam bölünür.");
				tamBolenlerToplami = tamBolenlerToplami + bolen;
			}
			bolen++;
		}
		System.out.println("\n" + deger + " sayısının tam bölenlerinin toplamı: " + tamBolenlerToplami);
	}

}
