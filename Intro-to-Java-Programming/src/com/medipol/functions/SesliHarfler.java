package com.medipol.functions;

import java.util.Scanner;

public class SesliHarfler {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		String kelime = giris.nextLine();
		
		int sesliHarfSayisi = count_Vowels(kelime);
		
		System.out.println(sesliHarfSayisi+"");

	}

	public static int count_Vowels(String str) {
		int count = 0;
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			} // end if
		} // end loop
		return count;
	}

}
