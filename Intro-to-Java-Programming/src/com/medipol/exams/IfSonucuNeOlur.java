package com.medipol.exams;

public class IfSonucuNeOlur {

	public static void main(String[] args) {
		int sinav1 = 30;
		int sinav2 = 50;
		float ortalama = (float) (sinav1 + sinav2) / 2;
		String sonuc;
		if (ortalama < 45) {
			sonuc = "Zayif";
		}
		if (ortalama < 55) {
			sonuc = "Gecer";
		}
		if (ortalama < 70) {
			sonuc = "Orta";
		}
		if (ortalama < 85) {
			sonuc = "Iyi";
		} else {
			sonuc = "Pekiyi";
		}
		System.out.println(sonuc);
	}

}
