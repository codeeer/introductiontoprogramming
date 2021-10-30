package com.medipol.loops;

import java.util.Scanner;

public class ForTamSayilarToplaminiBul {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
        int n, toplam;
        int i;

        System.out.println("Kaca kadar sayilar toplansin? ");
        n = giris.nextInt();

        toplam = 0;

        for (i = 1; i <= n; i++) {
            toplam += i;
        }

        switch (n) {
        case 1 :
            System.out.println("\n" + n + "=" + toplam);
            break;

        case 2 :
            System.out.println("\n1+" + n + "=" + toplam);
            break;

        case 3 :
            System.out.println("\n1+2+" + n + "=" + toplam);
            break;

        case 4 :
            System.out.println("\n1+2+3+" + n + "=" + toplam);
            break;

        default :
            System.out.println("\n1+2+3+..+" + n + "=" + toplam);
        }

	}

}
