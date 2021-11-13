package com.medipol.test;
import java.util.Scanner;

public class OrtHesapla {

	public static void main(String[] args) {
		
		Scanner kullaniciDegerAl = new Scanner(System.in);
		
		System.out.println("Ogrenci numarasini giriniz");
		int ogrenciNumarasi = kullaniciDegerAl.nextInt();
		
		System.out.println("Ad soyad giriniz");	
		kullaniciDegerAl = new Scanner(System.in); 
		String adSoyad = kullaniciDegerAl.nextLine();
		
		System.out.println("Vize notunu giriniz");	
		int vizeNotu = kullaniciDegerAl.nextInt();
		
		System.out.println("Final notunu giriniz");
		int finalNotu = kullaniciDegerAl.nextInt();
		
		double ortalama = (vizeNotu*0.3) + (finalNotu*0.7);
		
		System.out.printf("Adi %s olan ogrenci numarasi %d olan kisinin not ortalamasi %f"
				,adSoyad,ogrenciNumarasi,ortalama);
		

	}

}
