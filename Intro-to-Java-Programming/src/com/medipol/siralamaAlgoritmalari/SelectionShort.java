package com.medipol.siralamaAlgoritmalari;

import java.util.Arrays;
import java.util.Iterator;

public class SelectionShort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,10,6,4,7};
		
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
			System.out.println(i + " " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	

}
