package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(addElementInArray(arr)));
    }

    public static int[] addElementInArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị muốn thêm: ");
        int num = sc.nextInt();
        System.out.println("Nhập vị trí muốn chèn: ");
        int index = sc.nextInt();
        if (index < 0 || index > arr.length-1) {
            return arr;
        } else {
            int brr[] = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                brr[i] = arr[i];
            }
            brr[index] = num;
            for (int i = index; i < brr.length - 1; i++) {
                brr[i + 1] = arr[i];
            }
            return brr;
        }
    }
}