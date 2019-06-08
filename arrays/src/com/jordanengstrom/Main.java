package com.jordanengstrom;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ARRAY CHALLENGE
        //------------------------------------------------------------------------------------------
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] input = getIntegers(5);
        printArray(input);

        int[] output = sortIntegers(input);
        printArray(output);
    }
    public static int[] getIntegers(int number) {
        int[] integerValues = new int[number];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");
            for(int i=0; i<integerValues.length; i++) {
                integerValues[i] = s.nextInt();
            }
        return integerValues;
    }

    public static void printArray(int[] integerValues) {
        System.out.println(Arrays.toString(integerValues));
    }

    public static int[] sortIntegers(int[] intArr) {
        int[] out = new int[intArr.length];
        // copy the array
        for (int i = 0; i < intArr.length - 1; i++) {
            out[i] = intArr[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < out.length - 1; i++) {
                if (out[i] < out[i+1]) {
                    temp = out[i];
                    out[i] = out[i+1];
                    out[i+1] = temp;
                    flag = true;
                }
            }
        }
        return out;
    }
}
