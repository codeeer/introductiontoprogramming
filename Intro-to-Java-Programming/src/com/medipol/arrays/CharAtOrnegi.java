package com.medipol.arrays;

import java.io.StringReader;

public class CharAtOrnegi {

    public static void main(String args[]){
        String s = "Welcome!";

        char ch = s.charAt(3);
        System.out.println(ch);
        System.out.println(charAtOrnek(s,3));
    }

    public static char charAtOrnek(String str,int index){
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr[index];
    }
}
