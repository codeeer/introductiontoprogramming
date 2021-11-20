package com.medipol.operators;
import java.lang.Math;

public class AtamaOperatorleri2 {

	public static void main(String[] args) {

		double deger = Math.sqrt(16);
		System.out.println(deger);
		int x = 5;
		int y = 4;
		System.out.format("x= %d  ve y =  %d  ise x +=y =  %d  %n", x, y, x += y);
		
		System.out.format("x= %d  ve y =  %d  ise x -=y =  %d  %n", x, y, x -= y);
	
		System.out.format("x= %d  ve y =  %d  ise x *=y =  %d  %n", x, y, x *= y);
		
		System.out.format("x= %d  ve y =  %d  ise x /=y =  %d  %n", x, y, x /= y);
	   x =10;
		System.out.format("ali= %d  ve y =  %d  ise x mod=y =  %d  %n", y,x,x %= y );
	}

}
