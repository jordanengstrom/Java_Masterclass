package com.jengstrom;

//Challenge:
//In the following interface declaration, what is the visibility of:
//
//1. the Accessible interface?
//2. the int variable SOME_CONSTANT?
//3. methodA?
//4. methodB and methodC?


interface Accessible {          // 1. The Accessible interface is package-private because it is not declared public
    int SOME_CONSTANT = 100;    // 2. SOME_CONSTANT is public because all interface variables are public static final
    public void methodA();     // 3. methodA is public since it is declared public
    void methodB();            // 4. methodB and methodC are both public since they have no access modifier (this is only
    boolean methodC();         //   the case with interface members, if this were not an interface, it would be package-private)
}