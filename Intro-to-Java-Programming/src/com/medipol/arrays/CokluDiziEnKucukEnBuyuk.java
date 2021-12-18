package com.medipol.arrays;

public class CokluDiziEnKucukEnBuyuk {

    public static void main(String[] args) {

        double[][] tablo = new double[][]{
                {34, 11, -7, 53},
                {254, 8, -65, 4},
                {110, 64, 33, 26}
        };
        int i, j;
        double kucukEleman, buyukEleman, enKucuk, enBuyuk;

        /*tablonun yazdırılması*/
        System.out.println("Dizinin Elemanlari");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }

        /* Her satırdaki en büyük ve en küçük
         * elemanların bulunması*/
        for (i = 0; i <= 2; i++) {
            kucukEleman = 3.4e38;
            buyukEleman = -3.4e38;
            for (j = 0; j <= 3; j++) {
                if (tablo[i][j] < kucukEleman) {
                    kucukEleman = tablo[i][j];
                }
                if (tablo[i][j] > buyukEleman) {
                    buyukEleman = tablo[i][j];
                }
            }
            System.out.println((i + 1) + ". satirdaki en kucuk eleman: " + kucukEleman);
            System.out.println((i + 1) + ". satirdaki en buyuk eleman: " + buyukEleman);
        }

        /* Her sütundaki en büyük ve en küçük
         * elemanın bulunması*/

        /* Ek olarak tablodaki en büyük ve en küçük
         * elemanın bulunması */
        enKucuk = 3.4e38;
        enBuyuk = -3.4e38;
        for (j = 0; j <= 3; j++) {
            kucukEleman = 3.4e38;
            buyukEleman = -3.4e38;
            for (i = 0; i <= 2; i++) {
                if (tablo[i][j] < kucukEleman) {
                    kucukEleman = tablo[i][j];
                }
                if (tablo[i][j] > buyukEleman) {
                    buyukEleman = tablo[i][j];
                }
                if (tablo[i][j] < enKucuk) {
                    enKucuk = tablo[i][j];
                }
                if (tablo[i][j] > enBuyuk) {
                    enBuyuk = tablo[i][j];
                }
            }
            System.out.println((j + 1) + ". sutundaki en kucuk eleman: " + kucukEleman);
            System.out.println((j + 1) + ". sutundaki en buyuk eleman: " + buyukEleman);
        }
        System.out.println("Tablodaki en kucuk eleman: " + enKucuk);
        System.out.println("Tablodaki en buyuk eleman: " + enBuyuk);
    }
}
