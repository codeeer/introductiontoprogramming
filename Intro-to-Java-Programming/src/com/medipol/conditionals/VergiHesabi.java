package com.medipol.conditionals;

import java.util.Scanner;

public class VergiHesabi {
	/*
	 * Bu örnekte basit bir vergi hesabı programı geliştirmek istiyoruz.  Gelir vergisinin aşağıdaki kurallara göre belirlendiğini varsayalım:
		Gelir ≤ 150,000,000 ise vergi oranı %25 
		Gelir ≤ 300,000,000 ise vergi oranı %30 
		Gelir ≤ 600,000,000 ise vergi oranı %35 
		Gelir ≤ 1,200,000,000 ise vergi oranı %40 
		Gelir > 1,200,000,000 ise vergi oranı %50
		Bu problemi Java dilinde programlayabilmek için aşağıdaki basit algoritmayı uygulayacağız:
		
		1. Gelir bilgisi klavyeden girilecek.
		2. Gelir bilgisi, yukardaki vergi hesaplama kurallarına göre kontrol edilerek vergi hesaplanacak.
		3. Hesaplanan vergi ekrana yazdırılacak.
	 */

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
        double gelir, v, v1, v2, v3, v4;
        System.out.println("Gelir miktarınız (TL): ");
        gelir = giris.nextDouble();
        v1 = 150000000 * 0.25;
        v2 = 150000000 * 0.30;
        v3 = 300000000 * 0.35;
        v4 = 600000000 * 0.40;
        if (gelir <= 150000000)
            v = gelir * 0.25;
        else if (gelir <= 300000000)
            v = v1 + (gelir - 150000000) * 0.3;
        else if (gelir <= 600000000)
            v = v1 + v2 + (gelir - 300000000) * 0.35;
        else if (gelir <= 1200000000)
            v = v1 + v2 + v3 + (gelir - 600000000) * 0.4;
        else
            v = v1 + v2 + v3 + v4 + (gelir - 1200000000) * 0.5;
        System.out.println("Odemeniz gereken vergi: " + v);

	}

}
