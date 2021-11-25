package com.medipol.exams;

public class ContinueSorusu {

	public static void main(String[] args) {
		int ustlimit = 5;
		int toplam = 0;
		for (int i = 1; i <= ustlimit; i++) {
			if (i % 2 != 0) {
				continue;
			}
			toplam = toplam + i;
		}
		System.out.println("toplam: "+toplam);
	}

}
