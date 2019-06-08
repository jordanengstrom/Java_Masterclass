package com.jengstrom;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

	Scanner scanner = new Scanner(System.in);

	Map<String, Integer> tempExit = new HashMap<String, Integer>();
	locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExit));

	tempExit = new HashMap<String, Integer>();
    tempExit.put("W", 2);
    tempExit.put("E", 3);
    tempExit.put("S", 4);
    tempExit.put("N", 5);
    locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

    tempExit = new HashMap<String, Integer>();
    tempExit.put("N", 5);
    locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

    tempExit = new HashMap<String, Integer>();
    tempExit.put("W", 1);
    locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

    tempExit = new HashMap<String, Integer>();
    tempExit.put("N", 1);
    tempExit.put("W", 2);
    locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

    tempExit = new HashMap<String, Integer>();
    tempExit.put("S", 1);
    tempExit.put("W", 2);
    locations.put(5, new Location(5, "You are in the forest", tempExit));

    int loc = 1;
    while(true) {
        System.out.println(locations.get(loc).getDescription());
        if (loc == 0) {
            break;
        }

        Map<String, Integer> exits = locations.get(loc).getExits();
        System.out.print("Available exits are: ");
        for(String exit: exits.keySet()) {
            System.out.print(exit + ", ");
        }
        System.out.println();

        // MY SOLUTION TO THE CHALLENGE
        String[] direction = scanner.nextLine().toUpperCase().split(" ");

        Map<String, String> inputs = new HashMap<String, String>();
        inputs.put("WEST", "W");
        inputs.put("NORTH", "N");
        inputs.put("SOUTH", "S");
        inputs.put("EAST", "E");
        inputs.put("QUIT", "Q");

        for (String d : direction) {
            if(inputs.containsKey(d)) {
                loc = exits.get(inputs.get(d));
            } else if (inputs.containsValue(d)) {
                for(Map.Entry<String, String> entry : inputs.entrySet()) {
                    if(entry.getValue().equals(d)) {
                        loc = exits.get(d);
                    }
                }
            } else {
                System.out.println("You cannot go in that direction.");
            }
        }

//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for(String i : building) {
//            System.out.println(i);
//        }

//        if(exits.containsKey(direction)) {
//            loc = exits.get(direction);
//        } else {
//            System.out.println("You cannot go in that direction");
//        }
    }

//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        System.out.println(road.getClass());
//        for(String i : road) {
//            System.out.println(i);
//        }
//        System.out.println("==========================================================================================");
//
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for(String i : building) {
//            System.out.println(i);
//        }
    }
}
