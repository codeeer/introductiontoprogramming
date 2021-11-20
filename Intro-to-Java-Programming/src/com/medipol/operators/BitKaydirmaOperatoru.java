package com.medipol.operators;

import java.lang.Math;


public class BitKaydirmaOperatoru {

	public static void main(String[] args) {
		
		System.out.println("3(000011)>>1: "+ (3>>1));
		// 000011 >> 1 000001
        System.out.println("3(000011)<<3: "+ (3<<3));
        
        //00011 << 011000 
        
        int a = 16;
        
        double b=Math.sqrt(a);
        
        System.out.println(b);
	}

}
