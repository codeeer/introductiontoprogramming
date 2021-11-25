package com.medipol.exams;

public class IfElseIf {

	public static void main(String[] args) {
		int s1 = 60;
		int s2 = 75;
		if (s1 > s2) {
			System.out.println(s1 + " buyuktur " + s2 + " sayisindan");
		} else if (s1 < s2) {
			System.out.println(s1 + " kucuktur " + s2 + " sayisindan");
		} else {
			System.out.println(s1 + " esittir " + s2);
		}
	}

}
