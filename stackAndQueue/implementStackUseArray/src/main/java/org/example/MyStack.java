package org.example;

public class MyStack {
    int array[];
    int size;
    int index=0;
    public MyStack(int size){
        this.size=size;
        array=new int [size];
    }
    public void push(int element){

        if(isFull()){
            System.out.println("không thêm được");
        }else {
            array[index]=element;
            index++;
        }
    }
    public boolean isFull(){
        if(size==index){
            return true;
        }
        return false;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("không xóa được");
        }
        return array[--index];
    }
    public boolean isEmpty(){
        if(index==0){
        return true;
        }
        return false;
    }
    public int size(){
        return index;
    }


}
