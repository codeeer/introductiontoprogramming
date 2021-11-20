package com.medipol.exercises;

public class While10DanGeriyeSay {

	public static void main(String[] args) {
		
		 // 10'dan geriye doğru giden ve bu sırada sayıları ekrana basan bir Java
        // uygulaması
        int sayac = 10;
        while (sayac >= 1) {
            System.out.println(sayac);
            if(sayac == 5)
            {
            	sayac = 0;
            }
            sayac--;
        }

	}

}
