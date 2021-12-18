package com.medipol.arrays;

public class CokluDiziEnkucuk2 {

    public static void main(String[] arg){
        double[][] matris={
                {56,23,678,231},
                {234,21,78,26},
                {654,33,32,67},
                {189,35,56,89}
        };
        int i,j,y,x;
        y=0;
        x=0;
        double enKucuk;
        enKucuk=matris[0][0];
        for(i=0; i<=3; i++) {
            for(j=0; j<=3; j++){
                if(matris[i][j]<enKucuk) {
                    enKucuk=matris[i][j];
                    x=i;
                    y=j;
                }
                System.out.println("["+i+"]["+j+"] = "+matris[i][j]+"\t");
            }
        }
        matris[x][y]=100000000000.0;
        enKucuk=matris[0][0];
        System.out.println("");
        for(i=0; i<=3; i++){
            for(j=0; j<=3; j++){
                if(matris[i][j]<enKucuk)
                {
                    enKucuk=matris[i][j];
                    y=j;
                    x=i;
                }
                System.out.print("["+i+"]["+j+"]=" + matris[i][j]+"   ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Matristeki ikinci en kucuk eleman: "+enKucuk);
        System.out.println("Bu elemanin satir ve sutunu "+x+"'a "+y);
    }
}
