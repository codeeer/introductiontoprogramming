package com.medipol.exam2;

public class IfSorusu2 {

	public static void main(String[] args) {

		int sinav1 = 30;

		int sinav2 = 50;

		float ortalama = (float) (sinav1 + sinav2) / 2;

		String sonuc;

		if (ortalama < 45) {

			sonuc = "Orta";

		}

		if (ortalama < 55) {

			sonuc = "Iyi";

		}

		if (ortalama < 70) {

			sonuc = "CokIyi";

		}

		else if (ortalama < 85) {

			sonuc = "Pekiyi";

		} else {

			sonuc = "Harika";

		}

		System.out.println(sonuc);

	}

}
