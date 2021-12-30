package com.medipol.arrays;

public class CokBoyutluDiziMatrisCarpimi {

    public static void main(String[] args){

        int[][] aMatris=new int [][]{ {2,1},{-1,4},{5,3}}; 
        int[][] bMatris=new int [][]{{3,2,1,-1},{4,-2,1,2}}; 
        int[][] cMatris=new int [3][4];
        int i,j,k,t;

        /*a ve b matrislerinin yazdırılması*/
        System.out.println("A matrisi");
        for(i=0; i<=2; i++) {
            for(j=0; j<=1; j++) {
                System.out.print(aMatris[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("B matrisi");
        for(i=0; i<=1; i++){
            for(j=0;j<=3;j++) {
                System.out.print(bMatris[i][j]+"\t");
            }
            System.out.println();
        }

        /* a ve matrisinin çarpımı olan
         * c martisinin hesaplanması */
        for(k=0; k< 4; k++) {
            for(i=0; i< 3; i++) {
                cMatris[i][k]=0;

                for(j=0; j<2; j++) {
                    cMatris[i][k]=cMatris[i][k]+
                            aMatris[i][j]*bMatris[j][k];
                }
            }
        }
        System.out.println("C matrisi");
        for(i=0; i<=2; i++)
        {
            for(j=0;j<=3;j++)
                System.out.print(cMatris[i][j]+"\t");
            System.out.println();
        }
    }
    
    
}
