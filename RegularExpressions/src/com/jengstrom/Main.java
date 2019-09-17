package com.jengstrom;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a string. Yes, I am.";
	    String yourString = string.replaceAll("I", "You");
////        System.out.println(yourString);

        String alphanumeric = "abcDeeefe3DbbbbbbN20348dsl";
////        System.out.println(alphanumeric.replaceAll(".", "Y"));
////        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeefe3DbbbabcDeeebbbN20348dsl";
////        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

//      .matches() MEANS THE WHOLE STRING MUST MACH
//        System.out.println(alphanumeric.matches("^hello"));
//        System.out.println(alphanumeric.matches("^abcDeee"));
//        System.out.println(alphanumeric.matches("abcDeeefe3DbbbbbbN20348dsl"));

//        System.out.println(alphanumeric.replaceAll("N20348dsl$", "THE END"));

//      Square brackets looks for each individual character, and not the set of characters
//        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
//        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));

//      Replace aei only if followed by an f or j
//        System.out.println(alphanumeric.replaceAll("[aei][fb]", "X"));

//      Look for harry and make upper case if not already
//        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

//      Replace every letter by the e and the s
        String newAlphanumeric = "abcDeeefe3DbbbbbbN20348dsl";
//        System.out.println(newAlphanumeric.replaceAll("[^es]", "X"));

//      Replace all the characters A-F and 3-8 inclusive
//        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
//        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X"));
//        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
//      The special construct (?i) removes case sensitivity
//        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

//      Replace all digits in the string
//        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
//        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));

//      Replace all non-digits
//        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

//      Removing all whitespace everywhere
        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
//        System.out.println(hasWhitespace);
//        System.out.println(hasWhitespace.replaceAll("\\s", ""));
//        System.out.println(hasWhitespace.replaceAll("\t", "X"));

//      Removing all non-whitespace characters
//        System.out.println(hasWhitespace.replaceAll("\\S", ""));

//      \\w replaces a-z, A-Z, 0-9, and _
//      \\W replaces anything BUT a-z, A-Z, 0-9, and _
//        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
//        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        
//      \\b replaces word boundaries
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));
//
//
    }
}
