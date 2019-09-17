package com.jengstrom;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//        System.out.println(hasWhitespace.replaceAll("\\b", "X"));

//      quantifiers:
//      {3} exact number of e's,
//      {2, 5} at least 2 e's but no more than 5
//      + one or more e,
//      * 0 or more e's

//        System.out.println(alphanumeric.replaceAll("^abcDe{3}", "YYY"));
//        System.out.println(alphanumeric.replaceAll("^abcDe+", "YYY"));
//        System.out.println(alphanumeric.replaceAll("^abcDe*", "YYY"));
//        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "YYY"));

//      replace all occurrences of h followed by any i's followed by at least 1 j with a Y
        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(thirdAlphanumericString);
//        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));


//      find all occurrences of an <h2> tag in html text
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something </p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

//        String h2Pattern = ".*<h2>.*";
        String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern);
//      Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//      You can only use a matcher once, then you have to call .reset()
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());


//      How can we find the occurrences and where they occur?
        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : "+ matcher.start() + " to " + matcher.end());
        }

//      The * quantifier is a greedy quantifier, instead we want a lazy quantifier
//      String h2GroupPattern = "(<h2>.*</h2>)";
//      We want to use the lazy quantifier version of * which is *?
        String h2GroupPattern = "(<h2>.*?</h2>)";

        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }
        

//
//
//
    }
}
