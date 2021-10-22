package com.medipol.exercises;

public class StaticDegisken {
	
	static int sayac; //sayac adındaki değişkenimi static ifadesi ile oluşturdum
	
	public static void main(String[] args) {
		// Sayacımı arttır komutu
		sayac++;
		
		System.out.println(sayac);

		// arttırmayı tekrarlıyorum
		// ... bellek temizlenmediği için aynısının üzerinden sayar
		sayac++;
		System.out.println(sayac);
	    }

}
