package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 13, 6, 10, 9};
        System.out.println(Arrays.toString(addElementInArray(arr)));
    }

    public static int[] addElementInArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị muốn thêm: ");
        int num = sc.nextInt();
        int index = 0;
        for (; index < arr.length; ) {
            if (arr[index] < num) {
                index++;
            }else break;
        }
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