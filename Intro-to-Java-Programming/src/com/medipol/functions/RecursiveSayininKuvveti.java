package com.medipol.functions;

import java.util.Scanner;

public class RecursiveSayininKuvveti {

    public static void main(String[] args) {
        int s,k;
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayiyi giriniz");
        int sayi = giris.nextInt();
        System.out.println("Kuvvetini giriniz");
        int kuvvet = giris.nextInt();
        int sonuc = kuvveti(sayi,kuvvet);
        System.out.println(sayi + " nin " + kuvvet +". ci kuvveti: "+sonuc);

    }

    public static int kuvveti(int s,int k){
        if(k == 0)
        {
            return 1; // base case
        }
        else{
            return s * (kuvveti(s,k-1)); //general case

          //  f(2,3) = 2 * f(2,2);
          //  f(2,2) = 2 * f(2,1);
          //  f(2,1) = 2 * f(2,0)
        }
        
        
    }
    
    
    public static int kuvvetiniAl(int sayi,int ussu) {
    	
    	if(ussu == 0) {
    		return 1;
    	}
    	else {
    		return sayi * kuvvetiniAl(sayi, ussu-1);
    	}
    	
    }
    
    
    
    
}
