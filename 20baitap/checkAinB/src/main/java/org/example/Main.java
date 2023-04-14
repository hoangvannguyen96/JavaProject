package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int brr[] = {3, 4, 4, 2, 6, 7, 1, 5, 3};
        if (checkAInB(arr, brr) == 1) {
            System.out.println("Mảng arr thuộc mảng brr");
        } else {
            System.out.println("Mảng arr không thuộc mảng brr");
        }
    }

    public static int checkAInB(int arr[], int brr[]) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < brr.length; j++) {
                    if (arr[i] == brr[j]) {
                        count++;
                        break;
                    }
                }
                if (count == arr.length) {
                    check = true;
                }
            }
        if (check) {
            return 1;
        } else {
            return 0;
        }
    }
}