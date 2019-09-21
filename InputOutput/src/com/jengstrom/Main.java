package com.jengstrom;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {

        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

        Scanner scanner = new Scanner(System.in);


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: ");
            for (String exit : exits.keySet()) {
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
                if (inputs.containsKey(d)) {
                    loc = exits.get(inputs.get(d));
                } else if (inputs.containsValue(d)) {
                    for (Map.Entry<String, String> entry : inputs.entrySet()) {
                        if (entry.getValue().equals(d)) {
                            loc = exits.get(d);
                        }
                    }
                } else {
                    System.out.println("You cannot go in that direction.");
                }
            }
        }
    }
}
