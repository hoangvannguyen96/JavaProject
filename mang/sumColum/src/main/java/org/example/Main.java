package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("nhập cột muốn tính tổng");
        int colums = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colums];
        }
        System.out.println(sum);
    }
}
