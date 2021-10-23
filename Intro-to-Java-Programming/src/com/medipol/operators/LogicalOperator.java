package com.medipol.operators;

public class LogicalOperator {

	public static void main(String[] args) {

		int x = 5;
		int y = 4;
		System.out.println(5 == 6 - 1 && 7 > 6);
		System.out.println(5 >= 4 && 7 < 6 + 3);
		System.out.println(5 != 4 && 7 - 1 == 6);
		System.out.println(!(5 == 4) && 7 > 6);
	}

}
