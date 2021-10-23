package com.medipol.loops;

import java.util.Scanner;

public class CollatzProblemi {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	
		int N; 
		int counter; 
		System.out.println("Lutfen bir sayi giriniz: ");
		N = sc.nextInt();
		while (N <= 0) {
			System.out.println("Başlangıc değeri pozitif olmalıdır. Tekrar deneyiniz: ");
			N = sc.nextInt();
		}
		counter = 0;
		while (N != 1) {
			if (N % 2 == 0)
				N = N / 2;
			else
				N = 3 * N + 1;
				System.out.println(N);
				counter = counter + 1;
			}
	
		System.out.println("There were ");
		System.out.println(counter);
		System.out.println(" terms in the sequence.");

	
	}
}
