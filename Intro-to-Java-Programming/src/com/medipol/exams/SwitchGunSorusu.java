package com.medipol.exams;

public class SwitchGunSorusu {

	public static void main(String[] args) {
		int secim = 2;
		switch (secim) {
        case 1 :
            System.out.print("Pazartesi ");
            break;
        case 2 :
            System.out.print("Sali ");
        case 3 :
            System.out.print("Carsamba ");
            break;
        case 4 :
            System.out.print("Persembe ");
            break;
        case 5 :
            System.out.print("Cuma ");
            break;
        case 6 :
            System.out.print("Cumartesi ");
            break;
        case 7 :
            System.out.print("Pazar ");
            break; 
        default :
            System.out.print("Hatali secim! 7 den buyuk gun olamaz.");
            break;	
        }

	}

}
