package com.medipol.arrays;

public class DizilerReferansTip {

    public static void main(String[] args) {
        int[] aDizisi = {10,20,30};
        int[] bDizisi = aDizisi;

        bDizisi[2] = 100;

        System.out.println(aDizisi[2]);
        System.out.println(bDizisi[2]);
    }
}
