package com.jengstrom;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Input your integer: \n");
        this.x = x.nextInt();
    }
    public void x() {
        for(int x=1; x<=12; x++) {
            System.out.println(x + " * " + this.x + " = " + (x * this.x));
        }
    }
}
