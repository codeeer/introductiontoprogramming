package com.medipol.siralamaAlgoritmalari;

public class BubbleShort {

	public static void main(String[] args) {
		int[] arr = { 25, 11, 43, 67, 91, 55, 15,82 };
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);

	}

}
