package com.jengstrom;

public class Main {

    public static void main(String[] args) {
	    Account jordansAccount = new Account("Jordan");
	    jordansAccount.deposit(1000);
	    jordansAccount.withdraw(500);
	    jordansAccount.withdraw(-200);
	    jordansAccount.deposit(-20);
	    jordansAccount.calculateBalance();
		//jordansAccount.balance = 5000; //error since access modifier is private


        System.out.println("Balance on account is " + jordansAccount.getBalance());

        jordansAccount.calculateBalance();
    }
}
