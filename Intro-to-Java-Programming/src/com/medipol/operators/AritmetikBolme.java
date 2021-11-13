package com.medipol.operators;

public class AritmetikBolme {

	public static void main(String[] args) {
		
		int m = 10;// m  degiskeni int tipinde tanimladik  ve 10 degeri atandi.
		int n = 4; //n degiskeni int tipinde tanimladik ve 4 degeri atadik.
		int p = m / n; // m degiskeni int tipinde tanimladik m yi n ye boluyor degeri p ye atiyor.
		float x = (m / n); // x degiskeni float tipinde tanimliyoruz m yi n ye boluyor sonucunu x e atiyor.
		double y = (m / n); // y degiskeni double tipinde tanimliyoruz m yi ne ye bolup sonucu y ye atiyor.
		System.out.println("p nin degeri = " + p);
		System.out.printf("x in sonucu = %f" , x);
		System.out.printf("y = %f" , y);
	}

}
