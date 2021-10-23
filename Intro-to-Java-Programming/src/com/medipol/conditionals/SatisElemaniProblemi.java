package com.medipol.conditionals;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SatisElemaniProblemi {

	/*
	 * Bir satış elemanının sattığı ürün miktarına göre alacağı günlük ücret aşağıdaki gibi belirleniyor:
	- Günlük satış miktarı 50 adetten az ise 15 TL tutarındaki sabit ücrete, satılan ürün başına 1 TL değerinde prim eklenerek günlük ücret belirlenir.
	- Günlük satış miktarı 50 adet ya da daha fazla ise, bu durumda günlük sabit ücret 15 TL alınarak, satılan ürün başına da ilk 50 adet ürün için 2 TL, 50 adedi aşan kısım için de 3 TL prim verilerek günlük ücret belirlenir.
	Bir satıcının günlük satış miktarı bilgisayara girildiğinde satıcının alacağı günlük ücreti hesaplayan bir Java programı yazınız.
	 */
	public static void main(String args[]) throws IOException {
		Scanner giris = new Scanner(System.in);
		double satis, ucret; // DecimalFormat tipiyle özel biçimlerde sayılar gösterebilirsiniz.
		DecimalFormat nf = new DecimalFormat("###,###.00");
		System.out.println("Gunluk kac tane urun satiyorsunuz? ");
		satis = giris.nextDouble();
		if (satis < 50) {
			ucret = 15.0 + satis * 1.0;
		} else {
			ucret = 15.0 + 50 * 2.0 + (satis - 50) * 3.0;
		}
		System.out.println("Buna gore gunluk ucretiniz: " + nf.format(ucret) + " TL");
	}

}
