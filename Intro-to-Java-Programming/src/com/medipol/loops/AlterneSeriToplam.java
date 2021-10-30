package com.medipol.loops;

public class AlterneSeriToplam {

	public static void main(String args[]) {

		// 1.2/(3.4) ­ 5.6/(7.8) + 9.10/(11.12) ­ 13.14/(15.16) şeklindeki alterne
		// seri toplamını hesaplayalım. (Yukardaki ifadede "." sembolü çarpma işlemi
		// anlamındadır.)

		int i, p;
		double x, s;
		s = 0;
		p = 1;
		x = 1.0;
		for (i = 1; i <= 4; i++) {
			s = s + (x * (x + 1)) / ((x + 2) * (x + 3)) * p;
			System.out.println(s);
			x = x + 4;
			System.out.println(x);
			p = -p;
			System.out.println(p);
		}
		System.out.println("Toplam= " + s);

		/*
		 * AÇIKLAMA:
		 * 
		 * Sadece 4 terim olduğu için for döngüsü 1’den 4’e kadar çalıştırıldı. İlk
		 * terim 1.2/ (3.4) ve ikinci terim 5.6/(7.8) olduğu için, x değişkeninin ilk
		 * terimdeki ilk sayıyı temsil ettiği durumda, terimi x.(x+1)/((x+2).(x+3))
		 * şeklinde ifade edebiliriz. x yerine 1 koyarak bu durum kolayca
		 * kanıtlayabiliriz. İkinci terimde ilk sayı 5, üçüncü terimde ilk sayı 9
		 * olduğuna göre x her seferinde 4 arttırılmalıdır. Bunu da programda x=x+4;
		 * deyimiyle gerçekleştiriyoruz. Bu terimi x+=4; şeklinde de yazabiliriz.
		 * 
		 * Seri alterne seri olduğuna göre, yani terimlerin işaretleri +,–,+,– şeklinde
		 * değiştiğine göre, p değişkeni yardımıyla terimlerin işaretlerini
		 * ayarlayabiliriz. p önce 1 olarak atanır. Sonra döngü içine konulan p=–p;
		 * ifadesi ise bir sonraki işareti –, bir sonrakini + ve onu izleyeni – yapar.
		 * (Programı kâğıt üzerinde adım adım izleyelim).
		 */
	}

}
