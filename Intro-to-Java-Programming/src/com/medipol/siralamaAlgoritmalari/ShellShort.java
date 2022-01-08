package com.medipol.siralamaAlgoritmalari;

public class ShellShort {

	public static void main(String[] args) {
		int[] a = {13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39};
		for (int increment = a.length / 2; increment > 0; increment = (increment == 2 ? 1
				: (int) Math.round(increment / 2.2))) {
			
			for (int i = increment; i < a.length; i++) {
				int temp = a[i];
				for (int j = i; j >= increment && a[j - increment] > temp; j -= increment) {
					a[j] = a[j - increment];
					a[j - increment] = temp;
				}
			}
		}

	}

}
