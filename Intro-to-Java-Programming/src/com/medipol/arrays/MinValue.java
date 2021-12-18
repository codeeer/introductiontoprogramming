package com.medipol.arrays;

public class MinValue {

    private static int minValue(int[] myArray) {
        int minValue = myArray[0];
        int arrayLength = myArray.length;
        for (int i = 1; i <= arrayLength - 1; i++) {
            int value = myArray[i];
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] JavaArray = {28, 46, 69, 10};
        System.out.println("The min value in the array: " + minValue(JavaArray));
    }
}
