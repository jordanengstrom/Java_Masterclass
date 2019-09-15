package com.jengstrom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // There are two main approaches to error handling:
        // 1. Look before you leap (LBYL)
        // 2. Easier to ask for forgiveness than for permission (EAFP)
        // An example of each is below
        // LBYL is most common in Java, but each method has its own advantages and disadvantages

//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));

//        int x = getIntLBYL();
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getIntEAFP() {
        System.out.println("Pick an integer: ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch(InputMismatchException e) {
            return 0;
        }
    }

    private static int getInt() {
        System.out.println("Pick an integer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        System.out.println("Pick an integer: ");
        Scanner scanner = new Scanner(System.in);
        Boolean isValid = true;
        String input = scanner.next();
        for (int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
