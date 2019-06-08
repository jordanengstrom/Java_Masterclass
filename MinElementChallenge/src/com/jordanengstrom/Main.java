package com.jordanengstrom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        -Write a method called readIntegers() with a parameter called count that represents how many integers the user
//        needs to enter.
//                -The method needs to read from the console until all the numbers are entered, and then return an array
//                containing the numbers entered.
//                -Write a method findMin() with the array as a parameter. The method needs to return the minimum value
//                in the array.
//                -In the main() method read the count from the console and call the method readIntegers() with the
//                count parameter.
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//                -Finally, print the minimum element in the array.
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//                -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name MinElementChallenge

        int arrLength = 5;
        int [] arr = readIntegers(arrLength);
        int answer = sortIntegers(arr);
        System.out.println("The minimum value of the array is: " + answer);
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

    public static int sortIntegers(int[] intArr) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i < intArr.length; i++) {
            int currentVal = intArr[i];
            if (currentVal < min) {
                min = currentVal;
            }
        }
        return min;
    }
}
