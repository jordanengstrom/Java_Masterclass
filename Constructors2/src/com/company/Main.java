package com.company;

public class Main {

    public static void main(String[] args) {

//        Account jordansAccount = new Account();
//        jordansAccount.withdrawal(100.00);
//
//        jordansAccount.deposit(50.00);
//        jordansAccount.withdrawal(100.00);
//
//        jordansAccount.deposit(51.00);
//        jordansAccount.withdrawal(100.00);
//
//        Account overloadedAccount = new Account("1c2334fui34", 150.00, "test@test.com",
//                "Tes Ting", "555-555-5555");
//        System.out.println(overloadedAccount.getNumber());
//        System.out.println(overloadedAccount.getBalance());
//
//        Account partialDefaults = new Account("Jordan", "jordan.engstrom@gmail.com", "208-861-7679");
//        System.out.println(partialDefaults.getNumber() + " name " + partialDefaults.getCustomerName());



        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", "bob@gmail.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
        System.out.println(person3.getCreditLimit());

    }
}
