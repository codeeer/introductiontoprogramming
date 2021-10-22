package com.medipol.exercises;

import java.util.Scanner;

public class ScannerNesnesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Kullanıcıdan değer alabilmek için Scanner sınıfını kullandık
		System.out.println("Lütfen ilk tamsayıyı giriniz : ");
		int n = scan.nextInt(); 
		System.out.println("Lütfen ikinci tamsayıyı giriniz : ");
		int m = scan.nextInt();
		System.out.print(n + m);

	}
}