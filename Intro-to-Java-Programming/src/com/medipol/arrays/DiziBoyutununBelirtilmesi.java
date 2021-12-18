package com.medipol.arrays;

import java.util.Scanner;

public class DiziBoyutununBelirtilmesi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int DIZI_BOYUT = 5;
        int[] sayi;
        sayi = new int[DIZI_BOYUT];
        int toplam = 0;
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.print(i + ". dizi elemanini giriniz: ");
            sayi[i] = giris.nextInt();
            toplam = toplam + sayi[i];
        }
        System.out.println("Toplam: " + toplam);
    }
}
