package com.jengstrom;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenges {
    public static void main(String[] args) {
//      1. Write the string literal regex that will match the following String. Use the
//      String.matches() method to verify your answer
        String challenge1 = "I want a bike.";
//        System.out.println(challenge1.matches("I want a bike."));

//      2. Now write a regex that will match "I want a bike." and "I want a ball." Verify
//      your answer using the matches() method

        String challenge2 = "I want a ball.";
//        System.out.println(challenge2.matches("(I want a bike)|(I want a ball.)"));
        String regEXp = "I want a \\w+";
//        System.out.println(challenge1.matches(regEXp));
//        System.out.println(challenge2.matches(regEXp));
        String regexp1 = "I want a (bike|ball).";

//      3. Do the same as above but with Matcher and Pattern objects
        String iWantA = "I want a \\w+. ";
        Pattern pattern = Pattern.compile(iWantA);
        Matcher matcher1 = pattern.matcher(challenge1);
//        System.out.println(matcher1.matches());

        Matcher matcher2 = pattern.matcher(challenge2);
//        System.out.println(matcher2.matches());

//      4. Replace all occurrences of blank with an underscore for the following string.
//      Print out the resulting string.
        String challenge4 = "Replace all blanks with underscores.";
//        System.out.println(challenge4.replaceAll("\\s", "_"));

//      5. Write a regex that will match the following string in its entirety. Use the
//      String.matches() method to verify your answer.
        String challenge5 = "aaabcccccccdddefffg";
//        System.out.println(challenge5.matches(".*"));

//      6. Write a regex that will only match the challenge 5 string in its entirety
//        System.out.println(challenge5.matches("^a{3}bc{7}d{3}ef{3}g$"));

//      7. Write a regular expression that will match a string that starts with a series
//      of letters. The letters must be followed by a period. After the period, there
//      must be a series of digits. The string "kjisl.22" would match. The string
//      "f5.12a" would not. Use this string to test your regular expression.
        String challenge7 = "abcd.135";
        String test1 = "kjisl.22";
        String test2 = "f5.12a";
        String pattern2 = "^(?i)[a-z]+\\.\\d+$";
        System.out.println(challenge7.matches(pattern2));
        System.out.println(test1.matches(pattern2));
        System.out.println(test2.matches(pattern2));
    }
}
