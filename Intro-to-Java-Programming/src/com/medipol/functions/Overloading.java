package com.medipol.functions;

public class Overloading {
	
	
 
	public static double toplama(double sayi1, double sayi2) {
        double sonuc = sayi1 + sayi2;
        return sonuc;
    }
	
	public static int toplama(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }
	
 
    public static void main(String[] args) {
        int tamSayi = toplama(5, 6);
        System.out.println("5 + 6 = " + tamSayi);
 
        double kusurluSayi = toplama(5.5, 6.5);
        System.out.println("5.5 + 6.5 = " + kusurluSayi);
    }

}
