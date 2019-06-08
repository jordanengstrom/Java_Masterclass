package com.jengstrom;

public class SomeClass {
    private final int instanceNumber = 1;
    private static int classCounter = 0;
    private final String name;

    public SomeClass(String name){
        this.name = name;
        classCounter++;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
