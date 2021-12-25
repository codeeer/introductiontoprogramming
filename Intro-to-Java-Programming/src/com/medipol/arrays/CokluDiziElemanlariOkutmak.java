package com.medipol.arrays;

import java.util.Scanner;

public class CokluDiziElemanlariOkutmak {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int[][] satisTablosu = new int[3][2];
        int i, j;

        /* kullanıcıdan satış tablosu
         * bilgilerini alalım */
        System.out.print("Satis [0,0]=");
        satisTablosu[0][0] = giris.nextInt();

        System.out.print("Satis [0,1]=");
        satisTablosu[0][1] = giris.nextInt();

        System.out.print("Satis [1,0]=");
        satisTablosu[1][0] = giris.nextInt();

        System.out.print("Satis [1,1]=");
        satisTablosu[1][1] = giris.nextInt();

        System.out.print("Satis [2,0]=");
        satisTablosu[2][0] = giris.nextInt();

        System.out.print("Satis [2,1]=");
        satisTablosu[2][1] = giris.nextInt();

        /* bellekteki satis tablosu
         * elemanlarının ekrana yazdırılması */
        System.out.println("Satis tablonuz");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(satisTablosu[i][j] + " ");
            }
            System.out.println();
        }
    }
}
