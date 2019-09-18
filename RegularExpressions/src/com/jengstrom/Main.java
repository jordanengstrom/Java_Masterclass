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

//      Replace aei only if followed by an f or b
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
//        System.out.println(matcher.matches());


//      How can we find the occurrences and where they occur?
        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
//            System.out.println("Occurrence " + count + " : "+ matcher.start() + " to " + matcher.end());
        }

//      The * quantifier is a greedy quantifier, instead we want a lazy quantifier
//      String h2GroupPattern = "(<h2>.*</h2>)";
//      We want to use the lazy quantifier version of * which is *?
        String h2GroupPattern = "(<h2>.*?</h2>)";

        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
//        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
//            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
//            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

//      "abc" means "a" and "b" and "c"
//      [Hh]arry means "H" or "h"
//        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
//        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

//      [^abc] means NOT when in square brackets
//      find all the t's that are NOT followed by v
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
//      Using a "Negative Look Ahead Expression" instead:
        String tNotVRegExp = "t(?!v)";
//      All matches of t followed by v: (?=v) --> "Positive Look Ahead Expression"
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while(tNotVMatcher.find()) {
            count++;
//            System.out.println("Occurrence " + count + ": " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
//      Regex for US Phone Number:
//      ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890"; // shouldn't match
        String phone2 = "(123) 456-7890";  // matcch
        String phone3 = "123 456-7890";  //shouldn't match
        String phone4 = "(123)456-7890"; // shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

//      Regex for general visa card numbers:
//      ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444"; // should match
        String visa4 = "4444"; // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));

    }
}
