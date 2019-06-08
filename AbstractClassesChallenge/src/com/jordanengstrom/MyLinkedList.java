package com.jordanengstrom;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem li) {
        if (this.root == null) {
            // The list was empty so this item becomes the head of the list
            this.root = li;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(li);
            if (comparison < 0) {
                // new item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    System.out.println("There's no next");
                    currentItem.setNext(li).setPrev(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, move left if possible
                if (currentItem.prev() != null) {
                    currentItem.prev().setNext(li).setPrev(currentItem.prev());
                    li.setNext(currentItem).setPrev(li);
                } else {
                    // the node with a previous item is the root
                    li.setNext(this.root).setPrev(li);
                    this.root = li;
                }
                return true;
            } else {
                // equal
                System.out.println(li.getaValue() + " is already present. Item not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem li) {
        if (li != null) {
            System.out.println("deleting item " + li.getaValue());
        }
        ListItem currentItem = this.getRoot();
        while (currentItem != null) {
            int comparison = currentItem.compareTo(li);
            if (comparison == 0) {
                // found item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.prev().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrev(currentItem.prev());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // comparison > 0
                // we are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // we have reached the end of thee list without finding the item to remove
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getaValue());
                root = root.next();
            }
        }
        // This is a recursive version of the same method. Generally
        // using this is not that good because of the variability of
        // list depth. Just FYI
//        if (root != null) {
//            System.out.println(root.getaValue());
//            traverse(root.next());
//        }
    }
}
