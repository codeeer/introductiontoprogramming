package com.medipol.arrays;

public class CokBoyutluDiziSiralama {

    public static void main(String[] arg){
        int[][] matris={
                {56,23,678,231},
                {234,21,78,26},
                {654,33,32,67},
                {189,35,56,89}
        };
        int i,j,k;
        k=0;
        int temp=0;
        int[] tekSayilar=new int[16];

        /*tek sayıları bulalım*/
        for(i=0; i<=3; i++) {
            for(j=0; j<=3; j++) {
                if (matris[i][j]/2*2 != matris[i][j]) {
                    tekSayilar[k]=matris[i][j];
                    k++;
                }
                System.out.print("["+i+"]["+j+"]=" + matris[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Tek sayilardan olusan dizi:");
        for(i=0; i<=k-1; i++) {
            System.out.print(tekSayilar[i]+"\t");
        }
        System.out.println();
        System.out.println();

        /*tek sayılardan oluşan diziyi küçükten
         * büyüğe olacak şekilde sıralayalım*/
        for(i=0; i<tekSayilar.length; i++) {
            for(j=0; j<tekSayilar.length; j++) {
                if(tekSayilar[i]>tekSayilar[j]) {
                    temp=tekSayilar[i];
                    tekSayilar[i]=tekSayilar[j];
                    tekSayilar[j]=temp;
                }
            }
        }
        System.out.println("Tek sayilardan olusan dizinin siralanmis hali:");
        for(i=k-1; i>=0; i--) {
            System.out.print(tekSayilar[i]+"\t");
        }
    }
}
