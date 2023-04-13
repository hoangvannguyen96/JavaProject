package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 4, 35, 24, 7, 11, 19, 47};
        boolean check = false;
        int index[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) continue;
            boolean checkall = true;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    checkall = false;
                    break;
                }
            }
            if (checkall) {
                index[count] = i;
                count++;
                check = true;
            }
        }
        if (check) {
            System.out.println("các vị trí có số nguyên tố là:");
            for (int i = 0; i < count; i++) {
                System.out.print(index[i] + " ");
            }
        }else {
            System.out.println("không có vị trí nào có số nguyên tố");
        }
    }
}