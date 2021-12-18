package com.medipol.arrays;

public class DiziBaslangicDegeriAtamak {

    public static void main(String[] args) {
        int[] sayi = {2, 1, 5, 3, 6};
        double toplam = 0;
        int i;
        for (i = 0; i <= 4; i++) {
            toplam = toplam + sayi[i];
        }
        System.out.println("Toplam: " + toplam);
    }

}
