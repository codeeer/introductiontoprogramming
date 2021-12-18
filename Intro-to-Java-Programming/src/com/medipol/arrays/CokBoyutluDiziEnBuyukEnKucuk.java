package com.medipol.arrays;

public class CokBoyutluDiziEnBuyukEnKucuk {

    public static void main(String[] arg){
        double[][] matris={
                {56,23,678,231},
                {234,21,78,23},
                {654,33,22,67},
                {189,35,56,89}
        };
        int i,j,k;
        k=0;
        double enBuyuk,enKucuk;
        enBuyuk=matris[0][0];
        for(i=0; i<=3; i++){
            for(j=0; j<=3; j++){
                if(matris[i][j]>enBuyuk)
                {
                    enBuyuk=matris[i][j];
                    k=j;
                }

                System.out.print("["+i+"]["+j+"]=" + matris[i][j]+"\t");
            }
            System.out.println();
        }
        enKucuk=matris[0][k];
        for(i=0; i<=3; i++) {
            if(matris[i][k]<enKucuk) {
                enKucuk=matris[i][k];
            }
        }
        System.out.println("En buyuk elemanin bulundugu sutundaki en kucuk sayi "+enKucuk);
    }
}
