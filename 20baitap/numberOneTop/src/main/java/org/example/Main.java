package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 1, 4, 8, 1, 4, 5, 6, 1, 6, 1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        int brr[] = new int[arr.length];
        int crr[] = new int[arr.length - count];
        for (int i = 0; i < count; i++) {
            brr[i] = 1;
        }
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                crr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < crr.length; i++) {
            brr[i + count] = crr[i];
        }
        System.out.println(Arrays.toString(brr));
    }
}