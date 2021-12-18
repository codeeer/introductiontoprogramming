package com.medipol.arrays;

import java.util.Scanner;

public class SayilariTopla {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        // int sayi[] = new int[6]; c de dizi tanimi
        int[] sayi = new int[6];
        int toplam, i;
        toplam = 0;
        for (i = 1; i <= 5; i++) {
            System.out.print("Bir sayi giriniz: ");
            sayi[i] = giris.nextInt();
            toplam = toplam + sayi[i];
        }
        System.out.println("Girdiniz sayilarin toplami: " + toplam);
        System.out.println("Sayi dizisinin ikinci elemani: " + sayi[2]);
    }
}
