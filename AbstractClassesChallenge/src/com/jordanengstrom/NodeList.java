package com.jordanengstrom;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem li);
    boolean removeItem(ListItem li);
    void traverse(ListItem root);
}
