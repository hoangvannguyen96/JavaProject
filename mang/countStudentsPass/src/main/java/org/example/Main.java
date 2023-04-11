package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập size mảng");
        int size = sc.nextInt();
        int arr[] = new int[size];
        if (size > 30) {
            System.out.println("size quá giới hạn");
        } else {
            for (int i = 0; i < size; i++) {
                arr[i]=(int)(Math.random()*10);
            }
            int count=0;
            for(int i=0;i<arr.length;i++){
                System.out.println("học sinh "+(i+1)+" có điểm số là: "+arr[i]);
                if(arr[i]>=5&&arr[i]<=10){
                    count++;
                }
            }
            System.out.println("có "+count+" học sinh pass");
        }
    }
}