package com.medipol.siralamaAlgoritmalari;

public class MergeShort {

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

	}

	public static int[] mergeSort(int arr[]) {
		if (arr.length <= 1) {
			return arr;
		} else {
			int middle = (int) (arr.length / 2);
			int left[] = new int[middle];
			int right[] = new int[arr.length - middle];
			for (int i = 0; i < middle; i++) {
				left[i] = arr[i];
			}
			for (int i = middle; i < arr.length; i++) {
				right[i - middle] = arr[i];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			int result[] = merge(left, right);
			return result;
		}
	}

	public static int[] merge(int left[], int right[]) {
		int result[] = new int[left.length + right.length];
		int i = 0, posLeft = 0, posRight = 0;
		while (left.length > posLeft && right.length > posRight) {
			if (left[posLeft] <= right[posRight]) {
				result[i] = left[posLeft];
				posLeft++;
			} else {
				result[i] = right[posRight];
				posRight++;
			}
			i++;
		}
		if (left.length > posLeft) {
			for (; posLeft < left.length; posLeft++) {
				result[i] = left[posLeft];
				i++;
			}
		}
		if (right.length > posRight) {
			for (; posRight < right.length; posRight++) {
				result[i] = right[posRight];
				i++;
			}
		}
		return result;
	}

}
