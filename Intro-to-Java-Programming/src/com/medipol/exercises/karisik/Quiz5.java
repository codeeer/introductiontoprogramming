package com.medipol.exercises.karisik;

import java.io.File;
import java.util.Scanner;

public class Quiz5 {
	


	public static void main(String[] args) {

		int i0 = 2, i1 = 3;
		double d0 = 2.0, d1 = 3.0, d2 = 4.0;
		char c0 = '8', c1 = 'Z';
		String s0 = "", s1 = "";
		try {
			Scanner scan = new Scanner(new File(Quiz5.class.getResource(
					"data.txt").getFile()));
		
			d0 = scan.nextDouble();
			i0 = scan.nextInt();
			c0 = scan.next().charAt(3);
			s0 = scan.next();
			System.out.println(d0 + ": " + i0);
			System.out.println(c0 + ": " + s0);
			if (scan.hasNextDouble())
				d1 = scan.nextDouble();
			if (scan.hasNextInt())
				i1 = scan.nextInt();
			c1 = scan.next().charAt(3);
			scan.nextLine();
			// discard newline s1 = scan.nextLine();
			System.out.println(d1 + ", " + i1);
			System.out.println(c1 + ", " + s1);
			d2 = scan.nextDouble();
			System.out.println(d2);
		} catch (Exception e) {
			System.out.println("Exception ");
		}
	}

}
