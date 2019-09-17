package com.jengstrom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenges {
    public static void main(String[] args) {
//         ============== CHALLENGES ===============
//         1. Convert the following anonymous class into a lambda expression
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for(String part : parts) {
//                    System.out.println(part);
//                }
//            }
//        }

        Runnable runnable = (() -> {
            String[] parts = "Let's split this up into an array".split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        });

//    2. Write the following method as a lambda expression. Don't worry about assigning it to anything.
//    public static String everySecondChar(String source){
//        StringBuilder returnVal = new StringBuilder();
//        for(int i = 0; i < source.length(); i++) {
//            if(i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//        return returnVal.toString();
//    }

        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

//   3. Write the code that will execute the function from 2. with an argument of "1234567890"
        System.out.println(lambdaFunction.apply("1234567890"));

//   5. Using the result from 4, call the method with the lambdaFunction we created earlier and the string
//   "1234567890". Print the result returned from the method
        String results = everySecondChar(lambdaFunction, "1234567890");
        System.out.println(results);

//   6. Now write a lambda expression that maps to the java.util.Supplier interface. This lambda should return the
//   string "I love Java!" Assign it to a variable called iLoveJava
        Supplier<String> iLoveJava = ()-> "I love Java!";

//   7. Use the supplier from 6 to assign the string "I love Java!" to a variable called supplierResult, then
//   print the variable to the console
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

//   8. There are many interfaces in the Java SDK, and sometimes we can use a lambda expression instead of
//   creating an instance that implements the interface we want to use. Given a specific interface, how can
//   we tell whether we can map a lambda expression to it? What's the criteria that has to be met?

//      The interface has to be a functional interface. It can have only a single method that must be
//      implemented. A functional interface can contain more than one method, but all the methods but
//      one must have default implementations

//      Question: With that in mind, can we use a lambda expression to represent an instance of the
//      java.util.concurrent.Callable interface? Hint: You'll have to check the documentation. As a Java developer,
//      you have to be comfortable with looking up and reading documentation.
//      The Callable documentation can be found here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html

//      Yes you can because it is a functional interface.

//      Question: Is the java.util.Comparator interface a functional interface?
//
//      Yes


//   9. Suppose we have the following list of the top 5 male and female names for 2015:
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
//      Write code to print the items in the list in sorted order, and with the first letter in each name
//      upper-cased. The name "harry" should be printed as "Harry" and should be printed after "Emily" and
//      before "Isla". Use lambda expressions wherever possible.

        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames2015.forEach(name -> firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
//        firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));
//        firstUpperCaseList.forEach(s -> System.out.println(s));

//   10. Change 9 so that it uses method references. Remember that a method reference looks like Class::MethodName
//        topNames2015.forEach(name ->
//                firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
//                firstUpperCaseList.sort(String::compareTo);
//                firstUpperCaseList.forEach(System.out::println);

//   11. Now do the same thing using streams
//        topNames2015
//                .stream()
//                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);

//   12. Instead of printing out the sorted names, print out how many names begin with the letter 'A' instead
        long namesBeginningWithA = topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Number of names beginning with A is: " + namesBeginningWithA);

//   13. Let's go back to the previous of the version of the code, when we were printing out the sorted names.
//   Let's suppose we want to debug what's going on when the chain is executed. Instead of printing out the names
//   at the end of the chain, maybe we're not sure the code that uppercases the first letter is working correctly.
//   Let's use peek() to print out the names after the map() method has executed. What will the following code
//   print to the console?
//
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo);

//         Nothing is printed because the chain does not contain a terminal operation.


//   14. Add a terminal operation to this chain so that the peek call will execute.
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count();
    }

// 4. Write a method called everySecondCharacter that accepts the function as a parameter and executes it
// with an argument "1234567890"
    public static String everySecondChar(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
