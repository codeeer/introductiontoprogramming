package com.medipol.dersdeYapilanlar;

import java.util.Arrays;

public class CokBoyutluDiziSorulari {

	public static void main(String[] args) {
		
		 double[][] enKucukIkinciElemaniOlanDizi={
		            {56,23,678,231},
		            {234,21,78,26},
		            {654,33,32,67},
		            {189,35,56,89}
		    };
	    //enKucukIkinciElemaniBul(enKucukIkinciElemaniOlanDizi);
	    
	    int[][] tekSayilariTekBoyutluDiziyeKoy={
	            {56,23,678,231},
	            {234,21,78,26},
	            {654,33,32,67},
	            {189,35,56,89}
	    };
	    int[] dizi = tekOlanSayilariTekBoyutluDiziOlarakDon(tekSayilariTekBoyutluDiziyeKoy);
	    System.out.println(Arrays.toString(dizi));
	    dizininElemanlariniSirala(dizi);

	}
	
	public static void dizininElemanlariniSirala(int[] dizi) {
		
	}
	
	public static int[] tekOlanSayilariTekBoyutluDiziOlarakDon(int[][] dizi) {
		
		int[] tekBoyutluDizi = new int[1];
		int count  = 0;
		int k = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[i][j] % 2 != 0) {
					count++;
				}
			}
		}
		tekBoyutluDizi = new int[count];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[i][j] % 2 != 0) {
					tekBoyutluDizi[k] =  dizi[i][j];
					k++;
				}
			}
		}
		
		return tekBoyutluDizi;
	}
	
	public static double enKucukIkinciElemaniBul(double[][] dizi) {
		
		int i,j,y,x,z,t;
	    y=0;
	    x=0;
	    z= 0;
	    t = 0;
	    double enKucuk;
	    enKucuk=dizi[0][0];
	    double tempEnKucuk;
	    for(i=0; i<=3; i++) {
	        for(j=0; j<=3; j++){
	            if(dizi[i][j]<enKucuk) {
	                enKucuk = dizi[i][j];
	                x=i;
	                y=j;
	            }
	            System.out.println("["+i+"]["+j+"] = "+dizi[i][j]+"\t");
	        }
	    }
	    tempEnKucuk = enKucuk;
	    dizi[x][y]=100000000000.0;
	    enKucuk=dizi[0][0];
	    System.out.println("");
	    for(i=0; i<=3; i++){
	        for(j=0; j<=3; j++){
	            if(dizi[i][j]<enKucuk)
	            {
	                enKucuk=dizi[i][j];
	                t=j;
	                z=i;
	            }
	            if(i==x && j == y) {
	            	System.out.print("["+i+"]["+j+"]=" + tempEnKucuk+"   ");
	            }
	            else {
	            System.out.print("["+i+"]["+j+"]=" + dizi[i][j]+"   ");
	            }
	        }
	        System.out.println("");
	    }
	    dizi[x][y]=tempEnKucuk;
	    System.out.println("");
	    System.out.println("");
	    System.out.println("Matristeki ikinci en kucuk eleman: "+enKucuk);
	    System.out.println("Bu elemanin satir ve sutunu "+z+"'a "+t);
		
	    return enKucuk;
	}

}
