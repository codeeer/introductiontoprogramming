package com.medipol.calismaSorulari;

import java.util.Scanner;

public class ArtikYilBul {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();

        System.out.println(is_LeapYear(year));
    }

    public static boolean is_LeapYear(int y)
    {
        //leapYear artik yil demek.
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }
}
