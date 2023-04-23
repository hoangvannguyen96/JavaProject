package org.example;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        this.element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.element = new Object[capacity];
        this.size = 0;
    }

    public void ensureCapacity(int minCapacity) {
        int temp = element.length;
        if ( temp< minCapacity) {
            int array = temp * 2;
            if (array < minCapacity) {
                array = minCapacity;
            }
            element = Arrays.copyOf(element, array);
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            ensureCapacity(size + 1);
            System.arraycopy(this.element, index, this.element, index + 1, size - index);
            this.element[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size - (index + 1) > 0) {
            System.arraycopy(element, index + 1, element, index, size - (index + 1));
        }
        size--;
        element[size]=null;
        return (E) element[index];
    }
    public int size(){
        return size;
    }
    public MyList <E> clone(){
        MyList <E> clone=new MyList<E>(size);
        System.arraycopy(element,0,clone,0,size);
        return clone;
    }
    public int indexOf(E o){
        if(o==null){
            for(int i=0;i<size;i++){
                if(element[i]==null){
                    return i;
                }
            }
        }else {
            for(int i=0;i<size;i++){
                if(element[i]==o){
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean contains(E o){
        return indexOf(o)>=0;
    }
    public boolean add(E e){
        ensureCapacity(size+1);
        element[size++]=e;
        return true;
    }
    public E get(int i){
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) element[i];
    }
    public void clear(){
        for(int i=0;i<size;i++){
            element[i]=null;
        }
        size=0;
    }

}
