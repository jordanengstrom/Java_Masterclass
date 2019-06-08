package com.jordanengstrom;

public class Node extends ListItem {

    public Node(Object aValue) {
        super(aValue);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem li) {
        this.rightLink = li;
        return this.rightLink;
    }

    @Override
    public ListItem prev() {
        return this.leftLink;
    }

    @Override
    public ListItem setPrev(ListItem li) {
        this.leftLink = li;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem li) {
        if (li != null) {
            return ((String) super.getaValue()).compareTo( (String) li.getaValue());
        } else {
            return -1;
        }
    }
}
