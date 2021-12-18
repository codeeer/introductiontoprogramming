package com.medipol.loops;

import java.util.Scanner;

public class WhileDongusuOrnek {

    public static void main(String[] args) {
        whileDongusuIle();

    }

    public static void test() {
        Scanner scan = new Scanner(System.in);
//create a scanner object for input
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();//reads rows from user
        int i = 1;
        while (i <= rows) {
            int j = 1;    //print upper part
            while (j <= rows - i) {
                System.out.print(" ");//print space
                j++;
            }
            int k = i;
            while (k >= 1) {
                System.out.print(k);//print number
                k--;
            }
            int l = 2;
            while (l <= i) {
                System.out.print(l);//print number
                l++;
            }
            System.out.println();
            i++;
        }
        i = rows - 1;
        while (i >= 1) {  //print lower part
            for (int j = 0; j <= rows - 1 - i; j++) {
                System.out.print(" ");//print space
            }
            int k = i;
            while (k >= 1) {
                System.out.print(k);
                k--;
            }
            int l = 2;
            while (l <= i) {
                System.out.print(l);
                l++;
            }
            System.out.println();
            i--;
        }


    }

    public static void baklava() {
        int i, k, n, j, l, m;
        n = 5;
        for (i = 1; i <= n; i++)//Bu döngümüzde baklava dilimimizin üst kısmını yapıyoruz.
        {
            for (k = n; k > i; k--)//bu for döngümüz ekran çıktısının sol tarafındaki boşlukları ayarlıyor.
            {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++)//bu for döngümüzde ise yıldız şeklimizi çıkartıyor ve yıldızların arasındaki boşluğu ayarlıyor
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //bu döngümüz ile baklava diliminin alt kkısımını yapıyoruz
        for (k = 1; k <= n; k++) {
            for (l = 1; l <= k; l++)//döngümüz ile baklava diliminin alt kısımının sol tarafındaki boşlukları belirtiyoruz.
            {
                System.out.print(" ");
            }
            for (m = n; m > k; m--)//bu döngümüz ile baklava diliminin alt kısımındaki yıldızları ve arasındaki boşlukları belirtiyoruz.
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void whileDongusuIle() {
        int number = 5;
        int m = 1;
        int n;
        while (m <= number) {
            n = 1;
            while (n <= number - m) {
                System.out.print(" ");
                n++;
            }
            n = 1;
            while (n <= m * 2 - 1) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            m++;
        }
        m = number - 1;
        while (m > 0) {
            n = 1;
            while (n <= number - m) {
                System.out.print(" ");
                n++;
            }
            n = 1;
            while (n <= m * 2 - 1) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            m--;
        }
    }


}
