package com.medipol.arrays;

public class FonksiyonParametresDizi {

    public static void main(String[] args) {
        int[] a = {2, 8, 3, 7, 5};
        int toplam;
        toplam = topla_dizi(a, 5);
        System.out.println("Toplam: " + toplam);
    }

    static int topla_dizi(int[] x, int n) {
        int i, ictoplam;
        ictoplam = 0;
        for (i = 0; i < n; i++) {
            ictoplam += x[i];
        }
        return ictoplam;
    }
}
