package com.medipol.conditionals;

public class IciceIf {

	public static void main(String[] args) {

		int sinav1 = 45;
		int sinav2 = 50;
		int sinav3 = 66;
		// ortalama'yı float olarak alıyoruz.
		float ortalama = (float) (sinav1 + sinav2 + sinav3) / 3;
		String sonuc;
		if (ortalama < 45) {
			// 0-44 arası ortalama zayıf
			sonuc = "Zayif";
		} else if (ortalama < 55) {
			// 45-54 arası ortalama geçer
			sonuc = "Gecer";
		} else if (ortalama < 70) {
			// 55-69 arası ortalamaya orta
			sonuc = "Orta";
		} else if (ortalama < 85) {
			// 70-84 arası ortalamaya iyi
			sonuc = "Iyi";
		} else {
			// başka bir sonuç kalmadığı için tekrar
			// if ile şart aramıyoruz
			sonuc = "Pekiyi";
		}
		System.out.println("Ortalama: " + ortalama);
		System.out.println("Buna gore sonuc: " + sonuc);

	}

}
