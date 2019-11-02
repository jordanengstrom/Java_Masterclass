package com.jengstrom;

public class Main {

    public static void main(String[] args) {
	    System.out.println(greet("George", "George"));
    }

    public static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }
}
