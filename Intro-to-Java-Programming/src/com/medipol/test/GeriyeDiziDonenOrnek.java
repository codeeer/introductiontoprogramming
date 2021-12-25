package com.medipol.test;

import java.util.Arrays;

public class GeriyeDiziDonenOrnek {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a;
		b = 4;
		
		System.out.printf("a: %d  b: %d ",a , b );
		System.out.println();
		
		int[] aDizi = {1,2,3};
		int[] bDizi = aDizi;
		System.out.println("A dizisi");
		for (int i = 0; i < aDizi.length; i++) {
			System.out.print(aDizi[i]+", ");
			
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println("bdizisi");
		for (int i = 0; i < bDizi.length; i++) {
			System.out.print(bDizi[i]+", ");
		}
		bDizi[2] = 8;
		
		System.out.println();
		System.out.println("Sonrasi");
	
		System.out.println("A dizisi");
		
		
		for (int i = 0; i < aDizi.length; i++) {
			System.out.print(aDizi[i]+", ");

		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println("bdizisi");
		for (int i = 0; i < bDizi.length; i++) {
			System.out.print(bDizi[i]+", ");
		}
		

	}
	

}
