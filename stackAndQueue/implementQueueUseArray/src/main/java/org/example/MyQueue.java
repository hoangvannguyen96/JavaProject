package org.example;

public class MyQueue {
    int capacity;
    int array[];
    int head=0;
    int tail=-1;
    int size=0;
    public MyQueue(int size){
        this.capacity=size;
        array=new int[capacity];
    }
    public boolean isQueueFull(){
        boolean check=false;
        if(size==capacity){
            check= true;
        }
        return check;
    }
    public boolean isQueueEmpty(){
        boolean check=false;
        if(size==0){
            check=true;
        }
        return check;
    }
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;       //trỏ về lại ban đầu
            }
            array[tail] = item;
            size++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + array[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + array[head - 1]);
            }
            size--;
        }
    }
}
