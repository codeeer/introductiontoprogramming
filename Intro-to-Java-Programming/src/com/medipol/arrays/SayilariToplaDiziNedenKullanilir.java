package com.medipol.arrays;

import java.util.Scanner;

public class SayilariToplaDiziNedenKullanilir {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int[] sayi = new int[6];
        int toplam, i;
        int degistirilmekIstenilenSayiIndex;
        toplam = 0;
        System.out.println("Maksimum 6 sayi girebilirsiniz.");
        for (i = 0; i < 6; i++) {
            System.out.print("Bir sayi giriniz eger bir seciminizi degistirmek isterseniz 0 a basiniz: ");

            sayi[i] = giris.nextInt();
            if(sayi[i] == 0)
            {
                System.out.println("kacinci sectiginiz sayiyi degistirmek istiyorsunuz?");
                degistirilmekIstenilenSayiIndex= giris.nextInt();
                while (degistirilmekIstenilenSayiIndex>6){
                    System.out.println("Maks 6 sayi girebileceginiz icin gecersiz islem. Tekrar deneyiniz");
                    degistirilmekIstenilenSayiIndex= giris.nextInt();
                }
                System.out.println(sayi[degistirilmekIstenilenSayiIndex - 1] +" olarak girdiginiz sayiyi hangi sayi ile degistirmek istersiniz?");
                sayi[degistirilmekIstenilenSayiIndex - 1]  = giris.nextInt();
                i--;
            }
            toplam = toplam + sayi[i];
        }
        System.out.println("Girdiniz sayilarin toplami: " + toplam);
        System.out.println("Sayi dizisinin ikinci elemani: " + sayi[2]);
    }


}
