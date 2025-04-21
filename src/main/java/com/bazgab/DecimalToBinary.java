package com.bazgab;

import java.util.Arrays;

public class DecimalToBinary {

    // To start we will determine how to convert a decimal number to a binary number:
    // For that we will use the formula:
    // Divide the decimal number by 2 recording the remainders, which will be either 0 or 1.
    // All the way until it's still larger than 0.
    // And then we will reverse the numbers to get the final result.
    // Example: Decimal 10 = ? Binary
    // 10 / 2 = 5 (Remainder 0)
    // 5 / 2 = 2.5 (Remainder 1)
    // 2 / 2 = 1 (Remainder 0)
    // 1 / 2 = 0.5 (Remainder 1)
    // Reversed => 1010


    // This function take the decimal Integer as a parameter and returns an array.
    public static int[] DecimalToBinaryCalculation(int d) {
        // We first declare binaryArray to hold the binary value
        int[] binaryArray = new int[5];
        // i is the counter for the array.
        int i = 0;

        while (d > 0) {
            // We record the remainder into the array at index
            binaryArray[i] = d % 2;
            // Then we divide the value by 2
            d = d / 2;
            // And iterate over again
            i++;
        }
        // Then we return the binaryArray to then reverse it.
        return binaryArray;
    }

    // This function will reverse an array for us.
    public static int[] reversedArray(int[] arr) {
        // For reversing an array we will have to loop through (arr.length / 2), meaning, until the middle of the array
        for (int i = 0; i < arr.length / 2; i++) {
            // Set up a temporary int to store values and set it to the i index of the original array that's looping
            // Let's imagine the first number of array {1, 2, 3} as an example;

            int temp = arr[i];
            // int temp = arr[0] = 1
            arr[i] = arr[arr.length - i - 1];
            // 1 = arr[3 - 0 - 1] = arr[2]; which throws it to the last index
            arr[arr.length - i - 1] = temp;
            // arr[2] = temp; and the loop repeats;
        }
        return arr;
    }



    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println("Testing reversedArray function: ");
        System.out.println("Normal array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray(arr)));
        System.out.println("---------------------------------------------------------");
        // Now we can find the Binary number that corresponds to a given decimal.
        int d = 13;
        System.out.println("Converting a decimal to a binary number:");
        System.out.println("Decimal: " + d);
        int[] binaryNumber = DecimalToBinaryCalculation(d);
        System.out.println("Binary: " + Arrays.toString(reversedArray(binaryNumber)));



    }


}
