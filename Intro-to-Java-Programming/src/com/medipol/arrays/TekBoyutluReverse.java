package com.medipol.arrays;


public class TekBoyutluReverse {

    public static void main(String[] args) {
        int[] siralama = {1,2,3,4,5};
		
        for(int i=0; i<siralama.length/2; i++) {
            int gecici = siralama[i];
            siralama[i] = siralama[siralama.length-i-1];
            siralama[siralama.length-i-1] = gecici;

        }
       System.out.println(ArraysToStringOrnek.benimArrayToString(siralama));
      

        System.out.println(java.util.Arrays.toString(siralama));
    }
    
   
}
