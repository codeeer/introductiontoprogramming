package com.medipol.exercises.arrays;

import java.util.Scanner;

public class EnBuyukSayiyiBul {
	
	public static void main(String args[]) {
		 
        Scanner s = new Scanner(System.in);
        int a[] = new int[100];
        int n, enbuyuk = 0;
 
        System.out.print("Dizi Boyutunu Girin:");
        n = s.nextInt();
 
        System.out.print("\nDizi Öğelerini Girin :");
 
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }       
        for (int i = 0; i < n; i++) {
            if (enbuyuk <= a[i]) {
                enbuyuk = a[i];
            }
        }
 
        System.out.print("\nDizideki En büyük sayı :" + enbuyuk);
    }

}
