package com.medipol.siralamaAlgoritmalari;

import java.util.Arrays;

public class QuickShort {

	public static void main(String[] args) {
		int[] arr = { 25, 11, 43, 67, 91, 55, 15,82 };
		quickSort(arr, 2, 5);
		//System.out.println(Arrays.toString(quickSort(arr, 2, 5)));

	}

	public static void quickSort(int arr[], int left, int right) {
		   if( left < right ) {
		      int pivotIndex = (int) (left + (right-left)/2);
		      int pivotNewIndex = partition(arr, left, right, pivotIndex);
		      quickSort(arr, left, pivotNewIndex - 1);
		      quickSort(arr, pivotNewIndex + 1, right);
		      System.out.println(Arrays.toString(arr));
		   }
		   //return arr;
		}
		  
		public static int partition(int arr[], int left, int right, int pivotIndex) {
		   int pivotValue = arr[pivotIndex];
		   arr[pivotIndex] = arr[right];
		   arr[right] = pivotValue;
		   int storeIndex = left;
		   for(int i=left; i<right; i++) {
		     if( arr[i] < pivotValue ) {
		        int temp = arr[i];
		        arr[i] = arr[storeIndex];
		        arr[storeIndex] = temp;
		        storeIndex++;
		     }
		   }
		   int temp = arr[right];
		   arr[right] = arr[storeIndex];
		   arr[storeIndex] = temp;
		   return storeIndex;
		}
}
