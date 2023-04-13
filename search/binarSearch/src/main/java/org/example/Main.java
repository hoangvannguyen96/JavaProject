package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập vào giá trị cần tìm vị trí?");
        int num = sc.nextInt();
        int index=BinarySearch(num,arr);
        if(index==-1){
            System.out.println(num+" không nằm trong mảng");
        }else {
            System.out.println(num+" ở vị trí "+index);
        }
    }

    static int BinarySearch(int num, int arr[]) {
        int bottom = 0;
        int top = arr.length - 1;
        while (top >= bottom) {
            int mid = (top + bottom) / 2;
            if (num > arr[mid]) {
                bottom = mid + 1;
            }
            if (num == arr[mid]) {
                return mid;
            } else {
                top = mid - 1;
            }
        }
        return -1;
    }
}
