package com.medipol.arrays;

public class StringToCharDizi {

    public static void main(String[] args) {
        String test = "deneme olsun";
        int index =test.indexOf(" ");
        String subTest=test.substring(0, index);
        System.out.println(subTest);
        System.out.println(index);
        System.out.println(test.length());
        System.out.println(stringUzunlugu(test));
        char[] sonuc =charArray(test);
        for (int i = 0; i < sonuc.length; i++) {
            System.out.print(sonuc[i]);
        }
    }
    
    public static int stringUzunlugu(String input) {
    	return input.length();
    }
    
    public static char[] charArray2(String str) {
    	char[] arr = new char[str.length()];
    	for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
    	return arr;
    }
    
    public static char[] charArray(String str){
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}
