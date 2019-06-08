package com.jordanengstrom;

import java.util.ArrayList;
// Able to store, modify, remove and query contact names.
public class MobilePhone {
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public void printMyContacts() {
        if (this.myContacts.size() == 0) {
            System.out.println("No contacts to print. ");
            System.out.println("______________________");
        } else {
            for (int i = 0; i < this.myContacts.size(); i++) {
                System.out.println("_____________ CONTACT #" + (i+1) + " ______________");
                System.out.println("Name: " + myContacts.get(i).getName());
                System.out.println("Number: " + myContacts.get(i).getPhoneNumber());
            }
        }
    }

    public void addContact(Contact c) {
        myContacts.add(c);
    }

    public void deleteContact(Contact c) {
        myContacts.remove(c);
    }

    public void updateContactName(Contact c, String newName) {
        c.setName(newName);
    }

    public void updateContactPhoneNumber(Contact c, int newNumber) {
        c.setPhoneNumber(newNumber);
    }

    public Contact searchContactsByName(String name) {
        Contact result = new Contact();
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                result = myContacts.get(i);
            }
        }
        return result;
    }

    public Contact searchContactsByNumber(int number) {
        Contact result = new Contact();
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getPhoneNumber() == number) {
                result = myContacts.get(i);
            }
        }
        return result;
    }
}
