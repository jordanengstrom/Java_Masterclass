package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account() {
        this("43wevd43twr", 2.50, "default@test.com",
                "Default name", "666-666-6666");

        // this is a special use of the this keyword
        // it must be the first line executed in the constructor function
        // this is how you can set default values without using setters or passing them manually
        // it refers to the one major constructor

        System.out.println("Empty constructor called");
    }

    // THIS IS THE MAJOR CONSTRUCTOR
    public Account(String number, double balance, String customerEmail,
                   String customerName, String customerPhoneNumber) {

        this.number = number;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerName = customerName;
    }

    // As a general rule, don't call setters in the construction function

    // What if we want some values to default, but not others?
    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerEmail, customerName, customerPhoneNumber);
        // You can use this type of constructor function which calls the major constructor
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
