package com.medipol.functions;

public class BuyukSayiyiBul {

	public static void main(String[] args) {
		int x= 12;
		int y = 25;
		int buyukSayi = enBuyukSayiyiBul(x, y);
		System.out.println("en buyuk sayi "+ buyukSayi );
		
		int k = 25;
		boolean a = isEven(k);
		if(isEven(k)) {
			System.out.println("cifttir");
		}
		else{
			System.out.println("tektir");
		}
	}

	public static int enBuyukSayiyiBul(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static int getTotal(int x,int y) {
		//int c = a+b;
		return x+y;
	}
	
	public static boolean isEven(int a) 
	{
		if(a %2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
