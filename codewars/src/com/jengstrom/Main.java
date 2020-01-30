package com.jengstrom;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        remove("Jordan");
        digitize(1234274721);
    }

    public static void remove(String str) {
        System.out.println(str.substring(1, str.length() - 1));
    }

    public static int[] digitize(long n) {
        String nStr = String.valueOf(n);
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String revn = sb.reverse().toString();
        int arrLength = nStr.length();
        int[] arr = new int[arrLength];
        for (int i=0; i < nStr.length(); i++) {
            arr[i] = Character.getNumericValue(revn.charAt(i));
        }
        return arr;
    }

    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }


    public static List<Integer> sortDesc (int num) {
        List<Integer> intList = new ArrayList<>();

        while (num >= 0) {
            int lastDigit = num % 10;
            intList.add(lastDigit);
            num = num / 10;
            if (num == 0) {
                break;
            }
        }

        return intList;
    }
}
