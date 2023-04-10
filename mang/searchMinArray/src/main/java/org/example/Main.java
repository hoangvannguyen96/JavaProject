package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ lớn của mảng?");
        int size=sc.nextInt();
        int array[]=new int[size];
        int min=array[0];
        int index=0;
        for(int i=0;i<size;i++){
            array[i]=(int)(Math.random()*200);
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Số nhỏ nhất trong mảng là: "+min(array));
    }
    public static int min(int array[]){
        int index=0;
        for (int i=0;i<array.length;i++){
            if(array[i]<array[index]){
                index=i;
            }
        }
        return array[index];
    }
}