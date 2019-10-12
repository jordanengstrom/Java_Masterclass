package com.jengstrom;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTestParameterized {
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;


    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @BeforeEach
    public void setup() {
        account = new BankAccount("Jordan", "Engstrom", 1000.00, BankAccount.CHECKING);
    }

//    @ParameterizedTest
//    @ValueSource(
////    public static Collection<Object> testConditions() {
////        return Arrays.asList(new Object[][] {
//            {
//                {100.00, true, 1100.00},
//                {200.00, true, 1200.00},
//                {325.14, true, 1325.14},
//                {489.33, true, 1489.33},
//                {1000.00, true, 2000.00}
//            }
//        );
//    })

    @ValueSource
    public void deposit() throws Exception {
        double balance = account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), 0);
        // delta parameter is for error
    }
}
