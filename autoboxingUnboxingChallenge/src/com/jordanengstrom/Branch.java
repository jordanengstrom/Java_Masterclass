package com.jordanengstrom;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String customerName, double amount) {
        Customer c = new Customer(customerName, amount);
        customers.add(c);
    }

    public void addTransaction(String customerName, double amount) {
        for (int i = 0; i <= this.customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                customers.get(i).addTransaction(amount);
            }
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
}
