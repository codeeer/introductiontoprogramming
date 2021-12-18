package com.medipol.arrays;

public class FaktoryelMatris {

    public static void main(String[] args){
        double[][] dizi=new double[3][3];
        int i,j,sayimiz;
        sayimiz=2;
        for(i=0; i<=2; i++) {
            for(j=0; j<=2; j++) {
                dizi[i][j]=faktoriyel(sayimiz);
                System.out.println(sayimiz+"!="+dizi[i][j]);
                sayimiz=sayimiz+2;
            }
        }
    }

    static double faktoriyel(int n){
        double fakt;
        int i;
        fakt=1.0;
        for(i=1; i<=n; i++) {
            fakt=fakt*i;
        }
        return fakt;
    }
}
