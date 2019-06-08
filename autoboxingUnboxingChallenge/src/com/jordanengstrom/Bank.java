package com.jordanengstrom;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(String branchName) {
        Branch b = new Branch(branchName);
        branches.add(b);
    }

    public ArrayList<Branch> getBranches() {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = branches.get(i);
            System.out.println("Branch Name: " + branch.getBranchName());
        }
        return  this.branches;
    }

    public void addCustomer(String branchName, String customerName, double amount) {
        for (int i=0; i <= this.branches.size(); i++) {

            if (branches.get(i).getBranchName().equals(branchName)) {
                branches.get(i).addCustomer(customerName, amount);
            }
        }
    }

    public void addTransaction(String branchName, String customerName, double amount) {
        for (int i = 0; i <= this.branches.size(); i++) {

            if (branches.get(i).getBranchName().equals(branchName)) {
                branches.get(i).addTransaction(customerName, amount);
            }
        }
    }

    public void getCustomers(String branchName) {
        for (int i=0; i <= this.branches.size(); i++) {

            if (branches.get(i).getBranchName().equals(branchName)) {
                ArrayList<Customer> customers = branches.get(i).getCustomers();

                for (int j = 0; j <= customers.size(); j++) {
                    System.out.println("Customer # " + (j+1) + " name: " + customers.get(i).getName());
                }
            }
        }
    }

    public void getCustomersTransactions(String branchName, String customerName) {
        for (int i=0; i <= this.branches.size(); i++) {

            if (branches.get(i).getBranchName().equals(branchName)) {
                ArrayList<Customer> customers = branches.get(i).getCustomers();

                for (int j = 0; j <= customers.size(); j++) {

                    if (customers.get(j).getName().equals(customerName)) {
                        System.out.println("Customer name: " + customers.get(i).getName());
                        ArrayList<Double> transactions = customers.get(j).getTransactions();

                        for (int k = 0; k <= transactions.size(); k++) {
                            System.out.println("Transaction #" + (k+1) +" amount: " + transactions.get(k));
                        }
                    }
                }
            }
        }
    }
}
