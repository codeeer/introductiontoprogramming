package com.medipol.siralamaAlgoritmalari;

public class InsertionShort {

	public static void main(String[] args) {
		int[] arr = {2,4,5,3,1,6};
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = value;
		}

	}

}
