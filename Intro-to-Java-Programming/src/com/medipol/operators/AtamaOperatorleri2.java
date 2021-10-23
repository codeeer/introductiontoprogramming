package com.medipol.operators;

public class AtamaOperatorleri2 {

	public static void main(String[] args) {

		int x = 5;
		int y = 4;
		System.out.format("x= %d  ve y =  %d  ise x +=y =  %d  %n", x, y, x += y);
		System.out.format("x= %d  ve y =  %d  ise x -=y =  %d  %n", x, y, x -= y);
		System.out.format("x= %d  ve y =  %d  ise x *=y =  %d  %n", x, y, x *= y);
		System.out.format("x= %d  ve y =  %d  ise x /=y =  %d  %n", x, y, x /= y);
		System.out.format("x= %d  ve y =  %d  ise x mod=y =  %d  %n", x, y, x %= y);
	}

}
