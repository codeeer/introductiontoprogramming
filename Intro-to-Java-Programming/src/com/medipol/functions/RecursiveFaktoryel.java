package com.medipol.functions;

import java.util.Scanner;

public class RecursiveFaktoryel {

    public static int Faktoriyel(int sayi) {
        if (sayi >= 1)
            return sayi * Faktoriyel(sayi - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");

        int num = reader.nextInt();

        System.out.printf("%d Sayısının Faktöriyeli = %d \n", num, Faktoriyel(num));
    }

    public static int Faktoriyel2(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }
}
