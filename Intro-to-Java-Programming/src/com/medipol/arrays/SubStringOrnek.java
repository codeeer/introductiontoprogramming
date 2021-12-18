package com.medipol.arrays;

public class SubStringOrnek {

    public static void main(String[] args) {
        String str = "Hello World!";
        str=kendiSubString(str,2,5);
        System.out.println(str);
    }

    public static String kendiSubString(String input,int startFrom,int endBefore){
        String newStr = "";
        for (int i = startFrom; i < endBefore; i++)
            newStr += String.valueOf(input.charAt(i));
        return newStr;
    }
}
