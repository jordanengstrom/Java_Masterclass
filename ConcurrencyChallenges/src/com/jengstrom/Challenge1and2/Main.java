package com.jengstrom.Challenge1and2;

public class Main {
    public static void main(String[] args) {
        // Challenge 1 is to create and start threads
        final BankAccount account = new BankAccount("12345-678", 1000.00);
        System.out.println("Beginning balance is: 1000.00");

        // Class solution one:
//        Thread thread1 = new Thread() {
//            public void run() {
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//
//        Thread thread2 = new Thread() {
//            public void run() {
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };
//
//        thread1.start();
//        thread2.start();
//
//        account.printAccountBalance(account);

        // Class solution two:
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });

        thread1.start();
        thread2.start();

        account.printAccountBalance(account);

        // My solution:
//        System.out.println("Beginning balance is: 1000");
//        new Thread(() -> {
//            try {
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            } catch (Exception e) {
//                System.out.println("Exception occurred");
//            }
//        }).start();
//
//        new Thread(() -> {
//                try {
//                    account.deposit(203.75);
//                    account.withdraw(100.00);
//                } catch (Exception e) {
//                    System.out.println("Exception occurred");
//                }
//        }).start();


    // Challenge 2: Make the BankAccount class Threadsafe using the synchronize keyword



    }
}
