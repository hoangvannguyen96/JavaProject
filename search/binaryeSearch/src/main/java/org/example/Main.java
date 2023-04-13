package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr []={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Nhập số cần tìm vị trí?");
        int num=sc.nextInt();
        int index=binarySearch(num,arr);
        if(index==-1){
            System.out.println(num+" không nằm trong mảng");
        }else {
            System.out.println(num+" ở vị trí "+index);
        }
    }
    static int binarySearch(int key,int list []) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}