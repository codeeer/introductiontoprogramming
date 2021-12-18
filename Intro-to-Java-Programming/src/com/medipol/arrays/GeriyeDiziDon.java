package com.medipol.arrays;

public class GeriyeDiziDon {

    public static int[] arttir(int baslangic) {
        int elemanSayisi = ((100-baslangic)/2)+1;
        int[] dizi = new int[elemanSayisi];
        for(int i=baslangic, j=0; i<=100; i+=2, j++) {
            dizi[j] = i;
        }
        return dizi;
    }

    public static void main(String[] args) {
        int[] sayilarim = arttir(52);
        for(int i=0; i<sayilarim.length; i++) {
            System.out.print(sayilarim[i]+"-");
        }
    }
}
