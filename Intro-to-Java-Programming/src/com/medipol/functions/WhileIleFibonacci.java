package com.medipol.functions;

public class WhileIleFibonacci {


	
	public static void main(String[] args) {
		int maxSayi = 3, oncekiSayi = 0, sonrakiSayi = 1;
		//System.out.print("Fibonacci Serisi " + maxSayi + " icin: ");
	
		int i = 1;
		while (i <= maxSayi) {
			//System.out.println(oncekiSayi + " ");
			int sum = oncekiSayi + sonrakiSayi;
			oncekiSayi = sonrakiSayi;
			sonrakiSayi = sum;
			i++;
		}
		
		ekranaYaz(5);

	}
	
	public static void ekranaYaz(int n) {
		
		if(n == 0) {
			return;
		}
		else {
		
			System.out.println(n);
			n--;
			ekranaYaz(n);
		
		}
	}
}


