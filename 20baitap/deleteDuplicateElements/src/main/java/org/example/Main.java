package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, -7, 7, -6, -1, 7};
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i]) {
                num=arr[i];
                count++;
            }
        }
        if(count>=2){
            System.out.println(num);
        }
//        System.out.println(Arrays.toString(deleteAllNegativeInArray(arr)));
    }

//    public static int[] deleteAllNegativeInArray(int arr[]) {
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        int num=sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == arr[i]) {
//                num=arr[i];
//                count++;
//            }
//        }
//        if(count>=2){
//            System.out.println(num);
//        }
//        int brr[] = new int[arr.length - count];
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (arr[i] >= 0) {
//                brr[j] = arr[i];
//                j++;
//            }
//        }
//        int crr[] = new int[brr.length];
//        for (int i = 0; i < brr.length; i++) {
//            crr[i] = brr[i];
//        }
//        return crr;
//    }
}