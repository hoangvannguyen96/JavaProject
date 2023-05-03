package org.example;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root=null;
    }
    public boolean search(int data) {
        Node search = root;
        while (search != null) {
            if (data == search.data) {
                return true;
            } else if (data < search.data) {
                search = search.left;
            } else {
                search = search.right;
            }
        }
        return false;
    }
}
