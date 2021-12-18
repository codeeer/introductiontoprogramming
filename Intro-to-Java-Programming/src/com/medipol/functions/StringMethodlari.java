package com.medipol.functions;

import java.util.Scanner;

public class StringMethodlari {

    public static void main(String[] args) {
        subStringOrnek();
    }

    public static void charAtOrnekleri(){
        String s1 = "Merhaba Dünya";

        //ilk sıradaki karakteri okur.
        System.out.println("0. sıradaki karakter: " + s1.charAt(0));

        //5. sıradaki karakteri okur.
        System.out.println("5. sıradaki karakter: " + s1.charAt(5));

        //Sondan birinci sıradaki karakter
        char sonuc = s1.charAt(s1.length()-1);
        System.out.println("Son sıraki karakter: " + sonuc);
    }
    public static void subStringOrnek(){
        String yazi = "The ve Kod ile Program";

        // Aşağıda 0ıncı karakterden itibaren 3 karakter al dedik
        String ilk = yazi.substring(0, 3);
        System.out.println(ilk);

        //Bunda ise 6. karakterden 3 tane al dedik
        String iki = yazi.substring(6,3);
        System.out.println(iki);

        //Ve son olarak 15. karakterden 7 tane al dedik
        String son = yazi.substring(15, 7);
        System.out.println(son);
    }

    public static void stringOrnekler(){

        Scanner scanner = new Scanner(System.in);
        // Değişken Tanımlaması:
        String myName;
        System.out.print("---------------\n- Adiniz ve Soyadinizi Girin: ");
        myName = scanner.nextLine();
        System.out.print("---------------\n-> Yapacagimiz Islemler:\n1- Metin Uzunlugu: "+myName.length());
        System.out.print("\n2- C Harfi Kacinci Index Numarasinda: "+myName.indexOf("C"));
        System.out.print("\n3- Substring(5) Kullanımı: "+myName.substring(5)+"\n4- Substring(0,4) Kullanimi: "+myName.substring(0,4));
        System.out.print("\n5- toLowerCase Kullanımı: "+myName.toLowerCase()+"\n6- toUpperCase Kullanimi: "+myName.toUpperCase());
        System.out.print("\n---------------");
    }

    public static void karsilastirma() {

        Scanner scanner = new Scanner(System.in);
        // Değişken Tanımlaması:
        String deneme = "test deneme";
        String seninKararin;
        System.out.println("--------------\n-> Program Islemleri\n--------------\n1- Programı Baslat\n2- Programi Sonlandir\n--------------");
        System.out.print("-> Karariniz: ");
        seninKararin = scanner.nextLine();
        if (seninKararin.equals("1") || seninKararin.equalsIgnoreCase("Baslat")) {
            System.out.println("--------------\n-> Program Başlatıldı.\n-> İşlenecek String Metin: " + deneme + "\n--------------");
            System.out.print("-> startsWith('deneme') Kullanımı: " + deneme.startsWith("deneme") + "\n-> endsWith('tr') Kullanımı: " + deneme.endsWith("tr"));
            System.out.print("\n-> contains('me') Kullanımı: " + deneme.contains("me") + "\n--------------");
        } else if (seninKararin.equals("2") || seninKararin.equalsIgnoreCase("baslatma")) {
            System.out.println("--------------\n-> Program Sonlandırıldı.\n--------------");
        } else {
            System.out.println("--------------\n-> Tanimsiz Deger Girdiniz\n-> Program Sonlandirildi.\n--------------");
        }
    }
}
