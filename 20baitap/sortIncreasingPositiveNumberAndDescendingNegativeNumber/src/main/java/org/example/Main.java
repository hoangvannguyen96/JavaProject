package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 5, -3, 4, 2, -8, 0, -4};
        int brr[]=new int[arr.length];
        IncreasingPositiveNumber(arr);
        for(int i=0;i< brr.length;i++){
            brr[i]=arr[i];
        }
        DescendingNegativeNumber(brr);
        System.out.print(Arrays.toString(brr));
    }
    public static void IncreasingPositiveNumber(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >= 0 && arr[j] >= 0 && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void DescendingNegativeNumber(int brr[]){
        for (int i = 0; i < brr.length-1; i++) {
            for (int j = i+1; j < brr.length; j++) {
                if (brr[i] < 0 && brr[j] < 0 && brr[i] < brr[j]) {
                    int temp = brr[i];
                    brr[i] = brr[j];
                    brr[j] = temp;
                }
            }
        }
    }
}