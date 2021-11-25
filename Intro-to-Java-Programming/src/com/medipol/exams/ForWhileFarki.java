package com.medipol.exams;

public class ForWhileFarki {

	public static void main(String[] args) {
		int x = 14;
		while (x >= 3) {
			System.out.println(x);
			x = x - 5;
		}
		System.out.println("------------------");
		for(x=14; x>=3; x=x-5) {
			System.out.println(x);
		}
	}

}
