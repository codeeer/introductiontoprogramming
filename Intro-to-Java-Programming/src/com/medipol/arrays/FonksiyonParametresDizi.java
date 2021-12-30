package com.medipol.arrays;

public class FonksiyonParametresDizi {

	static int abc;
	
    public static void main(String[] args) {
        int[] a = {2, 8, 3, 7, 5};
        int toplam;
        toplam = topla_dizi(a, 5);
        System.out.println("Toplam: " + toplam);
       int dizininToplami =dizininElemanlariniTopla(a, 5);
       System.out.println(dizininToplami);
        
    }

    static int topla_dizi(int[] x, int n) {
        int i, ictoplam;
        abc = 3;
        ictoplam = 0;
        for (i = 0; i < n; i++) {
            ictoplam += x[i];
        }
        return ictoplam;
    }
    
    public static int dizininElemanlariniTopla(int [] dizi,int boyut) {
    	int toplam = 0;
    	
    	for (int i = 0; i < boyut; i++) {
			toplam = toplam + dizi[i];
		}
    	return toplam;
    	
    }
     
}
