package com.medipol.arrays;

public class CokBoyutluDiziTabloElemanToplami {

    public static void main(String[] args) {
        int[][] satisTablosu = new int[][]{
                {700, 600, 650},
                {900, 800, 700},
                {300, 400, 350},
                {500, 450, 470},
                {600, 500, 480}
        };
        int i, j, toplamSatis, toplamOtomobilSayisi = 0;

        /*bellekteki satisTablosu dizisinin
         * elemanlarının ekrana yazdırılması*/
        System.out.println("Otomobil satislari tablosu");
        for (i = 0; i < satisTablosu.length; i++) {
            for (j = 0; j < satisTablosu[0].length; j++) {
                System.out.print(satisTablosu[i][j] + "  ");
            }
            System.out.println();
        }

        /*
         * Her marka için 3 aylık satış toplamlarını
         * yani dizinin satır toplamlarını yazdıralım
         * */
        for (i = 0; i <= 4; i++) {
            toplamSatis = 0;
            for (j = 0; j <= 2; j++)
                toplamSatis = toplamSatis + satisTablosu[i][j];
            System.out.println(i + 1 + ". markanin toplam satisi: " + toplamSatis);
        }

        /*
         * Her ay için 5 markanın satış toplamlarını
         * yani tablodaki sütunların toplamlarını
         * gösterelim
         * */
        System.out.println();
        toplamOtomobilSayisi = 0;
        for (j = 0; j <= 2; j++) {
            toplamSatis = 0;
            for (i = 0; i <= 4; i++) {
                toplamSatis = toplamSatis + satisTablosu[i][j];
                toplamOtomobilSayisi = toplamOtomobilSayisi + satisTablosu[i][j];
            }
            System.out.println(j + 1 + ". ayda 5 marka icin toplam satis miktari: " + toplamSatis);
        }
        /*3 AY ICIN TOPLAM OTOMOBIL SATISI-GENEL TOPLAM*/
        System.out.println("3 aylik toplam otomobil satisi" + toplamOtomobilSayisi);
    }
}
