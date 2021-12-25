package com.medipol.arrays;

import java.util.Arrays;

public class ArrayCopyOfDemo {

    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
        //for (String coffee : copyTo)
        for (int i = 0; i < copyTo.length; i++) {
            System.out.print(copyTo[i] + " ");
        }
    }
    
    public static String[] copyOfRange(String[] dizi,int altSinir,int ustSinir) {
    	
    	String[] returnDizi = new String[ustSinir-altSinir];
    	int j = 0;
    	for (int i = altSinir; i < ustSinir; i++) {
			returnDizi[j] = dizi[altSinir];
			j++;
		}
    	return returnDizi;
    }
}
