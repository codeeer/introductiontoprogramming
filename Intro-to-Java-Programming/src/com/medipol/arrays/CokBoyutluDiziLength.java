package com.medipol.arrays;

public class CokBoyutluDiziLength {

    public static void main(String[] args) {
        int[][] satisTablosu = new int[][]{
                {700, 600, 650},
                {900, 800, 700},
                {300, 400, 350},
                {500, 450, 470},
                {600, 500, 480}
        };
        int i, j;

        /*bellekteki satis tablosu
         * elemanlarının ekrana yazdırılması*/
        System.out.println("Satis tablosu");
        /*
         * döngülerin sınırlarını length()
         * fonksiyonlarıyla belirliyoruz
         * */
        for (i = 0; i < satisTablosu.length; i++) {
            for (j = 0; j < satisTablosu[0].length; j++) {
                System.out.print(satisTablosu[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
