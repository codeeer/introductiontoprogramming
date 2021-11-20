package com.medipol.functions;

public class MuhasebeOrnek {

	public static void toplama(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
    }
 
    public static void cikarma(int sayi1, int sayi2) {
        int sonuc = sayi1 - sayi2;
        System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
    }
 
    //eger cikarma isleminde negatif deger cikmasini istemiyorsak
    public static void cikarma2(int sayi1, int sayi2) {
        if(sayi1 > sayi2) {
            int sonuc = sayi1 - sayi2;
            System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
        } else {
            System.out.println(sayi1 + " küçüktür " + sayi2);
            int sonuc = sayi2 - sayi1;
            System.out.println(sayi2 + " - " + sayi1 + " = " + sonuc);
        }
    }
 
    public static void carpma(int sayi1, int sayi2) {
        int sonuc = sayi1 * sayi2;
        System.out.println(sayi1 + " x " + sayi2 + " = " + sonuc);
    }
 
    public static void bolme(int sayi1, int sayi2) {
        int sonuc = sayi1 / sayi2;
        System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
    }
 
    public static void main(String[] args) {
        System.out.println("Toplama");
        toplama(5, 6);
        System.out.println("Çıkarma");
        cikarma(10, 2);
        cikarma2(8, 12);
        System.out.println("Çarpma");
        carpma(5, 6);
        System.out.println("Bölme");
        bolme(10, 2);
    }

}
