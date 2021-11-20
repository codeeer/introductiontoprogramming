package com.medipol.operators;
import java.lang.Math;
public class LogicalOperator {

	public static void main(String[] args) {
		
		System.out.println(5 == 6 - 1 && 7 > 6);
		System.out.println(5 >= 4 && 7 < 6 + 3);
		System.out.println(5 != 4 && 7 - 1 == 6);
		System.out.println(!(5 == 4) && 7 > 6);
		
		System.out.println("*********");
		
		System.out.println(5 < 6 - 1 || 7 > 6); 
	    System.out.println(5 >= 4 || 7 < 6 + 3); 
	    System.out.println(5 != 4 || 7 - 1 == 6); 
	    System.out.println(!(5 == 4) || 7 > 6); 
	    double a = Math.sqrt(16);
	    
	    System.out.println(a);
	}

}
