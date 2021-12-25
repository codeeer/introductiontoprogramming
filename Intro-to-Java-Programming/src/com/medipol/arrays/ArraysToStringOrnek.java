package com.medipol.arrays;

//import java.util.Arrays;

public class ArraysToStringOrnek {

    public static void main(String[] args) {
        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2, -49, 52};
  //      System.out.println(Arrays.toString(liste));
        System.out.println(benimArrayToString(liste));
        System.out.println(benimArrayToString2(liste));
        String ornek = "aLI EVE duzelt";
        System.out.println(ornek.toUpperCase());
        String charAtOrnek = "deneme";
        StringBuilder textBuilder = new StringBuilder();
       
       String deneme = "deneme1";
       textBuilder.append(deneme);
       textBuilder.append(" bitti");
       deneme += " bitti";
       System.out.println(deneme);
       System.out.println(textBuilder.toString());
        
    }

    public static String benimArrayToString(int[] liste) {
        StringBuilder result = new StringBuilder();
        result.append("[");

        for (int a = 0; a < liste.length; a++) {
            result.append(liste[a]);
            if (a != liste.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static String benimArrayToString2(int[] liste) {
        String result="";
        result += "[";
        for (int a = 0; a < liste.length; a++) {
            result += liste[a];
            result += ", ";
        }
        result = result.substring(0,result.length()-1);
        result += "]";
        return result.toString();
    }
    
    
}
