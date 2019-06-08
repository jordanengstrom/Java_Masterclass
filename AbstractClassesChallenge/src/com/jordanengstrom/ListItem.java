package com.jordanengstrom;

public abstract class ListItem {
    // For this challenge, create an abstract class to define items that can be stored in a list.
    // The class should contain 2 references to items which will represent the next and previous
    // items (in the case of a linked list).
    // I.e., if you call your abstract class ListItem, then it would have 2 member variables of
    // type ListItem that will hold references to the next/right and previous/left ListItems.

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object aValue;

    public ListItem(Object aValue) {
        this.aValue = aValue;
    }

    public abstract ListItem next();
    public abstract ListItem setNext(ListItem li);
    public abstract ListItem prev();
    public abstract ListItem setPrev(ListItem li);

    // You should also specify a compareTo() method that takes a parameter of the same type as the
    // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
    // the parameter and less than zero if it sorts less than the parameter.
    abstract int compareTo(ListItem li);

    public Object getaValue() {
        return aValue;
    }

    public void setaValue(Object aValue) {
        this.aValue = aValue;
    }
}
