package com.medipol.conditionals;

import java.util.Scanner;

public class HaftaninGununuBul {
	/*
	 * Klavyeden 1 ve 7 dahil olmak üzere bu aralıkta girilen sayıya göre haftanın gününü yazan programı yazalım.
		Klavyeden girilen yazı değerine göre, rakam karşılığını veren program. 1’den 5’e kadar bir, iki, üç, dört, beş 
		şeklinde yazılar girildiğinde bunun rakamsal karşılığını yazdıralım.
	 */

	public static void main(String[] args) {
		
        Scanner giris = new Scanner(System.in);
        int secim;

        System.out.println("Gunu giriniz.Secim yapiniz (1 - 7)");
        secim=giris.nextInt();

        switch (secim) {
        case 1 :
            System.out.println("Pazartesi");
            break;
        case 2 :
            System.out.println("Sali");
            break;
        case 3 :
            System.out.println("Carsamba");
            break;
        case 4 :
            System.out.println("Persembe");
            break;
        case 5 :
            System.out.println("Cuma");
            break;
        case 6 :
            System.out.println("Cumartesi");
            break;
        case 7 :
            System.out.println("Pazar");
            break;
       
        default :
            System.out.println("Hatali secim! 7 den buyuk gun olmaz simdilik");
            break;	
        }
	}

}
