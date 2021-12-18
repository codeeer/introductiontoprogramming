package com.medipol.arrays;

public class LengthKullanimi {

    public static void main(String[] args) {
        int[] dizi = new int[5];
        System.out.println(dizi.length);
        System.out.println(kendiLenghth(dizi));
    }

    public static int kendiLenghth(int[] dizi) {
        int sum = 0;
        int i = 0;
        while (true) {
            try {
                sum += dizi[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
            i++;
        }
        return i;
    }

}
