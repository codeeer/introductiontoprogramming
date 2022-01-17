package com.medipol.exercises.karisik;

public class Quiz2 {
	public static void main(String[] args) {
		String S1 = "Java Programming";
		String S2 = " is taught";
		String S3 = " at Medipol State";

		int iSize = S3.length() + 3;
		System.out.println(iSize);
		char cChar = S1.charAt(10);
		System.out.println(cChar);
		int iIndex = S2.indexOf("p");
		System.out.println(iIndex);
		String sSubstr = S1.substring(1, 7);
		System.out.println(sSubstr);
		String name = "Semih";
		String isim = name;
		System.out.println("Sonuc "+ "Semih" == name);
		int [] dizi1 = {1,2,3};
		int [] dizi2 = dizi1;
		dizi2[2] = 5;
		System.out.println(dizi1[2]);
		if("Semih".equals(name)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		boolean bEquals = S2.equals(" is taught");
		System.out.println(bEquals);
	}

}
