package org.example;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=new Node(27);
        binaryTree.root.left=new Node(14);
        binaryTree.root.right=new Node(35);
        binaryTree.root.left.left=new Node(10);
        binaryTree.root.left.right=new Node(19);
        binaryTree.root.right.left=new Node(31);
        binaryTree.root.right.right=new Node(42);
        binaryTree.postorder(binaryTree.root);
    }
}