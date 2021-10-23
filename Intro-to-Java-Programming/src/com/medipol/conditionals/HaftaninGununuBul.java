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

        System.out.println("Secim yapiniz (1 - 2 - 3)");
        secim=giris.nextInt();

        switch (secim) {
        case 1 :
            System.out.println("A sinifi dergilerin listesi");
            break;

        case 2 :
            System.out.println("B sinifi dergilerin listesi");
            break;

        case 3 :
            System.out.println("C sinifi dergilerin listesi");
            break;

        default :
            System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
            break;
        }
	}

}
