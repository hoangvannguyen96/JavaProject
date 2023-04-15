package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, -7, 5, 12, 6};
        System.out.println(Arrays.toString(deleteAllNegativeInArray(arr)));
    }

    public static int[] deleteAllNegativeInArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int brr[] = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                brr[j] = arr[i];
                j++;
            }
        }
        int crr[] = new int[brr.length];
        for (int i = 0; i < brr.length; i++) {
            crr[i] = brr[i];
        }
        return crr;
    }
}