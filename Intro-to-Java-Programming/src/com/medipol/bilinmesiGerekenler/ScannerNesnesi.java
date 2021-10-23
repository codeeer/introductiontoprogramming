package com.medipol.bilinmesiGerekenler;

import java.util.Scanner;

public class ScannerNesnesi {

	/*
	 * import Java’da dahil etmek anlamında kullanılmaktadır. 
	 * Bizde import anahtar kelimesini kullanarak programımıza farklı kütüphaneler ve classlar dahil edebiliriz.
	 * Scanner icin import java.util.Scanner; eklenmelidir yukaridaki gibi.
	 */
	/*
	 * Aşağıdaki program klavyeden girilen bir satırlık metni (text) okur ve ekrana
	 * yazar. Bunun için Scanner(InputStream source) kurucusunu kullanıyor.
	 * InputStream tipinden olan source olarak System.in değişkeni kullanılıyor. Bu
	 * değişken standart giriş akımıdır  (klavye). Kullanilabilecek methodlari
	 * 
	 * Atama hangi tip icin yapilacak ise o method kullanilir.
	 * 
	 * nextLine() -> String
	 * 
	 * nextInt() -> int
	 * 
	 * nextByte() -> byte
	 * 
	 * nextFloat -> float
	 * 
	 * nextDouble -> double
	 */
	public static void main(String[] args) {
		
		/*
		 * Kullanicidan 2 sayi al ve bu sayilari topla
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ilk tamsayıyı giriniz : ");
		int n = scan.nextInt();
		System.out.println("Lütfen ikinci tamsayıyı giriniz : ");
		int m = scan.nextInt();
		System.out.print(n + m);
	}

}
