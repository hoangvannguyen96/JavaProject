package org.example;

public class Queue {
    Node front;
    Node rear;
    public Queue(){
        front=rear=null;
    }
    public void enQueue(int data){
        Node node=new Node(data);
        if(front == null){
            front=rear=node;
            rear.link=front;
        }else {
            rear.link=node;
            rear=node;
            rear.link=front;
        }
    }
    public Node deQueue(){
        Node temp=front;
        if(front==null){
            return null;
        }
        if(front==rear){
            front=rear=null;
        }else {
            front=front.link;
            rear.link=front;
        }
        return temp;
    }
    public void displayQueue(){
        Node temp=front;
        if(front==null){
            System.out.println("rỗng");
        }else {
            while (temp.link!=front){
                System.out.println(temp.data);
                temp=temp.link;
            }
        }
    }
}
