package com.jordanengstrom;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        -Write a method called reverse() with an int array as a parameter.
//                -The method should not return any value. In other words, the method is allowed to modify the
//                array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//                -To reverse the array, you have to swap the elements, so that the first element is swapped with the
//                last element and so on.
//
//                -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//        Tip:
//        -Create a new console project with the name ReverseArrayChallenge
    int arrLength = 5;
    int [] orig = readIntegers(arrLength);
    int [] rev = reverse(orig);

    }
    public static int[] readIntegers(int number) {
        int[] integerValues = new int[number];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.\r");
        for(int i=0; i<integerValues.length; i++) {
            integerValues[i] = s.nextInt();
        }
        return integerValues;
    }

    public static int [] reverse(int [] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        int [] copy = new int [arr.length];
        for (int i=0; i < arr.length; i++) {
            copy[i] = arr[arr.length - i - 1];
        }
        System.out.println("Reversed array: " + Arrays.toString(copy));
        return copy;
    }
}
