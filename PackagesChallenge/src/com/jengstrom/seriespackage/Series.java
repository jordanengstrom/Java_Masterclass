package com.jengstrom.seriespackage;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int prod = 1;
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            for (int i = 1; i <= (n-1); i++) {
                prod *= i;
            }
            return prod;
        } else {
            for (int i = 1; i <= (n-1); i++) {
                prod *= i;
            }
            return -1*prod;
        }

    }

    public static int fibonacci(int n) {
        int f_1 = 0;
        int f_2 = 1;
        int next = 0;
        for (int i = 0; i < (n-1); i++) {
            next = f_1 + f_2;
            f_1 = f_2;
            f_2 = next;
        }
        return next;
    }


}
