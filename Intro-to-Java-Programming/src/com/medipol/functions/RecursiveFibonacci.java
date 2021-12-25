package com.medipol.functions;

import java.util.Scanner;

public class RecursiveFibonacci {
	
	public static int fibonacciHesapla(int n) {
		
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciHesapla(n - 2) + fibonacciHesapla(n - 1);
	}

	public static void main(String args[]) {

		int maxSayi = 50;
		System.out.print("Fibonacci Seri " + maxSayi + " icin: ");

		for (int i = 0; i < maxSayi; i++) {
			System.out.print(fibonacciHesapla(i) + " ");
		}
		
	}
	
	private static int fiboHesapla(int n) {
	
		if(n == 0) {
			return 0;
		}
		
		if(n == 1 || n == 2)
		{
			return 1;
		}
		
		return fiboHesapla(n-2) + fiboHesapla(n -1);

	}
	
	
	public static int fiboHesapla2(int n) {
		if( n == 0) {
			return 0;
		}
		
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return fiboHesapla2(n-2) + fiboHesapla(n-1);
	}
	
}



 
