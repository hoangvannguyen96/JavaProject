package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 5, -3, 4, 2, -8, 0, 3, 7, -4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >= 0 && arr[j] >= 0 && arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}