package com.medipol.conditionals;

import java.util.Scanner;

public class IkinciDerecedenFonkCoz {
	
	 public static void main(String args[]){
	        Scanner giris = new Scanner(System.in);
	        double a, b, c, x1, x2, delta;

	        System.out.println("a: ");
	        a=giris.nextDouble();

	        System.out.println("b: ");
	        b=giris.nextDouble();

	        System.out.println("c: ");
	        c=giris.nextDouble();

	        delta = b * b - 4 * a * c;

	        if (delta < 0) {
	            System.out.println("Gercek kok yoktur. \n");
	        }
	        else if (delta == 0) {
	            x1 = -b / (2 * a);
	            System.out.println("x1=x2=" + x1);
	        }
	        else {
	            x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            x2 = (-b - Math.sqrt(delta)) / (2 * a);

	            System.out.println("x1=" + x1);
	            System.out.println("x2=" + x2);
	        }
	    }

}
