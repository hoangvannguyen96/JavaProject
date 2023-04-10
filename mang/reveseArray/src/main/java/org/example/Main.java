package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập size của mảng?");
        int size=sc.nextInt();
        int array []=new int[size];
        for(int i=0;i<size;i++){
            array[i]=(int)(Math.random()*20);
            System.out.print(array[i] + " ");
        }
        System.out.println('\n');
        swap(array);
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void swap(int array []){
        for(int i=0;i<array.length/2;i++){
            int temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
}