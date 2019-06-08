package com.jordanengstrom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        MobilePhone phone = new MobilePhone();
        boolean x = true;
        Scanner scanner = new Scanner(System.in);

        while (x) {

            printMenu();
            int getMenuItem = scanner.nextInt();;

            switch (getMenuItem) {
                case 1:
                    phone.printMyContacts();
                    break;
                case 2:
                    System.out.println("Adding contact");
                    System.out.println("Enter contact name: ");
                    String name = scanner.next();
                    System.out.println("Enter contact phone number: ");
                    int number = scanner.nextInt();
                    Contact c = new Contact(name, number);
                    phone.addContact(c);
                    System.out.println("Contact added");
                    break;
                case 3:
                    System.out.println("1. Update contact name");
                    System.out.println("2. Update contact phone number");
                    int nameOrNumber = scanner.nextInt();

                    if (nameOrNumber == 1) {
                        System.out.println("Updating contact name");
                        System.out.println("Enter old contact name: ");

                        String oldName = scanner.next();

                        System.out.println("Enter new contact name: ");
                        String newName = scanner.next();

                        Contact result = phone.searchContactsByName(oldName);
                        phone.updateContactName(result, newName);
                        System.out.println("Contact name updated");

                    } else if (nameOrNumber == 2) {
                        System.out.println("Enter old contact phone number: ");
                        int oldNumber = scanner.nextInt();

                        System.out.println("Enter new contact phone number: ");
                        int newNumber = scanner.nextInt();

                        Contact result = phone.searchContactsByNumber(oldNumber);
                        phone.updateContactPhoneNumber(result, newNumber);
                        System.out.println("Contact phone number updated");
                    }
                    break;
                case 4:
                    System.out.println("Who would you like to delete?");
                    System.out.println("Enter contact name: ");

                    String oldName = scanner.next();

                    Contact result = phone.searchContactsByName(oldName);
                    phone.deleteContact(result);
                    System.out.println(oldName + " has been deleted.");
                    break;
                case 5:
                    System.out.println("Who are you searching for?");
                    String searchName = scanner.next();
                    Contact searchResult = phone.searchContactsByName(searchName);
                    System.out.println("Here they are: ");
                    System.out.println("Name: " + searchResult.getName());
                    System.out.println("Number: " + searchResult.getPhoneNumber());
                    break;
                case 6:
                    System.out.println("Bye! Thanks!");
                    x = false;
                    break;
                default:
                    break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. Print contact list");
        System.out.println("2. Add contact");
        System.out.println("3. Update contact");
        System.out.println("4. Delete contact");
        System.out.println("5. Search contact list");
        System.out.println("6. Quit");

    }
}