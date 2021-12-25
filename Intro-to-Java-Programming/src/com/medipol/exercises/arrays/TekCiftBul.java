package com.medipol.exercises.arrays;

import java.util.Scanner;

public class TekCiftBul {
	
	public static void main(String args[]) {
        int i, s = 0;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
 
        System.out.print("5 Sayı Girin :");
 
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("\nÇift Sayılar :");
        for (i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(" " + arr[i]);
            }
        }
 
        System.out.print("\nTek Sayılar :");
        for (i = 0; i < 5; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(" " + arr[i]);
            }
        }
 
    }
}

