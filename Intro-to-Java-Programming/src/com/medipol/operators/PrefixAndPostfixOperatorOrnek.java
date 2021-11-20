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

	        prefixArtım = ++sayı; 
	        System.out.println("prefix-Artım = " +  prefixArtım); 
	        // sayi 1 prefixArtım 1 
	        prefixEksim = --sayı; 
	        System.out.println("prefix-Eksim = " +  prefixEksim); 
	        //sayi 0 prefixEksim = 0
	        postfixEksim = sayı--; 
	        System.out.println("postfix-Eksim = " +  postfixEksim); 
	        //sayi= -1 postfixEksim= 0
	        postfixArtım = sayı++; 
	        System.out.println("postfix-Artım = " +  postfixArtım); 
	      //sayi= 0 postfixArtım= -1
	        System.out.println("sayı ‘nin son değeri =" +  sayı); 
	        
	        pozitif = -postfixArtım;
	        System.out.println("Pozitif = " +  pozitif); 
	        
	        negatif = +postfixArtım; 
	        System.out.println("Negatif = " +  negatif); 
	 
	}

}
