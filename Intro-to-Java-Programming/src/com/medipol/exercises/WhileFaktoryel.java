package com.medipol.exercises;

public class WhileFaktoryel {

	public static void main(String[] args) {
		int faktoriyel = 1;
		int tempFaktoryel = 1;
		int carpan = 1;
		while (carpan <= 10) {
			faktoriyel = tempFaktoryel * carpan;
			//faktoriyel = faktoriyel * carpan; // 1*1, 1*2, 2*3, 6*4, 24*5...
			tempFaktoryel = faktoriyel;
			System.out.println(carpan);
			System.out.println(faktoriyel);
			System.out.println(carpan + " faktoriyel: " + faktoriyel);
			carpan++;
		}
	}

}
