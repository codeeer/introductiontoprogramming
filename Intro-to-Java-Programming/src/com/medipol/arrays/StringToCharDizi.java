package com.medipol.arrays;

public class StringToCharDizi {

    public static void main(String[] args) {
        String test = "deneme";
        char[] sonuc =charArray(test);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }
    public static char[] charArray(String str){
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}
