package com.jordanengstrom;


public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem li) {
        if (this.root == null) {
            // the tree was empty so our item becomes the head of the tree
            this.root = li;
            return true;
        }

        // otherwise, start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(li);
            if (comparison < 0) {
                // new item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there's no node to the right, so add item at this point
                    currentItem.setNext(li);
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, move left if possible
                if (currentItem.prev() != null) {
                    currentItem = currentItem.prev();
                } else {
                    // there's no node at this point, so add if possible
                    currentItem.setPrev(li);
                    return true;
                }
            } else {
                // equal so don't add
                System.out.println(li.getaValue() + " is already present. Item not added.");
                return false;
            }
        }
        // We can't actually get here, but Java complains if there's no return
        return false;
    }

    @Override
    public boolean removeItem(ListItem li) {
        if (li != null) {
            System.out.println("Deleting item " + li.getaValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(li);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.prev();
            } else {
                // we've got the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
            // item is right child of its parent
                parent.setNext(item.prev());
            } else if (parent.prev() == item) {
                // item is left child of its parent
                parent.setPrev(item.prev());
            } else {
                // parent must be the item we're looking for, so parent is root
                this.root = item.prev();
            }
        } else if (item.prev() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.prev() == item) {
                // item is left child of its parent
                parent.setPrev(item.next());
            } else {
                // again, we're deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is not a lot trickier!
            // from the right sub-tree, find the smallest value (which is the left most)
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while (current.prev() != null) {
                leftMostParent = current;
                current = current.prev();
            }
            // now put the smallest value into our Node to be deleted
            item.setaValue(current.getaValue());
            // and delete the smallest
            if (leftMostParent == item) {
                // there was no leftmost node, so 'current' points to smallest
                // node, the one now to be deleted
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null)
                leftMostParent.setPrev(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if (root != null) {
            traverse(root.prev());
            System.out.println(root.getaValue());
            traverse(root.next());
        }
    }
}
