package org.example;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root=null;
    }
    public void preoder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preoder(node.left);
        preoder(node.right);

    }
}
