package com.medipol.dersdeYapilanlar;

import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args) {
		
		double Diskriminant;
		double x1;
		double x2;

		System.out.println("Bir iki bilinmeyenli denklemin (ax^2 + bx + c = 0) köklerini bulabilmek için denklemin a, b ve c değişkenlerinin kullanılması gerekmektedir.");
		System.out.println("Denklemin köklerine x1 ve x2 diyelim,");
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen denklemin a değerini giriniz: ");
		double a = scan.nextInt();
		System.out.println("Lütfen denklemin b değerini giriniz: ");
		double b = scan.nextInt();
		System.out.println("Lütfen denklemin c değerini giriniz: ");
		double c = scan.nextInt();
		Diskriminant = (b*b)-(4*a*c);

		 if(Diskriminant < 0){

			 System.out.println("Denklemin gerçel sayılarla ifade edilebilecek bir kökü yoktur.");
			 System.out.printf("Çünkü denklemin diskriminantı: %.1f", Diskriminant);

		 }
		 else if(Diskriminant == 0){

			 x1=x2=-b/(2*a);
			 System.out.println("Denklemin, değerleri birbirine eşit olan iki kökü vardır.");
			 System.out.printf("Bunlar: %.1f ve %.1f dir.", x1,x2);

		 }
		 else if(Diskriminant > 0){

			 System.out.println(b+a+c);
			 x1=(-b+(Math.sqrt(Diskriminant)) / (2*a));
			 x2=(-b-(Math.sqrt(Diskriminant)) / (2*a));
			 System.out.println("Denklemin birbirinden farklı iki gerçel kökü vardır.");
			 System.out.printf("Bunlar: %.2f ve %.2f dir.",x1,x2);
		 }
		
	}
}
