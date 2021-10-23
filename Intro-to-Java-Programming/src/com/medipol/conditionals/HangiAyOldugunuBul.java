package com.medipol.conditionals;

public class HangiAyOldugunuBul {

	public static void main(String[] args) {
		int ay = 5;
		System.out.println("switch'ten önceki kod kesimi");
		switch (ay) {
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("Şubat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("Mayıs");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7:
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("Ağustos");
			break;
		case 9:
			System.out.println("Eylül");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kasım");
			break;
		case 12:
			System.out.println("Aralık");
			break;
		default:
			System.out.println("Ay 1 - 12 aralığında değil");
		}
		System.out.println("switch'ten sonraki kod kesimi");

	}

}
