package org.example;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200);
        }
//        System.out.println(Arrays.toString(arr));
        StopWatch see = new StopWatch();
        see.start();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        see.stop();
        System.out.println("quá trình sắp xếp diễn ra trong " + see.getElapsedTime().toMillis());
    }
}
