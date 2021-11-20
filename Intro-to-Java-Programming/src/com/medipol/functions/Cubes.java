package com.medipol.functions;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cubes {

	
	public static int cube(int i) {
		int j = i*i*i;
		return j;
	}
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int k = giris.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.println(i + " "+cube(i));
			
		}
		JOptionPane.showMessageDialog(null,k);
	}

}
