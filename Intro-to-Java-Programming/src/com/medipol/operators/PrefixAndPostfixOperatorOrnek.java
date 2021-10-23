package com.medipol.operators;

public class PrefixAndPostfixOperatorOrnek {

	public static void main(String[] args) {
		 int sayı = 0; 
	        int prefixArtım; 
	        int prefixEksim; 
	        int postfixArtım; 
	        int postfixEksim; 
	        int pozitif; 
	        int negatif; 
	        byte bitNot; 
	        boolean logNot; 
	        prefixArtım = ++sayı; 
	        System.out.println("prefix-Artım = " +  prefixArtım); 
	        prefixEksim = --sayı; 
	        System.out.println("prefix-Eksim = " +  prefixEksim); 
	        postfixEksim = sayı--; 
	        System.out.println("postfix-Eksim = " +  postfixEksim); 
	        postfixArtım = sayı++; 
	        System.out.println("postfix-Artım = " +  postfixArtım); 
	        System.out.println("sayı ‘nin son değeri =" +  sayı); 
	        pozitif = -postfixArtım; 
	        System.out.println("Pozitif = " +  pozitif); 
	        negatif = +postfixArtım; 
	        System.out.println("Negatif = " +  negatif); 
	        bitNot = 0; 
	        bitNot = (byte)(~bitNot); 
	        System.out.println("Bitwise Not = " +  bitNot); 
	        logNot = false; 
	        logNot = !logNot; 
	    System.out.println("Logical Not = " + logNot); 
	}

}
