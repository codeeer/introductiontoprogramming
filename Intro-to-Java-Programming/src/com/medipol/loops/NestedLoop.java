package com.medipol.loops;

public class NestedLoop {

	public static void main(String args[]) {
		
		int a, i; // 5 kez tekrarla
		for (a = 1; a <= 5; a++) {
			System.out.println("a= " + a);
			for (i = 1; i <= 3; i++) // 3 kez tekrarla
			{
				System.out.println("i= " + i);
			}
			System.out.println();
		}
	}
}
